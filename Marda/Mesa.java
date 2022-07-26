import java.util.ArrayList;

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
 */
public abstract class Mesa {

    private jugador1;
    private jugador2;
    private mazo;
    private ArrayList<Carta> cartaComunes = new ArrayList<Carta>();
    private ArrayList<Carta> cartasDesechadas = new ArrayList<Carta>();

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

    public void writeMesa(String path){
        jugador1->writeJugador(path);
        jugador2->writeJugador(path);
        mazo->writeMazo(path);
        //write cartas comunes y desechadas
    }

    public void cargarMesa(Strign path){
        //cargar mesa
        //get jugadores, mazo, cartas
    }
}