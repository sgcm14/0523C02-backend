package disenio_facade.cajero;

public class Cuenta {
    private int dni;
    private double saldo;

    public Cuenta(int dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
