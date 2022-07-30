package marda;

import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public abstract class Controlador<MesaT extends Mesa> {

    protected MesaT mesa;
    protected MesaView21 mesaView;
    protected JugadoresView jugadoresView;
    protected InicioView inicioView;
    protected GanadorView ganadorView;
    protected int turno;
        
     /**
     * Constructor de la clase tipo Abstracta
     */
    public Controlador() {
    }
    
     /**
   * Cambia la mesa del juego por una que recibe como parametro
   * @param mesa la mesa por la que se desea cambiar
   */
    public void setMesa(MesaT mesa){
        this.mesa = mesa;
    }
    
     /**
   * Inicia la mesa, la hace visible al usuario
   */
    public void iniciar(){
        inicioView.setVisible(true);
    }
    
     /**
   * Accion que ocurre cuando el jugador presiona el boton de nuevo juego, pasa del inicio a preguntar los nombres de los jugadores 
   */
    public void juegoNuevo(){
        inicioView.setVisible(false);
        jugadoresView.setVisible(true);
    }
    
     /**
   * Se encarga iniciar la mesa, cambia los nombres de los jugadores en la clase y en la vista
   */
    public void iniciarMesa(String jugador1, String jugador2){
        jugadoresView.setVisible(false);
        mesa.getJugador1().setNombre(jugador1);
        mesa.getJugador2().setNombre(jugador2);
        mesaView.setTextJug1(jugador1);
        mesaView.setTextJug2(jugador2);
        mesaView.setVisible(true);
    }
    
     /**
   * Empieza con la ronda del juego
   */
    public void jugar(){
        turno = 1;
        nuevaRonda();
    }
    
    /**
   * Cambia el turno actual
   * @param turno el turno al que se desea cambiar
   */
    public void setTurno(int turno){
        this.turno = turno;
    }
    
    /**
   * Devuelve el turno actual
   * @return el turno
   */
    public int getTurno(){
        return turno;
    }
    
    /**
   * Se encarga de crear una direccion a partir de el numero y palo de una carta
   * @return la ruta de la carta
   */
    public String getRutaCarta(int numero, int palo){
        String[] palos = mesa.mazo.getPalos();
        String nombre = "";
          switch(palo){
              case 0:
                  nombre = "/Imagenes/" + numero + palos[0] + ".png";
                  break;
              case 1:
                  nombre = "/Imagenes/" + numero + palos[1] + ".png";
                  break;
              case 2:
                  nombre = "/Imagenes/" + numero + palos[2] + ".png";
                  break;
              case 3:
                  nombre = "/Imagenes/" + numero + palos[3] + ".png";
                  break;
          }
        return nombre;
      }
    
    /**
   * Se encarga de mostrarle a los jugadores el ganador
   */
    public void ganador(){
        ganadorView.setJugador1(mesa.jugador1.getNombre(), mesa.jugador1.suma());
        ganadorView.setJugador2(mesa.jugador2.getNombre(), mesa.jugador2.suma());
        ganadorView.setGanador(mesa.ganador());
        ganadorView.setVisible(true);
    }
    
    /**
   * Se encarga de cargar una partida guardada en un .txt
   */
    public void cargarJuego(){
        String path = "savedFile.txt";
        mesa.cargarMesa(path);
        inicioView.setVisible(false);
        actualizarCartas();
        mesaView.setVictorias(mesa.jugador1.getVictorias(),mesa.jugador2.getVictorias());
        turno = 1;
        mesaView.setVisible(true);
        mesaView.setTextJug1(mesa.jugador1.getNombre());
        mesaView.setTextJug2(mesa.jugador2.getNombre());
        mesaView.mostrarTurno();

    }
    
    /**
   * Se encarga de guardar en un archivo .txt toda la informacion de la partida. La que podria ser cargada despues
   * @return si se pudo o no guardar el juego
   */
    public boolean guardarJuego(){
        String path = "savedFile.txt";
        boolean success = false;
        File file = new File(path);
        try{
          if(!file.exists()) {
            file.createNewFile();
          }
        }catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Ha habido un error al cargar el archivo","Error",JOptionPane.ERROR_MESSAGE);
        }
        try(FileWriter fileWriter = new FileWriter(path)) {
            success = true;
            fileWriter.write(mesa.toString());
            fileWriter.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha habido un error al escribir el archivo","Error",JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    abstract void nuevaRonda();
    abstract void turno();
    abstract void actualizarCartas();
    abstract void finalizarJuego();
    abstract void finalizarRonda();
}