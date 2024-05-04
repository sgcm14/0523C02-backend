package disenio_chain_of_responsability.calidadProducto;

public class EnvaseControl extends ControlCalidad {
    @Override
    public void verificar(Articulo articulo) {
        if (articulo.getEnvasado().equals("sano") || articulo.getEnvasado().equals("casi sano")) {
            if (siguienteControl != null) {
                siguienteControl.verificar(articulo);
            } else {
                System.out.println("El artículo fue aceptado.");
            }
        } else {
            System.out.println("El artículo fue rechazado: problema con el envase.");
        }
    }
}
