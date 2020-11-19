package org.dis;
public class golfPlayer {

    private int posicion;
    private String nombre;
    private String apellido;
    private String pais;
    private int edad;


    public golfPlayer(int posicion, String nombre, String apellido, String pais, int edad) {
        this.posicion = posicion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Posicion=" + posicion + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Pais=" + pais;
    }

}