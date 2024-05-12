package disenio_facade.cajero;

public interface ICajeroFacade {
    boolean retirarDinero(int dni, String contraseña, double monto);
}
