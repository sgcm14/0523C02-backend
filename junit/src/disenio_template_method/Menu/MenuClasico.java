package disenio_template_method.Menu;

public class MenuClasico extends Menu{
    public MenuClasico(double precioBase) {
        super(precioBase);
    }

    @Override
    protected void armarMenu() {
        System.out.println("Armando paquete del Menú Clasico...");
        System.out.println("El precio base es "+precioBase);
    }

    @Override
    protected double calcularCosto() {
        return precioBase;
    }
}
