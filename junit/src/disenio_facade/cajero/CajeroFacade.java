package disenio_facade.cajero;

public class CajeroFacade implements ICajeroFacade {
    private AutenticationService authService;
    private CuentaService cuentaService;
    private CajaService cajaService;

    public CajeroFacade() {
        this.authService = new AutenticationService();
        this.cuentaService = new CuentaService();
        this.cajaService = new CajaService();
    }

    @Override
    public boolean retirarDinero(int dni, String contraseña, double monto) {
        // Autenticar al usuario
        if (!authService.validarUsuarioYContrasena(dni, contraseña)) {
            System.out.println("Autenticación fallida. Verifique sus credenciales.");
            return false;
        }

        // Obtener cuenta del usuario
        Cuenta cuenta = cuentaService.getCuenta(dni);

        // Verificar saldo suficiente
        if (cuenta.getSaldo() < monto) {
            System.out.println("Saldo insuficiente.");
            return false;
        }

        // Retirar dinero
        if (cajaService.entregarDinero(monto)) {
            // Actualizar saldo de la cuenta
            cuenta.setSaldo(cuenta.getSaldo() - monto);
            System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta.getSaldo());
            return true;
        } else {
            System.out.println("No se pudo retirar dinero en este momento.");
            return false;
        }
    }
}
