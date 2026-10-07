


public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public double obtenerSaldo() {
        return saldo;
    }
}