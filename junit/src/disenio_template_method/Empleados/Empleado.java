package disenio_template_method.Empleados;

public class Empleado {
    private String nombre;
    private String apellido;
    private String numeroCuenta;

    public Empleado(String nombre, String apellido, String numeroCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}
