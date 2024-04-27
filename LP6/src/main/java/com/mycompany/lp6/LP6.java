/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lp6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LP6 {
    public static void main(String[] args) {
        List<Autos> autos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        OUTER:
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1- Agregar auto");
            System.out.println("2- Buscar auto por ID");
            System.out.println("3- Eliminar auto");
            System.out.println("4- Salir");
            System.out.print("Ingrese una opcion: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    {
                        // Solicitar datos del auto al usuario
                        System.out.println("Ingrese ID del vehiculo:");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Ingrese marca del vehiculo:");
                        String marca = scanner.nextLine();
                        System.out.println("Ingrese modelo del vehiculo:");
                        String modelo = scanner.nextLine();
                        System.out.println("Ingrese ano del vehiculo:");
                        int ano = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Ingrese numero de chasis del vehiculo:");
                        String numeroChasis = scanner.nextLine();
                        System.out.println("Ingrese color del vehiculo:");
                        String color = scanner.nextLine();
                        
                        // Crear un auto nuevo viste
                        Autos auto = new Autos(id, marca, modelo, ano, numeroChasis, color);
                        autos.add(auto);
                        System.out.println("Auto agregado exitosamente");
                        break;
                    }
                case 2:
                    {
                        System.out.print("Ingrese el ID del auto a buscar: ");
                        int id = scanner.nextInt();
                        Autos auto = autos.stream()  //uso el metodo stream para realizar la busqueda de autos por iD
                                .filter(a -> a.getId() == id) //uso filter para solo buscar por ID y que no tome otro dato
                                .findFirst()   //first devuelve el primer objeto que encuentre con ese id sino encuentra arroja NULL
                                .orElse(null);
                        if (auto != null) { //si auto es diferente a null osea q encontro el auto muestra info
                            System.out.println("\nInformación del auto:");
                            auto.mostrarInfo();
                        } else {
                            System.out.println("No se encontro ningún auto con el ID ingresado");
                        }       break;
                    }
                case 3:
                    {
                        System.out.print("Ingrese el ID del auto a eliminar: ");
                        int id = scanner.nextInt();
                        Autos auto = autos.stream()
                                .filter(a -> a.getId() == id)
                                .findFirst()
                                .orElse(null);
                        if (auto != null) {
                            autos.remove(auto);
                            System.out.println("Auto eliminado exitosamente");
                        } else {
                            System.out.println("No se encontró ningún auto con el ID ingresado");
                        }       break;
                    }
                case 4:
                    scanner.close();
                    break OUTER;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}