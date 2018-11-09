/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccionprogramacionalgoritmos;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        //Creacion del primer objeto tipo empleado
        Empleado e = new Empleado();
        e.setNombre("Luis");
        e.setApellido("Benitez");
        e.setCedula("113748263");
        System.out.println(e.toString());
        
        //Creacion del segundo objeto tipo Empleado
        EmpleadoPorHoras e1 = new EmpleadoPorHoras();
        System.out.println("Ingrese su nombre:\n");
        String nombre=teclado.next();
        e1.setNombre(nombre);
        e1.setApellido("Andrade");
        e1.setCedula("1194739573");
        e1.setNumero_horas(15);
        e1.setValor_hora(20.2);
        System.out.println(e.toString());
        
        //Creacion del segundo objeto tipo Empleado
        EmpleadoFijo e2 = new EmpleadoFijo();
        e2.setSueldo_fijo(300.2);
        e2.setDescuento_seguro(10);
        System.out.println("Ingrese comision");
        double comision=teclado.nextDouble();
        e2.setComision_fija(comision);
        e2.setNombre("Ana");
        e2.setApellido("Diaz");
        System.out.println(e2.toString());
        
    }
    
}
