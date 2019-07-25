/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class Ejercicio10 {
    public static void main (String []args)
    {
     Scanner alma = new Scanner (System.in);
    
    double Datos;
    System.out.println("CONVERTIDOR DE MB A KB"); 
    System.out.println("Ingrese la cantidad de Megabytes");
    int mb = alma.nextInt();
    int tdatos = (mb * 1024);
    System.out.println(mb+"Mb. equivale a " +tdatos+" Kilobytes.");
    
    
    }
    
}
