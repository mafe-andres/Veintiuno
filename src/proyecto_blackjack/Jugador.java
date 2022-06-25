package proyecto_blackjack;

import java.util.ArrayList; 

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
 */
public class Jugador {

  private String nombre = " ";
  private Boolean sePlanto = false;
  private int victorias = 0;
  private ArrayList<Carta> mano = new ArrayList<Carta>();

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
   * Cambia el valor de un as.
   * @param pos la posicion del as
   */
  public void cambiarAs(int pos){
    mano.get(pos).setValorAs();
  }

  /**
   * Cambia si el jugador ya no quiere mas cartas.
   * @param termino booleano que indica si el jugador se planto
   */
  public void setSePlanto(boolean termino){
    this.sePlanto = termino;
  }

  /**
   * Retorna si el jugador esta plantado.
   * @return si el jugador esta plantado o no
   */
  public boolean getSePlanto(){
    return sePlanto;
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
}