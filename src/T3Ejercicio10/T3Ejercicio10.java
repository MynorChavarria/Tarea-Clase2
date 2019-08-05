/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T3Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class T3Ejercicio10 {
     public static void main (String[]args)
    {  
        Scanner hrps = new Scanner (System.in);
        System.out.println("Introduce tu dia de nacimiento seguido de tu mes, (En numeros)\nseparados por espacio:  ");
        int dia = hrps.nextInt();
        int mes = hrps.nextInt();
        if(dia>=22 && dia <=31 && mes ==12||dia >=1 && dia <=20 && mes ==1)
        {
         System.out.println("CAPRICORNIO");    
        }
         if(dia>=21 && dia <=31 && mes ==1||dia >=1 && dia <=19 && mes ==2)
        {
         System.out.println("Acuario");    
        }
         if(dia>=20 && dia <=28 && mes ==2||dia >=1 && dia <=20 && mes ==3)
        {
         System.out.println("Pisis");    
        }
         if(dia>=21 && dia <=31 && mes ==3||dia >=1 && dia <=20 && mes ==4)
        {
         System.out.println("Aries");    
        }
         if(dia>=21 && dia <=30 && mes ==4||dia >=1 && dia <=21 && mes ==5)
        {
         System.out.println("Tauro");    
        }
         if(dia>=22 && dia <=31 && mes ==5||dia >=1 && dia <=21 && mes ==6)
        {
         System.out.println("Géminis");    
        }
          if(dia>=22 && dia <=30 && mes ==6||dia >=1 && dia <=23 && mes ==7)
        {
         System.out.println("Cancer");    
        }
           if(dia>=24 && dia <=31 && mes ==7||dia >=1 && dia <=23 && mes ==8)
        {
         System.out.println("Leo");    
        }
           if(dia>=24 && dia <=31 && mes ==8||dia >=1 && dia <=23 && mes ==9)
        {
         System.out.println("Virgo");    
        }   
            if(dia>=24 && dia <=30 && mes ==9||dia >=1 && dia <=23 && mes ==10)
        {
         System.out.println("Libra");    
        }   
            if(dia>=24 && dia <=31 && mes ==10||dia >=1 && dia <=22 && mes ==11)
        {
         System.out.println("Escorpio");    
        }   
            if(dia>=23 && dia <=30 && mes ==11||dia >=1 && dia <=21 && mes ==12)
        {
         System.out.println("Sagitario");    
        }   
    }
}
