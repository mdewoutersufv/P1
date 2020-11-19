package org.dis;

import com.opencsv.bean.CsvBindByName;

public class golfPlayer {
    @CsvBindByName
    private int Posicion;
    @CsvBindByName
    private String Nombre;
    @CsvBindByName
    private String Apellido;
    @CsvBindByName
    private String Pais;
    @CsvBindByName
    private int Edad;


    public golfPlayer(int posicion, String nombre, String apellido, String pais, int edad) {
        this.Posicion = posicion;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Pais = pais;
        this.Edad = edad;
    }

    @Override
    public String toString() {
        return "Posicion=" + Posicion + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Pais=" + Pais;
    }

}