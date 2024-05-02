package disenio_template_method.Empleados;

public abstract class LiquidadorSueldo {

    public String liquidarSueldo(Empleado empleado){
        String responseSueldo = "La liquidación no pudo ser calculada.";
        double sueldo = calcularSueldo(empleado);
        if(sueldo>0){
            String imprimirMensaje=imprimirSueldo(empleado);
            responseSueldo=imprimirMensaje +" Saldo a liquidar: "+sueldo;
        }
        return responseSueldo;
    }

    protected abstract double calcularSueldo(Empleado empleado);
    protected abstract String imprimirSueldo(Empleado empleado);

    public String depositarSueldo(Empleado empleado){
        return "El depósito se realizó en la cuenta: " + empleado.getNumeroCuenta();
    }

}
