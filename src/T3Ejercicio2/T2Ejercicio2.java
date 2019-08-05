/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T3Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class T2Ejercicio2 {
    public static void main (String []args){
        Scanner intro = new Scanner (System.in);
     System.out.println("Introduce tu nombre");
     String nombre = intro.nextLine();
     System.out.println("Por favor introduce una hora del dia usando formato 24 hrs"); 
     int hora = intro.nextInt();
 int mañana = 6;
 int mañana2 = 12;
 int tarde = 13;
 int tarde2 = 20;
 int noche = 21;
 int noche1 = 24;
 int noche3 = 1;
 int noche4 = 5;
 
 
 if (hora >=mañana && hora <=mañana2){
     System.out.println("¡Buenos Dias, "+nombre+"!"); 
 }
 
  if (hora >=tarde && hora <=tarde2){
     System.out.println("¡Buenas Tardes "+nombre+"!"); 
 }
 
   if (hora >=noche && hora <=noche1){
     System.out.println("¡Buenas Noches "+nombre+"!");  
 }
   
   if (hora >=noche3 && hora <=noche4){
     System.out.println("¡Buenas Noches "+nombre+"!"); 
   }
    }
}
