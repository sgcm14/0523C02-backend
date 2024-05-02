package disenio_template_method.Empleados;

public class EmpleadoEfectivo extends Empleado {
    private double sueldoBasico;
    private double descuento;
    private double premio;

    public EmpleadoEfectivo(String nombre, String apellido, String numeroCuenta, double sueldoBasico, double descuento, double premio) {
        super(nombre, apellido, numeroCuenta);
        this.sueldoBasico = sueldoBasico;
        this.descuento = descuento;
        this.premio = premio;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getPremio() {
        return premio;
    }
}
