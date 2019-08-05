/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T3Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class T3Ejercicio7 {
     public static void main (String[]args)
    {  
    Scanner nts = new Scanner (System.in);
    float nota,suma=0, prom;
    for ( int i=1; i<=3; i++){
    System.out.println("Ingrese la  nota " +i);
    nota = nts.nextInt();
   suma = suma + nota;
    }
   prom = Math.round(suma/3);
    System.out.println("la media de las notas ingresadas es: " +prom);
    }
}
