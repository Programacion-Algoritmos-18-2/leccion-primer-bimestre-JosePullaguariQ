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
public class EmpleadoFijo extends Empleado{
    //Atributos de la clase
    private double sueldo_fijo;
    private double descuento_seguro;
    
    //Constructor de la clase
    public EmpleadoFijo(){
    }
    public EmpleadoFijo(String n, String a,String c, double comision,double sueldoF, double descuento){
        super(n, a, c,comision);
        setSueldo_fijo(sueldoF);
        setDescuento_seguro(descuento);
    }
    //Metodos de agregar
    public void setSueldo_fijo(double sueldoF){
        sueldo_fijo=sueldoF;
    }
    public void setDescuento_seguro(double descuento){
        descuento_seguro = descuento;
    }
    //Metodos de obtener
    public double getSueldo_fijo() {
        return sueldo_fijo;
    }
    public double getDescuento_seguro() {
        return descuento_seguro;
    }
    //Metodo de calculo de sueldo final
    public double calcular_sueldo_final() {
        double sueldoF= (getSueldo_fijo() * getDescuento_seguro()) + getComision_fija();
        return sueldoF;
    }
    //Metodo de sobreescribir el toString
    @Override
    public String toString(){
        return String.format("%s\nSueldo fijos:%s\nDescuento Seguro: %s\n Sueldo Final:%s",super.toString(),getSueldo_fijo(),getDescuento_seguro(),calcular_sueldo_final());
    }
}