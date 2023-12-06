/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        String nombre;
        String posicion;
        int edad;
        double estatura;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion del jugador");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            cadenaFinal = String.format("%s%d.%s -%s-, edad %d,estatura %.2f\n",
                     cadenaFinal,i, nombre, posicion, edad, estatura);

        }
         System.out.printf("%s", cadenaFinal);
    }
}
