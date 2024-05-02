package disenio_template_method.Empleados;

public class LiquidadorSueldoContratado extends LiquidadorSueldo{
    @Override
    protected double calcularSueldo(Empleado empleado) {
        double sueldo= 0;
        if(empleado instanceof EmpleadoContratado){
            EmpleadoContratado empleadoContratado = (EmpleadoContratado) empleado;
            sueldo = empleadoContratado.getCantidadHorasTrabajadas() * empleadoContratado.getPrecioPorHora();
        }
        return sueldo;
    }

    @Override
    protected String imprimirSueldo(Empleado empleado) {
        return "La liquidación generada es un documento digital.";
    }
}
