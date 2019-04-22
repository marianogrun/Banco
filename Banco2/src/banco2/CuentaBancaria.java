/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco2;

/**
 *
 * @author Mariano
 */
public abstract class CuentaBancaria {
    private long ultimoNumeroDeCuenta=1234;
    private String CBU;
    private String alias;
    private double saldo;
    

    public CuentaBancaria(String alias) {
        this.alias = alias;
        this.CBU=this.generarCbu();
    }
    
    @Override
    public String toString() {
        return "cbu=" + CBU + "\nalias=" + alias
                + "\nultimoNumeroDeCuenta=" + ultimoNumeroDeCuenta
                + "\nsaldo=" + saldo;
    }

    public String generarCbu() {
        return "" + Math.floor(Math.random() * 100000000);
    }

    public double depositar(double monto) {
        this.saldo += monto;
        String mensaje="El monto depositado es $"+monto+
                "\nSu nuevo saldo es $"+this.saldo;
        GUI.mostrarCartel(mensaje, "Transacción exitosa", 1);
        
        return this.saldo;
    }

    public boolean extraer(double monto) {
        
        if (this.saldo >= monto) {
            this.saldo -= monto;
            String mensaje="Se extrajeron: $"+monto
                    +"\nSu nuevo saldo es: $"+this.saldo;
        GUI.mostrarCartel(mensaje, "Transacción exitosa", 1);
            return true;
        } else {
            GUI.mostrarCartel("Fondos insuficientes", "ERROR", 0);
        }
        return false;
    }

    void consultarSaldo() {
        GUI.mostrarCartel("Su saldo actual es: $"+this.saldo,"Transacción exitosa",1);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public long getUltimoNumeroDeCuenta() {
        return ultimoNumeroDeCuenta;
    }

    public void setUltimoNumeroDeCuenta(long ultimoNumeroDeCuenta) {
        this.ultimoNumeroDeCuenta = ultimoNumeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}


