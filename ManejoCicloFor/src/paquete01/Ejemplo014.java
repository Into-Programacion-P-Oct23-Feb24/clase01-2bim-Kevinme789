/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Para acumular cadenas hacemos el uso de String.format y realizaremos
        // la impresion de toda la cadena en un solo printf
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            suma = suma + i;
  
        }
        
        for (int i = 1; i < 11; i++) {
            suma = suma + i;
        }
        System.out.printf("%d", suma);

    }

}
