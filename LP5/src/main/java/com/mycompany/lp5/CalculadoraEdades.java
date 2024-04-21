/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lp5;

/**
 *
 * @author cuent
 */
class CalculadoraEdades  {
    private int[] edades;

    public CalculadoraEdades(int[] edades) {
        this.edades = edades;
    }

    public double calcularPromedioMayoresEdad() {
        int mayoresDeEdad = 0;
        int totalMayores = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                mayoresDeEdad++;
                totalMayores += edad;
            }
        }
        if (mayoresDeEdad == 0) {
            return 0;
        }
        return (double) totalMayores / mayoresDeEdad;
    }

    public double calcularPromedioMenoresEdad() {
        int menoresDeEdad = 0;
        int totalMenores = 0;
        for (int edad : edades) {
            if (edad < 18) {
                menoresDeEdad++;
                totalMenores += edad;
            }
        }
        if (menoresDeEdad == 0) {
            return 0;
        }
        return (double) totalMenores / menoresDeEdad;
    }
}
