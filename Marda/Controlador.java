package proyecto_blackjack;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Esta clase define el controlador del juego, el cual será el encargado de controlar a las clases modelo y vista
 * @author: Andy Alvarado, Antony Ortiz, Gustavo Pinto y Maria Andres
 * @version: 2022
 */
public abstract class Controlador{

    private Mesa mesa;
    private MesaView mesaView;
    private JugadoresView jugadoresView;
    private InicioView inicioView;
    private int turno;
        
     /**
     * Constructor de la clase, inicializa las clases juego y mesa
     * @param
     */
    public Controlador() {
    }

    public void iniciar(){
        inicioView.setVisible(true);
    }

    public void juegoNuevo(){
        inicioView.setVisible(false);
        jugadoresView.setVisible(true);
    }

    public void iniciarMesa(String jugador1, String jugador2){
        jugadoresView.setVisible(false);
        mesa.getJugador1().setNombre(jugador1);
        mesa.getJugador2().setNombre(jugador2);
        mesaView.setVisible(true);
        mesaView.setTextJug1(jugador1);
        mesaView.setTextJug2(jugador2);
    }

    public void jugar(){
        nuevaRonda();
        mesa.mostrarTurno();
        turno = 1;
        turno();
    }

    public void setTurno(int turno){
        this.turno = turno;
    }

    public int getTurno(){
        return turno;
    }

    public void cargarJuego(){
        // //get path maybe?
        // mesa = new Mesa();
        // String path = "";
        // mesa->cargarMesa(path);
    }

    public void guardarJuego(){
        //get path maybe?
        String path = "";
        mesa->writeMesa(path);
    }

    abstract void nuevaRonda();
    abstract void turno();
    abstract void actualizarCartas();
    abstract void ganador(int ganador);
}