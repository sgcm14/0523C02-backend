package disenio_template_method.Menu;

public class MenuVegetariano extends Menu {
    private final int cantidadEspecias;
    private final int cantidadSalsas;

    public MenuVegetariano(double precioBase, int cantidadEspecias, int cantidadSalsas) {
        super(precioBase);
        this.cantidadEspecias = cantidadEspecias;
        this.cantidadSalsas = cantidadSalsas;
    }

    @Override
    protected void armarMenu() {
        System.out.println("Armando paquete del Menú Vegetariano...");
        System.out.println("El precio base es "+precioBase);
        System.out.println("Se añadio "+cantidadEspecias+" especias");
        System.out.println("Se añadio "+cantidadSalsas+" salsas vegetarianas");
    }

    @Override
    protected double calcularCosto() {
        return precioBase +0.01+ (cantidadSalsas*2) ;
    }
}
