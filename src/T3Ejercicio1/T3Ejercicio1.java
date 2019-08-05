/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T3Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class T3Ejercicio1 {
    public static void main (String[]args)
           
    {    Scanner sl = new Scanner (System.in);
        int  select=0;
        System.out.println("Bienvenido, para saber que asignatura tienes a primera hora\nteclea el numero correspondiente al dia de la semana.");
        System.out.println("\033[32m1...Lunes");
        System.out.println("\033[33m2...Martes");
        System.out.println("\033[34m3...Miércoles");
        System.out.println("\033[35m4...Jueves");
        System.out.println("\033[36m5...Viernes");
        
        select = sl.nextInt();
        
        
        switch (select)
         {
            case 1:{ 
                System.out.println("\033[32mLunes: Matemáticas 7:30-9:00AM"); 
                break;
            }
            case 2:{ 
                System.out.println("\033[33mMartes: Inglés 7:30-9:00AM"); 
                break;
            }
            case 3:{ 
                System.out.println("\033[34mMiércoles: 7:30-9:00AM"); 
                break;
            }
            case 4:{ 
                System.out.println("\033[35mJueves: Estadstica 7:30-9:00AM"); 
                break;
            }
            case 5:{ 
                System.out.println("\033[36mViernes: Física 7:30-9:00AM"); 
                break;
            }
            default :{ 
                System.out.println("\033[31mIntroduciste un número incorrecto."); 
                break;
            }
        }
    
    }
    
}
