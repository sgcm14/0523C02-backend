package disenio_template_method.Empleados;

public class LiquidadorSueldoEfectivo extends LiquidadorSueldo{
    @Override
    protected double calcularSueldo(Empleado empleado) {
        double sueldo= 0;
        if(empleado instanceof EmpleadoEfectivo){
            EmpleadoEfectivo empleadoEfectivo = (EmpleadoEfectivo) empleado;
            sueldo = empleadoEfectivo.getSueldoBasico()+empleadoEfectivo.getPremio()-empleadoEfectivo.getDescuento();
        }
        return sueldo;
    }

    @Override
    protected String imprimirSueldo(Empleado empleado) {
        return "La liquidación generada es un documento impreso.";
    }
}
