/*  EJERCICIO 9 DO WHILE
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje 
 * "Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
 * pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package introduccionajava;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class ejercicio9DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0;
        int cont = 0;
        int num1;
        do {
            
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese num1");
            num1 = leer.nextInt();
            
            cont = cont + 1;
            
            if (num1 > 0) {
                suma = suma + num1; 
            }
            
            if (num1 == 0) {
                System.out.println("Ya encontramos el 0.");
                break;
            }
            
        } while (cont <= 4);

        System.out.println("La suma de los numeros ingresados es: " + suma);


    }
    
}
