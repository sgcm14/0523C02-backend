package disenio_facade.cajero;

public class CuentaService {
    public Cuenta getCuenta(int dni) {
        // Lógica para obtener la cuenta del usuario
        return new Cuenta(dni, 1000.0); // Supongamos que siempre devuelve una cuenta con saldo de 1000 para el ejemplo
    }
}
