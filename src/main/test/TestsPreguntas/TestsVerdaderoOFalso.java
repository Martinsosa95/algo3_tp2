package TestsPreguntas;

import edu.fiuba.algo3.modelo.Jugador;
import edu.fiuba.algo3.modelo.Pregunta;
import edu.fiuba.algo3.modelo.Respuesta;
import edu.fiuba.algo3.modelo.VerdaderoFalso;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestsVerdaderoOFalso {
    @Test

    public void JugadorSeCreaCorrectamente(){
        Jugador jugador = new Jugador("Lisandro");
        assertEquals("Lisandro", jugador.getNombre());
    }

    @Test
    public void JugadorSeCreaConCeroPuntos(){
        Jugador jugador = new Jugador("Lisandro");
        assertEquals(0, jugador.getPuntaje());
    }

    @Test
    public void SeCrearCorrectamenteUnaPreguntaDeVerdaderoOFalso(){
        VerdaderoFalso pregunta = new VerdaderoFalso("Hoy es 21 de julio?", "Verdadero");
        assertEquals("Verdadero", pregunta.getRespuestaCorrecta());
    }

    @Test

    public void LaPreguntaOtorgaLaCantidadDePuntosCorrectaSiSeRespondeBien(){
        VerdaderoFalso pregunta = new VerdaderoFalso("Hoy es 21 de julio?", "Verdadero");
        assertEquals(1, pregunta.getPuntos());
    }

    @Test
    public void UnaPreguntaDeVerdaderoOFalsoRecibeUnaListaDeRespuestasYAsignaBienElPuntaje(){
        VerdaderoFalso pregunta = new VerdaderoFalso("Telegram es mejor que wpp?", "Verdadero");
        Jugador daniel = new Jugador("Daniel");
        Jugador rafael = new Jugador("Rafael");

        ArrayList<Respuesta> respuestasJugadores = new ArrayList<Respuesta>();

        pregunta.imprimirPregunta();

        System.out.println("Respuesta Daniel: ");
        Respuesta respuestaDaniel = daniel.responderPregunta();
        System.out.println("Respuesta Rafael: ");
        Respuesta respuestaRafael = rafael.responderPregunta();

        respuestasJugadores.add(respuestaDaniel);
        respuestasJugadores.add(respuestaRafael);

        pregunta.corregirRespuestas(respuestasJugadores);

        assertEquals(1, respuestaRafael.getPuntosObtenidos());
        assertEquals(0, respuestaDaniel.getPuntosObtenidos());


    }
}
