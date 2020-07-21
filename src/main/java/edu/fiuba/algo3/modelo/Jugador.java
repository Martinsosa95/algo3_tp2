package edu.fiuba.algo3.modelo;
import edu.fiuba.algo3.modelo.Puntaje;
import java.util.Scanner;

public class Jugador {

    private Puntaje puntaje = new Puntaje();
    private String nombre;
    private Respuesta respuesta;

    public Jugador(String nombreJugador){
        nombre = nombreJugador;
    }

    public Respuesta responderPregunta(){
        String respuestaPregunta;
        Scanner teclado = new Scanner(System.in);
        respuestaPregunta = teclado.next();
        this.respuesta = new Respuesta(respuestaPregunta);
        return this.respuesta;
    }

    public void actualizarPuntaje(){
        int puntosRespuesta = respuesta.getPuntosObtenidos();
        puntaje.actualizarPuntaje(puntosRespuesta);
    }



    public String getNombre(){
        return nombre;
    }

    public int getPuntaje() {
        return puntaje.getPuntaje();
    }
}
