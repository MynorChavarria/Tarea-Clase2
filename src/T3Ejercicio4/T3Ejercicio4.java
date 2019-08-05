/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T3Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class T3Ejercicio4 {
      public static void main (String[]args)
    {  
        Scanner hrs = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas en la semana");
        int horas = hrs.nextInt();
        
        if (horas<=40&& horas >=0)
        {
          int sueldo = horas * 12; 
          System.out.println("Su sueldo correspondiente es de: "+sueldo+" euros");
        }
        if(horas>=41)
        {
          int sueldo = horas * 16; 
          System.out.println("Su sueldo correspondiente es de: "+sueldo+" euros");
        }
         if (horas<=0)
        {
            System.out.println("Usted no tiene horas de trabajo acumuladas.");
        }
    }     
}
