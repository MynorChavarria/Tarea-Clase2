/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class Ejercicio5 {
    public static void main (String[]args){
        
    Scanner medidas = new Scanner (System.in);
    float area;
    System.out.println("CALCULAREMOS EL AREA DEL RECTANGULO"); 
    System.out.println("Ingresa la Base en CM. del Rectángulo (sin usar letras)");
    float base= medidas.nextFloat();
    System.out.println("Ingresa la Altura en CM. del Rectángulo (sin usar letras)");
    float altura= medidas.nextFloat();
    area = base*altura;
    System.out.println("EL AREA DEL RECTÁNGULO INDICADO ES: "+area + " CM cuadrados"); 

    
}
    
}
