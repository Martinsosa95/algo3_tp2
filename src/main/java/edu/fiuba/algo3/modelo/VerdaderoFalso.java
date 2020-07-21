package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class VerdaderoFalso extends Pregunta{

    public VerdaderoFalso(String pregunta, String respuestaCorrecta){
        super.respuestaPregunta = new Respuesta(respuestaCorrecta);
        super.pregunta = pregunta;
        super.puntos = 1;
    }

    @Override
    public void corregirRespuestas(ArrayList<Respuesta> respuestasJugadores) {
        for(Respuesta respuestaJugador: respuestasJugadores){
            if (super.respuestaPregunta.compararCon(respuestaJugador)){
                //Si da true respondio bien
                respuestaJugador.asignarPuntaje(puntos);
            }
        }

    }

    @Override
    public String getRespuestaCorrecta() {
        return respuestaPregunta.getRespuesta();
    }
}
