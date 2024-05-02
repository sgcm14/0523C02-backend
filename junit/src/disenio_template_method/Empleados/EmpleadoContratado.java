package disenio_template_method.Empleados;

public class EmpleadoContratado extends Empleado{
    private Integer cantidadHorasTrabajadas;
    private double precioPorHora;

    public EmpleadoContratado(String nombre, String apellido, String numeroCuenta, Integer cantidadHorasTrabajadas, double precioPorHora) {
        super(nombre, apellido, numeroCuenta);
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
        this.precioPorHora = precioPorHora;
    }

    public Integer getCantidadHorasTrabajadas() {
        return cantidadHorasTrabajadas;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }
}
