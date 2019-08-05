/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T3Ejercicio11;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class T3Ejercicio11 {
     public static void main (String[]args)
    {  
        Scanner segund = new Scanner (System.in);
        System.out.println("Ingresa la Hora");
        int hora = segund.nextInt();
        System.out.println("Ingresa los minutos");
        int minutos = segund.nextInt();
        
        
        int hor = hora * 3600;
        int min = minutos * 60;
        int aux = hor+ min;
        int fsegundos = 86400 - aux;
   

        System.out.println("faltan "+ fsegundos +" segundos para llegar a media noche");
    }   
    
}
