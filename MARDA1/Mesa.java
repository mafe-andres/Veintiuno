import java.util.ArrayList;

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
 */
public abstract class Mesa {

    protected Jugador jugador1;
    protected Jugador jugador2;
    protected Mazo mazo;
    protected ArrayList<Carta> cartaComunes = new ArrayList<Carta>();
    protected ArrayList<Carta> cartasDesechadas = new ArrayList<Carta>();

    public Mesa(){
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
}