package proyecto_blackjack;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class Juego {

  final int CARTASXMES = 10;
  final int CARTASXJUG = 5;
  private Mazo mazo;
  Jugador jugador1;
  Jugador jugador2;

  /**
   * Constructor Juego. Crea dos jugadores y un mazo.
   */
  public Juego() {
    this.jugador1 = new Jugador();
    this.jugador2 = new Jugador();
    this.mazo = new Mazo();
  }

  /**
   * Incializa el juego. Inicializa la baraja y actualiza las victorias del jugador a 0.
   */
  public void inicializarJuego(){
    mazo.iniciarBaraja();
  }
  
  /**
   * Incializa el ronda. Desecha las manos de lso jugadores y les reparte dos nuevas.
   */
  public void inicializarRonda() {
      jugador1.desecharMano();
      jugador2.desecharMano();
      repartirCarta(1);
      repartirCarta(1);
      repartirCarta(2);
      repartirCarta(2);
  }
  
  /**
   * Actualiza el nombre de los jugadores.
   * @param jugador1 el nombre del jugador 1
   * @param jugador2 el nombre del jugador 2
   */
  public void setNombres(String jugador1, String jugador2){
    this.jugador1.setNombre(jugador1);
    this.jugador2.setNombre(jugador2);
  }
  
  /**
   * Le reparte una carta a un jugador. No se permiten mas de CARTASXJUG por jugador.
   * @param jugador el nombre del jugador al que se le va a dar la carta
   */
  public void repartirCarta(int jugador){
    Carta card = mazo.getCarta();
    if (jugador ==1 && jugador1.getMano().size()<=CARTASXJUG) {
        jugador1.recibirCarta(card);
    } else if(jugador ==2 && jugador2.getMano().size()<=CARTASXJUG) {
        jugador2.recibirCarta(card);
    }
  }
  
  /**
   * Retorna las cartas que estan sobre la mesa. Retorna las cartas de jugador 1 y jugador 2.
   * @return arreglo con las cartas sobre la mesa
   */
  public ArrayList<Integer> getCartasMesa(){
    ArrayList<Integer> cartas = new ArrayList<Integer>(2*CARTASXMES);
    int numero =0;
    int palo =0;
    for(int i=0; i<CARTASXJUG;i++){
      if (i<jugador1.getMano().size()){
        numero = jugador1.getMano().get(i).getNumero();
        palo = jugador1.getMano().get(i).getPalo();
      } else {
          numero= 0;
          palo= 0;
      }
      cartas.add(numero);
      cartas.add(palo);
    }
    for(int i=0;i<CARTASXJUG;i++){
      if (i<jugador2.getMano().size()){
        numero = jugador2.getMano().get(i).getNumero();
        palo = jugador2.getMano().get(i).getPalo();
      } else {
          numero= 0;
          palo= 0;
      }
      cartas.add(numero);
      cartas.add(palo);
    }
    return cartas;
  }

  /**
   * Cambia el valor de un as.
   * @param jugador el nombre del jugador que tiene el as
   * @param pos las posicion del as
   */
  public void cambiarAs(int jugador, int pos) {
      if(jugador == 1){
          jugador1.cambiarAs(pos-1);
      }else{
          jugador2.cambiarAs(pos-1);
      }
  }
  
  /**
   * Retorna la suma de la mano de un jugador.
   * @param jug el nombre del jugador
   * @return la suma de la mano de un jugador
   */
  public int getSumaJug(int jug){
      int suma = 0;
      if(jug == 1){
          suma = jugador1.suma();
      }else if(jug == 2){
          suma = jugador2.suma();
      }
      return suma;
  }
  
  /**
   * Retorna el ganador de una ronda. Calcula la suma de las manos de ambos jugadores
   * las compara para encontrar el gandor o indicar empate.
   * @return un string con el nombre del jugador, si es empate o si no hay ganador
   */
  public String ganador(){
    int victorias1 = jugador1.getVictorias(), victorias2 = jugador2.getVictorias();
    int suma1 = jugador1.suma();
    int suma2 = jugador2.suma();
    String ganador = "";
    if(suma1 <= 21 && suma2 <= 21) {
      if (suma1>suma2) {
        victorias1++;  
        ganador = jugador1.getNombre();
      } else if (suma1<suma2) {
        victorias2++;
        ganador = jugador2.getNombre();
      } else if (suma1==suma2) {
        if (jugador1.getMano().size() < jugador2.getMano().size())  {
          victorias1++; 
          ganador = jugador1.getNombre();
        } else if (jugador1.getMano().size() > jugador2.getMano().size()){
            victorias2++;
            ganador = jugador2.getNombre();
        }else{
            ganador = "Empate";
        }
      }
    } else if (suma1 <= 21) {
        victorias1++;
        ganador = jugador1.getNombre();
    } else if (suma2 <=21) {
        victorias2++;
        ganador = jugador2.getNombre();
    }else{
        ganador = "No hay ganador";
    }
    jugador1.setVictorias(victorias1);
    jugador2.setVictorias(victorias2);
    return ganador;
  }
  
  /**
   * Retorna si un jugador esta plantado.
   * @param jug el jugador que se va a preguntar
   * @return booleano que indica si el jugador esta plantado
   */
  public boolean getPlantarse(int jug) {
    boolean response = false;
    if (jug == 1) {
      response = jugador1.getSePlanto();
    } else if (jug == 2) {
        response = jugador2.getSePlanto();
    }
    return response;
  }
  
  /**
   * Actualiza si un jugador esta plantado.
   * @param jug el jugador que se va a plantar o no
   * @param plantado si el jugador se va a plantar o no
   */
  public void setPlantarse(int jug, boolean plantado) {
    if (jug == 1) {
      jugador1.setSePlanto(plantado);
    } else if (jug == 2) {
      jugador2.setSePlanto(plantado);
    }
  }
  
  public boolean guardarPartida(){
    String path = "juegoGuardado.txt";
    boolean success = false;
    File file = new File(path);
    try{
      if(!file.exists()) {
        file.createNewFile();
      }
    }catch(IOException e) {
        JOptionPane.showMessageDialog(null, "Ha habido un error al guardar el archivo","Error",JOptionPane.ERROR_MESSAGE);
    }
    String infoJugador1 = jugador1.getNombre() + "," + Integer.toString(jugador1.getVictorias()) + ",";
    for (int i = 0; i < jugador1.getMano().size(); i++){
        String carta = Integer.toString(jugador1.getMano().get(i).getNumero()) + "-" + Integer.toString(jugador1.getMano().get(i).getPalo()) + "/";
        infoJugador1 = infoJugador1 + carta;
    }
    infoJugador1 = infoJugador1 + "\n";

    String infoJugador2 = jugador2.getNombre() + "," + Integer.toString(jugador2.getVictorias()) + ",";
    for (int i = 0; i < jugador2.getMano().size(); i++){
        String carta = Integer.toString(jugador2.getMano().get(i).getNumero()) + "-" + Integer.toString(jugador2.getMano().get(i).getPalo()) + "/";
        infoJugador2 = infoJugador2 + carta;
    }
    infoJugador2 = infoJugador2 + "\n";

    String infoMazo = "";
    for (int i = 0; i < mazo.getSize(); i++){
        Carta carta = mazo.getMazo().get(i);
        String cartaInfo = Integer.toString(carta.getNumero()) + "-" + Integer.toString(carta.getPalo()) + "/";
        infoMazo = infoMazo + cartaInfo;
    }
    infoMazo = infoMazo + "\n";

    String fileContent = infoJugador1 + infoJugador2 + infoMazo;

    try(FileWriter fileWriter = new FileWriter(path)) {
        fileWriter.write(fileContent);
        success = true;
        fileWriter.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Ha habido un error al escribir el archivo","Error",JOptionPane.ERROR_MESSAGE);
    }
    return success;
   }
  
  public boolean cargarPartida() {
    String path = "juegoGuardado.txt";
    BufferedReader reader;
    String infoJugador1 = "";
    String infoJugador2 = "";
    String infoMazo = "";
    boolean success = false;
    try {
        reader = new BufferedReader(new FileReader(path));
        infoJugador1 = reader.readLine();
        infoJugador2 = reader.readLine();
        infoMazo = reader.readLine();
        reader.close();
        String[] datosJugador1 = infoJugador1.split(",");
        String[] datosJugador2 = infoJugador2.split(",");
        jugador1.setNombre(datosJugador1[0]);
        jugador1.setVictorias(Integer.parseInt(datosJugador1[1]));
        jugador1.setMano(doArray(datosJugador1[2]));
        jugador2.setNombre(datosJugador2[0]);
        jugador2.setVictorias(Integer.parseInt(datosJugador2[1]));
        jugador2.setMano(doArray(datosJugador2[2]));
        mazo.setMazo(doArray(infoMazo));
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
           carta = new Carta(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]));
           cartasList.add(carta);
       }
       return cartasList;
   }
}
