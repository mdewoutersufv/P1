package org.dis;//Fichero para mostrar por consola el JSON generado a partir del CSV y almacenarlo en el fichero best-golf-players.json

import com.google.gson.Gson;

import java.util.List;

public class EscribeJSON {

    public static void main(String[] args) {
        List<golfPlayer> players = parseaCSV("best-golf-players.csv");
    }
 }
