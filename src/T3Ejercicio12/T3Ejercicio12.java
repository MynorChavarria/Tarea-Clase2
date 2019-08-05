/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T3Ejercicio12;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class T3Ejercicio12 {
    public static void main (String[]args)
    {  
        Scanner cuesti = new Scanner (System.in);
        int contador=0;
        System.out.println("BIENVENIDO AL MINI CUESTIONARIO\n\n");
        System.out.println(" A continuacion se te presentan una serie de 10 preguntas de respuesta multiple\nselecciona la que cosideras correcta tecleando el numero\nde su respuesta.\n");
        
        System.out.println("1-) Es un medio de integrar diferentes actividades para poner en marcha\nla estrategia empresarial?");
        System.out.println("1. Estrategia.\t2.Objetivos naturares.\t3.Proceso Admisntrativo.");
        int r1 = cuesti.nextInt();
        if (r1 == 1)
                {contador ++;
                }
        
    }
}
