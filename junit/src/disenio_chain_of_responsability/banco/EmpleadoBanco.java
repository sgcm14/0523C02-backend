package disenio_chain_of_responsability.banco;

public abstract class EmpleadoBanco {
    private EmpleadoBanco sigEmpleadoBanco;
    public abstract void procesarSolicitud(Integer monto);

    public void setSigEmpleadoBanco(EmpleadoBanco emp) {
        sigEmpleadoBanco = emp;
    }
    public EmpleadoBanco getSigEmpleadoBanco() {
        return sigEmpleadoBanco;
    }

}
