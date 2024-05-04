package disenio_chain_of_responsability.calidadProducto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalistaDeCalidadTest {

    @Test
    void validarCalidadDelProducto() {
        // Crear controles
        LoteControl loteControl = new LoteControl();
        PesoControl pesoControl = new PesoControl();
        EnvaseControl envaseControl = new EnvaseControl();

        // Configurar la cadena de responsabilidad
        loteControl.setSiguienteControl(pesoControl);
        pesoControl.setSiguienteControl(envaseControl);

        // Crear el analista de calidad con el primer control en la cadena
        AnalistaDeCalidad analista = new AnalistaDeCalidad(loteControl);

        // Artículo aceptable
        Articulo articulo1 = new Articulo("Producto1", 1500, 1250, "sano");
        analista.validarCalidadDelProducto(articulo1);

        // Artículo con lote incorrecto
        Articulo articulo2 = new Articulo("Producto2", 500, 1250, "sano");
        analista.validarCalidadDelProducto(articulo2);

        // Artículo con peso incorrecto
        Articulo articulo3 = new Articulo("Producto3", 1500, 1400, "sano");
        analista.validarCalidadDelProducto(articulo3);

        // Artículo con envase incorrecto
        Articulo articulo4 = new Articulo("Producto4", 1500, 1250, "roto");
        analista.validarCalidadDelProducto(articulo4);
    }
}