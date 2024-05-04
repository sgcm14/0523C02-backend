package disenio_template_method.pizzeria;

public class CocineroNoVeggie extends Cocinero {
    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando queso y fetas de jamon,");
    }

    @Override
    protected void agregarIngredientes() {
        System.out.println("Agregando los ingredientes");
    }
}
