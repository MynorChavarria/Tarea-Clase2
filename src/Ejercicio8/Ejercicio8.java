/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class Ejercicio8 {
    public static void main (String[]args)
    
    {   Scanner hrs = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas en la semana");
        int horas = hrs.nextInt();
        int sueldo = horas * 12;
        System.out.println("Su sueldo correspondiente es de: "+sueldo+" euros");
        
        
    
    
    }
    
}
