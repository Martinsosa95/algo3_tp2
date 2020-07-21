package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public abstract class Pregunta {
    Respuesta respuestaPregunta;
    String pregunta;
    ArrayList<String> opciones = new ArrayList<String>();
    int puntos;

    public void imprimirPregunta(){
        System.out.println(pregunta);
    }

    public int getPuntos(){
        return puntos;
    }

    public abstract void corregirRespuestas(ArrayList<Respuesta> respuestasJugadores);

    public abstract String getRespuestaCorrecta();


}
