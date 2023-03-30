/*  EJERCICIO 10 FOR
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionajava;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class ejercicio10For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        for (int i = 0; i < 4; i++) {
            Scanner leer = new Scanner(System.in);
            //System.out.println("Ingrese num1");
            num1 = leer.nextInt();
            System.out.print(num1 + " ");
            for(int j = 0; j < num1; j++){
                System.out.print("*");
            }   
        System.out.println("");
    	}
    }
    
}
