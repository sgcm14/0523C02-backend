package disenio_chain_of_responsability.calidadProducto;

public class LoteControl extends ControlCalidad {
    @Override
    public void verificar(Articulo articulo) {
        if (articulo.getLote() >= 1000 && articulo.getLote() <= 2000) {
            if (siguienteControl != null) {
                siguienteControl.verificar(articulo);
            } else {
                System.out.println("El artículo fue aceptado.");
            }
        } else {
            System.out.println("El artículo fue rechazado: problema con el lote.");
        }
    }
}
