package marda;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Esta clase define el controlador del juego, el cual será el encargado de controlar a las clases modelo y vista
 * @author: Andy Alvarado, Antony Ortiz, Gustavo Pinto y Maria Andres
 * @version: 2022
 */
public abstract class Controlador<MesaT extends Mesa> {

    protected MesaT mesa;
    protected MesaView21 mesaView;
    protected JugadoresView jugadoresView;
    protected InicioView inicioView;
    protected GanadorView ganadorView;
    protected int turno;
        
     /**
     * Constructor de la clase, inicializa las clases juego y mesa
     * @param
     */
    public Controlador() {
    }

    public void setMesa(MesaT mesa){
        this.mesa = mesa;
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
        mesaView.setTextJug1(jugador1);
        mesaView.setTextJug2(jugador2);
        mesaView.setVisible(true);
    }

    public void jugar(){
        turno = 1;
        nuevaRonda();
    }

    public void setTurno(int turno){
        this.turno = turno;
    }

    public int getTurno(){
        return turno;
    }

    //overridable
    public void cargarJuego(){
        // //get path maybe?
        // mesa = new Mesa();
        // String path = "";
        // mesa->cargarMesa(path);
    }

    public boolean guardarJuego(){
        //get path maybe?
        String path = "";
        mesa.escribirMesa(path);
        return true;
    }

    //override para otras 
    public String getRutaCarta(int numero, int palo){
        String nombre = "";
          switch(palo){
              case 0:
                  nombre = "/Imagenes/" + numero + "treboles.png";
                  break;
              case 1:
                  nombre = "/Imagenes/" + numero + "picas.png";
                  break;
              case 2:
                  nombre = "/Imagenes/" + numero + "corazones.png";
                  break;
              case 3:
                  nombre = "/Imagenes/" + numero + "diamantes.png";
                  break;
          }
        return nombre;
      }

    abstract void nuevaRonda();
    abstract void turno();
    abstract void actualizarCartas();
    abstract void finalizarJuego();
    abstract void finalizarRonda();
    
    public void ganador(){
        ganadorView.setJugador1(mesa.jugador1.getNombre(), mesa.jugador1.suma());
        ganadorView.setJugador2(mesa.jugador2.getNombre(), mesa.jugador2.suma());
        ganadorView.setGanador(mesa.ganador());
        ganadorView.setVisible(true);
    }
}