/*  EJERCICIO 8 WHILE
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package introduccionajava;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class ejercicio8While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nota");
        nota = leer.nextInt();
        
        while(!(nota>=1 && nota<=10)){
            System.out.println("Nota ingresada incorrecta!");
            System.out.println("Ingrese nota");
            nota = leer.nextInt();
        }
        System.out.println("Nota ingresada correcta!");
    }
    
}
