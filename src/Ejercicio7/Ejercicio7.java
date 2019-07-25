/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class Ejercicio7 {
    public static void main (String[]ars)
    {
    Scanner produ = new Scanner(System.in);
    System.out.println("Ingrese el precio del producto (Sin IVA)");
    float precio = produ.nextFloat();
    float iva = precio * 12/100;
    float total = precio + iva;
     System.out.println("El Precio del producto es de: "+"\t"+ precio);
     System.out.println("El Iva a pagar es de:  "+"\t\t"+ iva);
     System.out.println("El Total a pagar es de: "+ "\t" + total);
    
    }
    
}
