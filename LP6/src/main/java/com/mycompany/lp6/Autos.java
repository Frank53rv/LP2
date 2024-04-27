/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lp6;
/**
 *
 * @author cuent
 */
public class Autos {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private String numeroChasis;
    private String color;

    // Constructor
    public Autos(int id, String marca, String modelo, int anio, String numeroChasis, String color) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.numeroChasis = numeroChasis;
        this.color = color;
    }

    // Métodos getters y setters
    // Puedes generarlos automáticamente en tu IDE para simplificar el código
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método para mostrar la información del automóvil
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Numero de Chasis: " + numeroChasis);
        System.out.println("Color: " + color);
    }
}
