package disenio_template_method.Menu;

public class MenuInfantil extends Menu{
    private final int cantidadJuguetes;

    public MenuInfantil(double precioBase, int cantidadJuguetes) {
        super(precioBase);
        this.cantidadJuguetes = cantidadJuguetes;
    }

    @Override
    protected void armarMenu() {
        System.out.println("Armando paquete del Menú Infantil...");
        System.out.println("El precio base es "+precioBase);
        System.out.println("Se añadio "+cantidadJuguetes+" juguetes");
    }

    @Override
    protected double calcularCosto() {
        return precioBase + (cantidadJuguetes*3) ;
    }
}
