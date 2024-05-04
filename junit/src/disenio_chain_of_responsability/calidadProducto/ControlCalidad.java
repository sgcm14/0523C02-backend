package disenio_chain_of_responsability.calidadProducto;

public abstract class ControlCalidad {
    protected ControlCalidad siguienteControl;

    public abstract void verificar(Articulo articulo);
    public void setSiguienteControl(ControlCalidad siguienteControl) {
        this.siguienteControl = siguienteControl;
    }

}
