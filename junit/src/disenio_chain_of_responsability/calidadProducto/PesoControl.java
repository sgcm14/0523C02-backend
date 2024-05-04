package disenio_chain_of_responsability.calidadProducto;

public class PesoControl extends ControlCalidad {
    @Override
    public void verificar(Articulo articulo) {
        if (articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300) {
            if (siguienteControl != null) {
                siguienteControl.verificar(articulo);
            } else {
                System.out.println("El artículo fue aceptado.");
            }
        } else {
            System.out.println("El artículo fue rechazado: problema con el peso.");
        }
    }
}
