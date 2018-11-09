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
public class EmpleadoPorSemana extends Empleado {
     //Atributos de la clase
    private int numero_semanas;
    private double valor_semanal;
    
    //Constructor de la clase
    public EmpleadoPorSemana(String n, String a,String c, double comision,int numeroS, double valorS){
        super(n, a, c,comision);
        setNumero_semanas(numeroS);
        setValor_semanal(valorS);
    }
    //Metodos de agregar
    public void setNumero_semanas(int numeroS){
        numero_semanas = numeroS;
    }
    public void setValor_semanal(double valorS){
        valor_semanal = valorS;
    }
    //Metodos de obtener
    public int getNumero_semanas() {
        return numero_semanas;
    }
    public double getValor_semanal() {
        return valor_semanal;
    }
    //Metodo de calculo de sueldo final
    public double calcular_sueldo_final() {
        double sueldoF= (getNumero_semanas() * getValor_semanal()) + getComision_fija();
        return sueldoF;
    }
    //Metodo de sobreescribir el toString
    @Override
    public String toString(){
        return String.format("%s\nNumero Semanas:%s\nValor semanal: %s\n Sueldo Final:%s",super.toString(),getNumero_semanas(),getValor_semanal(),calcular_sueldo_final());
    }
    
}
