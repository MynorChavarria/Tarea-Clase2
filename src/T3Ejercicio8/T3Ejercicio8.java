/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T3Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class T3Ejercicio8 {
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
   System.out.println("Promedio: " + prom);
    if (prom <=60)
    { 
          System.out.println("\033[31mInsuficiente");
    }
    else if (prom >=61 && prom <=68)
    { 
          System.out.println("Suficiente");       
    } 
    else if (prom >=69 && prom <=76)
    { 
          System.out.println("Bien");     
    } 
    else if (prom >=77 && prom <=85)
    { 
          System.out.println("Notable");
    }
    else if (prom >=86 && prom <=95)
    { 
          System.out.println("Notable");
    }
     else if (prom >=96 && prom <=100)
    { 
          System.out.println("Sobresaliente");
    }
    
    }
}
