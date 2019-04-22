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
public class CuentaCorriente extends CuentaBancaria {
    
    private double descubierto;

    public CuentaCorriente(String alias,double descubierto) {
        super(alias);
        this.descubierto = descubierto;
    }
    
    
    
    @Override
    public boolean extraer (double monto){
        return false;
    }
    
    @Override
    public String toString (){
        return "";
    }
}
