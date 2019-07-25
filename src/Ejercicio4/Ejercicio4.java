/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class Ejercicio4 {
    public static void main (String[]args)
    {int suma, resta, multi, div=0;
        Scanner nums = new Scanner (System.in);
        System.out.println("Introduce dos numeros enteros separados por espacio ");
        int num1 = nums.nextInt();
        int num2 = nums.nextInt();
        //Suma
        suma = num1 + num2;
        
        //resta
        resta = num1-num2;
        
        //Multiplicar
        multi = num1 * num2;
        
        //División
        if(num2==0)
        {
         System.out.println("La suma de los numeros es "+ suma );
         System.out.println("La resta de los numeros es "+ resta );
         System.out.println("La multiplicacion de los numeros es "+ multi );   
         System.out.println("No es posible dividr entre 0");   
        
        }
        else
        {
        System.out.println("La suma de los numeros es "+ suma );
        System.out.println("La resta de los numeros es "+ resta );
        System.out.println("La multiplicacion de los numeros es "+ multi );
        System.out.println("La División de los numeros es "+ div );
        }
       
            
        
        
        
    }
}
