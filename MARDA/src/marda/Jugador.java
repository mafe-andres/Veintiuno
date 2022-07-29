package marda;

import java.util.ArrayList; 

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
 */
public class Jugador {

  protected String nombre = " ";
  protected int puntaje = 0;
  protected int victorias = 0;
  protected ArrayList<Carta> mano = new ArrayList<Carta>();

  /**
   * Constructor Jugador.
   */
  public Jugador() {
  }
  
  /**
   * Agrega carta a la mano del jugador.
   * @param carta la carta que se va a agregar
   */
  public void recibirCarta(Carta carta){
    mano.add(carta);
  }

  /**
   * Desecha la mano del jugador.
   */
  public void desecharMano(){
    mano.clear();
  }

  /**
   * Calcula la suma de la mano del jugador.
   */
  public int suma(){
    int suma = 0;
    for(int i = 0; i < mano.size(); i++){
      suma += mano.get(i).getValor();
    }
    return suma;
  }


  /**
   * Retorna la mano del jugador.
   * @return la mano del jugador
   */
  public ArrayList<Carta> getMano(){
    return mano;
  }

  /**
   * Retorna el nombre del jugador.
   * @return el nombre del jugador
   */
  public String getNombre(){
    return nombre;
  }

  /**
   * Cambia el nombre del jugador.
   * @param nombre el nombre del jugador
   */
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  /**
   * Retorna la cantidad de victorias del jugador.
   * @return las victorias del jugador
   */
  public int getVictorias(){
    return victorias;
  }

  /**
   * Cambia la cantidad de victorias del jugador.
   * @param victorias las victorias del jugador
   */
  public void setVictorias(int victorias){
    this.victorias = victorias;
  }
  
  /**
   * Cambia la mano del jugador.
   * @param mano arreglo con las cartas de la mano del jugador
   */
  public void setMano(ArrayList<Carta> mano){
      this.mano.clear();
      this.mano = mano;
  }


  /**
   * Retorna el puntaje del jugador.
   * @return puntaje del jugador
   */
  public int getPuntaje(){
    return puntaje;
  }

  /**
   * Cambia la cantidad de victorias del jugador.
   * @param puntaje las victorias del jugador
   */
  public void setPuntaje(int puntaje){
    this.puntaje = puntaje;
  }
  
  public String toString(){
    String jugadorStr = nombre + "," + puntaje + "," + victorias + ",";
    for (int i = 0; i < mano.size(); i++){
      Carta carta = mano.get(i);
      String cartaInfo = Integer.toString(carta.getNumero()) + "-" + Integer.toString(carta.getPalo()) + "-" + Integer.toString(carta.getValor()) + "/";
      jugadorStr += cartaInfo;
    }
    return jugadorStr;
  }

  public void cargar(String infoJugador){
    String[] datosJugador1 = infoJugador.split(",");
    this.nombre = datosJugador1[0];
    this.puntaje = Integer.parseInt(datosJugador1[1]);
    this.victorias = Integer.parseInt(datosJugador1[2]);
    this.mano = doArray(datosJugador1[3]);
  }

  private ArrayList<Carta> doArray(String mano){
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

}
  