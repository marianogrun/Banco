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
public class CajaDeAhorro extends CuentaBancaria {

    private double tazaDeInteres;

    public CajaDeAhorro(String alias,double porcentajePorMes,int meses) {
        super(alias);
        this.tazaDeInteres = porcentajePorMes*meses;
    }

    public String pagarIntereses() {
        double nuevoSaldo=this.getSaldo()*tazaDeInteres;
        return "El nuevo saldo de la cuenta es: "+nuevoSaldo;
    }

    @Override
    public String toString() {
        
        return "";
    }

}
