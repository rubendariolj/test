/*  EJERCICIO 4 SYSTEM.OUT.PRINTLN
 * Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime
 * ambas variables por pantalla.
 * Recomendamos que hagan el siguiente experimento: tipear en minúsculas la
 * palabra sout y apenas terminamos de escribirla tocar el botón tab o mejor
 * dicho tabular.
 * Esto nos va a generar un System.out.println() para poder escribir lo que
 * queramos.
 */
package introduccionajava;

/**
 *
 * @author ruben
 */
public class ejercicio4Imprimir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Ruben";
        int edad = 42;
        System.out.println("La edad de " + nombre + " es " + edad + " años." );
    }
    
}
