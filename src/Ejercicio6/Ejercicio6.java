/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class Ejercicio6 {
    public static void main (String []args)
    {
     Scanner medidas = new Scanner (System.in);
    float area;
    System.out.println("CALCULAREMOS EL AREA DEL TRIÁNGULO"); 
    System.out.println("Ingresa la Base en CM. del triangulo (sin usar letras)");
    float base= medidas.nextFloat();
    System.out.println("Ingresa la Altura en CM. del triangulo (sin usar letras)");
    float altura= medidas.nextFloat();
    area = base*altura/2;
    System.out.println("EL AREA DEL TRIÁNGULO INDICADO ES: "+area +"CM cuadrados"); 
    
    
    }
    
}
