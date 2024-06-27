/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrodeinst;

/**
 *
 * @author cuent
 */
public class Instrumento {
      private String nombre;
    private String tipo;
    private String acusticoElectrico;
    private String familia;
    private int id;

    public Instrumento(String nombre, String tipo, String acusticoElectrico, String familia, int id) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.acusticoElectrico = acusticoElectrico;
        this.familia = familia;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAcusticoElectrico() {
        return acusticoElectrico;
    }

    public void setAcusticoElectrico(String acusticoElectrico) {
        this.acusticoElectrico = acusticoElectrico;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
