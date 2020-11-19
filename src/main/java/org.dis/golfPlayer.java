package org.dis;
import com.opencsv;

public class golfPlayer {
    @CSVBindByName
    private int Posicion;
    @CSVBindByName
    private String Nombre;
    @CSVBindByName
    private String Apellido;
    @CSVBindByName
    private String Pais;
    @CSVBindByName
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