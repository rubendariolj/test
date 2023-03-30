/*  EJERCICIO 6 IF
 * Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.
 */
package introduccionajava;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class ejercicio6If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese num1");
        num1 = leer.nextInt();
        
        int num2;
        System.out.println("Ingrese num2");
        num2 = leer.nextInt();
        
        
        if (num1>25 && num2>25) { 
        System.out.println("Los dos numeros son mayores a 25"); 
        }else if (num1>25 || num2>25){ 
        System.out.println("Uno de los numeros es mayor que 25");
        }else {
            System.out.println("Ninguno de los numeros es mayor que 25");
        }
    }
    
}
