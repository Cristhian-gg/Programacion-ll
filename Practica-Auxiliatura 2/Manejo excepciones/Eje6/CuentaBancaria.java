package Eje6;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("Error: el monto a depositar debe ser positivo.");
        }
        saldo += monto;
        System.out.println("Depósito exitoso: +" + monto + " Bs");
    }

    public void retirar(double monto) throws FondosInsuficientesException {
        if (monto > saldo) {
            throw new FondosInsuficientesException("Error: fondos insuficientes. Saldo disponible: " + saldo + " Bs");
        }
        saldo -= monto;
        System.out.println("Retiro exitoso: -" + monto + " Bs");
    }

    public void mostrarInfo() {
        System.out.println("=== Información de la Cuenta ===");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo + " Bs");
        System.out.println("===============================");
    }
}
