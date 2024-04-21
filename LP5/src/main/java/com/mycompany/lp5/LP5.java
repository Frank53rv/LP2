/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lp5;

/**
 *
 * @author cuent
 */
import java.util.Scanner;

public class LP5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas para calcular el promedio: ");
        int cantidadPersonas = scanner.nextInt();

        int[] edades = new int[cantidadPersonas];
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
        }

        CalculadoraEdades calculadoraEdades = new CalculadoraEdades(edades);

        double promedioMayoresEdad = calculadoraEdades.calcularPromedioMayoresEdad();
        double promedioMenoresEdad = calculadoraEdades.calcularPromedioMenoresEdad();

        System.out.printf("El promedio de edad de los mayores de edad es: ", promedioMayoresEdad);
        System.out.printf("El promedio de edad de los menores de edad es: ", promedioMenoresEdad);
    }
}
