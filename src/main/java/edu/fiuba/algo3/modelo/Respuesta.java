package edu.fiuba.algo3.modelo;

public class Respuesta {
    private String respuesta;
    private Boolean respuestaCorrecta = Boolean.TRUE;
    private int puntosObtenidos;

    public Respuesta(String respuesta){
        this.respuesta = respuesta;
    }

    public String getRespuesta(){
        return respuesta;
    }

    public boolean compararCon(Respuesta respuestaJugador){
        String respuestaJug = respuestaJugador.getRespuesta();
        return respuestaJug.equals(this.respuesta);

    }

    public void asignarPuntaje(int puntosObtenidos){
        this.puntosObtenidos = puntosObtenidos;
    }

    public int getPuntosObtenidos(){
        return puntosObtenidos;
    }
}
