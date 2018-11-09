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
public class EmpleadoPorHoras extends Empleado{
    //Atributos de la clase
    private int numero_horas;
    private double valor_hora;
    
    //Constructor de la clase
    public EmpleadoPorHoras(){}
    public EmpleadoPorHoras(String n, String a,String c, double comision,int numero, double valorH){
        super(n, a, c,comision);
        setNumero_horas(numero);
        setValor_hora(valorH);
    }
    //Metodos de agregar
    public void setNumero_horas(int numero){
        numero_horas=numero;
    }
    public void setValor_hora(double valorH){
        valor_hora = valorH;
    }
    //Metodos de obtener
    public double getNumero_horas() {
        return numero_horas;
    }
    public double getValor_hora() {
        return valor_hora;
    }
    //Metodo de calculo de sueldo final
    public double calcular_sueldo_final() {
        double sueldoF= (getNumero_horas() * getValor_hora()) + getComision_fija();
        return sueldoF;
    }
    //Metodo de sobreescribir el toString
    @Override
    public String toString(){
        return String.format("%s\nNumero Horas:%d\nValor hora: %f\n Sueldo Final:%f",super.toString(),getNumero_horas(),getValor_hora(),calcular_sueldo_final());
    }
}
