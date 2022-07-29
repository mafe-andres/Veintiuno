package marda;

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
 */
public abstract class Mesa <JugadorT extends Jugador, MazoT extends Mazo> {

    protected JugadorT jugador1;
    protected JugadorT jugador2;
    protected MazoT mazo;
    protected ArrayList<Carta> cartaComunes = new ArrayList<Carta>();
    protected ArrayList<Carta> cartasDesechadas = new ArrayList<Carta>();

    public Mesa(){
    }

    public void setJugadores(JugadorT jugador1, JugadorT jugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void setMazo(MazoT mazo){
        this.mazo = mazo;
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

    public String toString(){

        String jugador1Str = jugador1.toString() + "\n";
        String jugador2Str = jugador2.toString() + "\n";
        String mazoStr = mazo.toString() + "\n";

        String cartasDesechadasStr = "";
        if (cartasDesechadas.size() != 0){
            for (int i =0; i < cartasDesechadas.size(); i++){
                Carta carta = cartasDesechadas.get(i);
                String cartaInfo = Integer.toString(carta.getNumero()) + "-" + Integer.toString(carta.getPalo()) + "-" + Integer.toString(carta.getValor()) + "/";
                cartasDesechadasStr += cartaInfo;
            }
        } else {
            cartasDesechadasStr += "x";
        }
        cartasDesechadasStr += "\n";

        String cartasComunesStr = "";
        if (cartaComunes.size() != 0){
            for (int i =0; i < cartaComunes.size(); i++){
                Carta carta = cartaComunes.get(i);
                String cartaInfo = Integer.toString(carta.getNumero()) + "-" + Integer.toString(carta.getPalo()) + "-" + Integer.toString(carta.getValor()) + "/";
                cartasComunesStr += cartaInfo;
            }
        } else {
            cartasComunesStr += "x";
        }
        cartasComunesStr += "\n";

        String info = jugador1Str + jugador2Str + mazoStr + cartasComunesStr + cartasDesechadasStr;
        return info;
    }

    public boolean cargarMesa(String path){
        BufferedReader reader;
        String infoJugador1 = "";
        String infoJugador2 = "";
        String infoMazo = "";
        String infoCartasComunes = "";
        String infoCartasDesechadas = "";

        boolean success = false;
        try {
            reader = new BufferedReader(new FileReader(path));
            infoJugador1 = reader.readLine();
            infoJugador2 = reader.readLine();
            infoMazo = reader.readLine();
            infoCartasComunes = reader.readLine();
            infoCartasDesechadas = reader.readLine();
            reader.close();
            jugador1.cargar(infoJugador1);
            jugador2.cargar(infoJugador2);
            mazo.cargar(infoMazo);
            if (!infoCartasComunes.equals("x")){
                System.out.println("cartiras "+infoCartasComunes);
                cartaComunes = doArray(infoCartasComunes);
            }
            if (!infoCartasDesechadas.equals("x")){
                cartaComunes = doArray(infoCartasDesechadas);
            }

            success = true;
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "No se encontró ningun archivo","Error",JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Ha habido un error al leer el archivo","Error",JOptionPane.ERROR_MESSAGE);
            }
        return success;
    }

    public ArrayList<Carta> doArray(String mano){
        ArrayList<Carta> cartasList = new ArrayList<Carta>();
        String[] cartas = mano.split("/");
        Carta carta;
        for(int i = 0; i < cartas.length; i++){
            String[] datos = cartas[i].split("-");
            carta = new Carta(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]), Integer.parseInt(datos[2]));
            cartasList.add(carta);
        }
        return cartasList;
      }

    abstract String ganador();
}