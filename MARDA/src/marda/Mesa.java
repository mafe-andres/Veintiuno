package marda;

import java.util.ArrayList;

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
 */
public abstract class Mesa <JugadorT extends Jugador> {

    protected JugadorT jugador1;
    protected JugadorT jugador2;
    protected Mazo mazo;
    protected ArrayList<Carta> cartaComunes = new ArrayList<Carta>();
    protected ArrayList<Carta> cartasDesechadas = new ArrayList<Carta>();

    public Mesa(){
    }

    public void setJugadores(JugadorT jugador1, JugadorT jugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public ArrayList<Carta> getCartasComunes(){
        return cartaComunes;
    }

    public ArrayList<Carta> getCartasDesechadas(){
        return cartasDesechadas;
    }

    public Jugador getJugador1(){
        return jugador1;
    }
    
    public Jugador getJugador2(){
        return jugador2;
    }

    public void escribirMesa(String path){
        jugador1.escribirJugador(path);
        jugador2.escribirJugador(path);
        mazo.escribirMazo(path);
        //write cartas comunes y desechadas
    }

    public void cargarMesa(String path){
        //cargar mesa
        //get jugadores, mazo, cartas
    }

    abstract String ganador();
}