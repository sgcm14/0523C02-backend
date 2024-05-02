package disenio_template_method.Menu;

public abstract class Menu {
    double precioBase;

    public Menu(double precioBase) {
        this.precioBase = precioBase;
    }

    public void prepararMenu(){
        armarMenu();
        double costoFinal= calcularCosto();
        informarCosto(costoFinal);
    }

    protected abstract void armarMenu();
    protected abstract double calcularCosto();


    private void informarCosto(double costo) {
        System.out.println("El costo final del menú vendido es: $" + costo);
    }

}
