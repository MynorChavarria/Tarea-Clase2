/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class Ejercicio2 {
        public static void main (String[]args)  {
    final float pesetas = 166.386f;
    
    Scanner dt = new Scanner(System.in);
    float total; 
    System.out.println("\tCONVERSOR DE EUROS A PESETAS");
    System.out.println("Introduce la cantidad de euros a convertir: ");
    float euros = dt.nextFloat();
    total = euros * pesetas;
    
    
    System.out.println(euros + " euros"+" equivale a " + total + " pesetas");
    
    }
}
