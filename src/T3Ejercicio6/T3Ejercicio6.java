/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T3Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class T3Ejercicio6 {
     public static void main (String[]args)
    {  
    Scanner tiempo = new Scanner (System.in);
    
        double h, respuesta, aux;
      final double g =  9.81;
        System.out.println("Introduzca la altura desde la cuál desciende el objeto");
             h = tiempo.nextInt();
           aux = 2*h/g; 
           respuesta = Math.sqrt(aux);
         System.out.println("El tiempo que tardará el objeto en caer es de: "+ respuesta);  
           
    }
}
