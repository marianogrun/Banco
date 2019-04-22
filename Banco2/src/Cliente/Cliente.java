/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

/**
 *
 * @author Mariano
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
    private Domicilio domicilio;

    public Cliente(String nombre, String apellido, String telefono, String mail, String calle, int numero, int piso, String departamento, String localidad, int codigoPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
        this.domicilio = new Domicilio(calle, numero, piso, departamento, localidad, codigoPostal);

    }

    public String obtenerNombreCompleto() {
        return this.nombre+" "+this.apellido;
    }

    @Override
    public String toString (){
        return this.nombre+" "+this.apellido
                +"\nTel: "+this.telefono
                +"\nMail: "+this.mail
                +"\nVive en: "+this.domicilio;
    }
    
    public String getNombre(){
        return nombre;
    } 
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
    public String getMail(){
        return mail;
    }
    public void setMail (String mail){
        this.mail=mail;
    }
}
