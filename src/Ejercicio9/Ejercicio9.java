/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class Ejercicio9 {
    public static void main (String[]args)
    {
     Scanner medidas = new Scanner (System.in);
    
    double volumen;
    System.out.println("CALCULAREMOS VOLUMEN DE UN CONO"); 
    System.out.println("Ingresa el Radio en CM cúbicos. del cono (sin usar letras)");
    double radio= medidas.nextDouble();
    System.out.println("Ingresa la Altura en CM cúbicos. del cono (sin usar letras)");
    double altura= medidas.nextDouble();
    volumen = (3.1416*(radio*radio)*altura)/3;
    System.out.println("El volumen del cono es: "+ volumen + " centimetros cúbicos");
    
    
    }
    
}

