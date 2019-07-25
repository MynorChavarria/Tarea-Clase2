
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main (String[]args){
    
    Scanner numeros = new Scanner(System.in);
   
  System.out.print("Introduce dos numero a ser mutiplicados separados por espacio ");
  int num1 = numeros.nextInt();
  int num2 = numeros.nextInt();
  int total;
  total = num1*num2;
  System.out.println("El total de su multiplicación es " + total);
    }
}
