package disenio_chain_of_responsability.calidadProducto;

public class AnalistaDeCalidad {
    private ControlCalidad controlInicial;

    public AnalistaDeCalidad(ControlCalidad controlInicial) {
        this.controlInicial = controlInicial;
    }

    public void validarCalidadDelProducto(Articulo articulo) {
        controlInicial.verificar(articulo);
    }
}
