/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class Ejercicio3 {
   
   public static void main (String[]args){ 
   final float euros = 0.006010121f;
    
    Scanner dt = new Scanner(System.in); 
    float total; 
    System.out.println("\tCONVERSOR DE PESETAS A EUROS");
    System.out.println("Introduce la cantidad de Pesetas a convertir: ");
    float pesetas = dt.nextFloat();
    total = Math.round(pesetas * euros);
    
    
    System.out.println(pesetas + " pesetas"+" equivale a " + total + " euros");
   }
}
