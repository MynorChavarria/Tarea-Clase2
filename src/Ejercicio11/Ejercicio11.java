/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio11;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class Ejercicio11 {
     public static void main (String []args)
    {
     Scanner alma = new Scanner (System.in);
    
    double Datos;
    System.out.println("CONVERTIDOR DE KB A MB"); 
    System.out.println("Ingrese la cantidad de Kilobytes");
    int kb = alma.nextInt();
    int tdatos = (kb / 1024);
    System.out.println(kb+"Mb. equivale a " +tdatos+" Megabytes.");
    
    
    }
}
