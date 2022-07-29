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

    public void ganador(){
        ganadorView.setJugador1(mesa.jugador1.getNombre(), mesa.jugador1.suma());
        ganadorView.setJugador2(mesa.jugador2.getNombre(), mesa.jugador2.suma());
        ganadorView.setGanador(mesa.ganador());
        ganadorView.setVisible(true);
    }

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