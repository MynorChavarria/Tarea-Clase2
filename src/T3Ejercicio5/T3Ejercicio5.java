/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T3Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class T3Ejercicio5 {
     public static void main (String[]args)
    {  
        Scanner datos = new Scanner (System.in);
        int a, b, c, x, aux;
        System.out.println("Ecuación de primer grado del tipo (ax+b=0)");
        System.out.println("Introduce el valor de A ");
        a = datos.nextInt();
        System.out.println("Introduce el valor de B ");
        b = datos.nextInt();
        System.out.println("Introduce el valor de C ");
        c = datos.nextInt();
        if (a!=0)
        {
            aux = c-b;
            x= aux/a;
            
                     
            System.out.println("Respuesta:  " +x);
        }
        else if(b!=0)
        {
            System.out.println("Imposible solucionarlo");
        }
        else 
          System.out.println("Solucion Indeterminada");  
            
    }    
}
