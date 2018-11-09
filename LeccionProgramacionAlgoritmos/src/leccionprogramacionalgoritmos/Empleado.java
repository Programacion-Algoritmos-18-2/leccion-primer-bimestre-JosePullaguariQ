/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccionprogramacionalgoritmos;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    //Atributos de la clase
    private String nombre;
    private String apellido;
    private String cedula;
    private double comision_fija;
    
    //Constructor de la clase
    public Empleado(){}
    public Empleado(String n, String a,String c, double comision){
        setNombre(n);
        setApellido(a);
        setCedula(c);
        setComision_fija(comision);
    }
    //Metodos de agregar
    public void setNombre(String n){
        nombre=n;
    }
    public void setApellido(String a) {
        apellido = a;
    }
    public void setCedula(String c) {
        cedula = c;
    }
    public void setComision_fija(double comision) {
        comision_fija= comision;
    }
    
    //Metodos de obtener
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCedula() {
        return cedula;
    }
    public double getComision_fija() {
        return comision_fija;
    }
    //Metodo de sobreescribir el toString
    @Override
    public String toString(){
        return String.format("Informacion de: %s %s cedula:%s",getNombre(),apellido,getCedula());
    }  
}
