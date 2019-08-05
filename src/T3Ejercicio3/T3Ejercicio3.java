/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T3Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author max jutiapa
 */
public class T3Ejercicio3 {
    public static void main (String[]args)
    {  
        Scanner dia = new Scanner (System.in);
        System.out.println("Teclee un nümero del 1 al 7 para saber su correspondiente dia de la semana");
        int sdia = dia.nextInt();
        switch (sdia)
             {
            case 1:{ 
                System.out.println("1...Lunes");
                break;
            }
            case 2:{ 
                 System.out.println("2...Martes");
                break;
            }
            case 3:{ 
                 System.out.println("3...Miércoles");
                break;
            }
            case 4:{ 
                  System.out.println("4...Jueves");
                break;
            }
            case 5:{ 
                  System.out.println("5...Viernes");
                break;
            }
            case 6:{ 
                  System.out.println("6...Sábado");
                break;
            }
            case 7:{ 
                  System.out.println("7...Domingo");
                break;
            }
            default :{ 
                  System.out.println("\033[31mIntroduciste un número incorrecto."); 
                break;
            }
        }

    }
    
}
