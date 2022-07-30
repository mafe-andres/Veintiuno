package marda;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Andy Alvarado, María Andres, Gustavo Pinto
 */
public class Mazo {

  protected ArrayList<Carta> mazo = new ArrayList<Carta>();
  protected int numCartas;
  protected int numPalos;
  protected String[] palos;

  /**
   * Constructor Mazo. Construye un mazo segun los parametros que recibe
   * @param numCartas cantidad de cartas del juego
   * @param numPalos cantidad de palos del juego
   * @param palos un arreglo con los diferentes palos del juego
   */
  public Mazo(int numCartas, int numPalos, String[] palos){
    this.numCartas = numCartas;
    this.numPalos = numPalos;
    this.palos = palos;
    iniciarBaraja();
  }
  
  /**
   * Inicia el mazo. Limpia el mazo y agrega las cartas de la baraja francesa. Mezcla las cartas.
   */
  public void iniciarBaraja(){
    mazo.clear();
    Carta cartaNueva;
    for(int i = 1; i <= numCartas; i++ ){
      for (int j = 1; j <= numPalos; j++){
        cartaNueva = new Carta(i,j,i);
        mazo.add(cartaNueva);
      }
    }
    Collections.shuffle(mazo);
  }

  /**
   * Borra el mazo actual y anade uno nuevo
   * @param mazo Mazo nuevo
   */
  public void setMazo(ArrayList<Carta> mazo){
      this.mazo.clear();
      this.mazo = mazo;
  }

  /**
   * Retorna el mazo
   * @return el mazo
   */
  public ArrayList<Carta> getMazo(){
    return mazo;
  }

  /**
   * Retorna el tamano del mazo
   * @return el tamano
   */
  public int getSize() {
    return mazo.size();
  }

  /**
   * Retorna los tipos de palos de las cartas
   * @return un arreglo de tipo string con los palos
   */
  public String[] getPalos() {
    return palos;
  }

  /**
   * Cambia la carta que esta mas encima del mazo
   * @param carta la carta a cambiar
   */
  public void setCartaTop(Carta carta){
    Collections.reverse(mazo);
    mazo.add(carta);
    Collections.reverse(mazo);
  }

  /**
   * Retorna una carta. Agarra la carta en la primera posicion del mazo y la elimina.
   * @return una carta
   */
  public Carta getCartaTop(){
    Carta a = mazo.get(0);
    mazo.remove(0);
    return a;
  }

  /**
   * Retorna toda la informacion del mazo, todas las cartas con sus numeros, palos y valores correspondientes
   * @return la informacion del mazo
   */
  @Override
  public String toString(){
    String mazoStr = "";
    for (int i =0; i < mazo.size(); i++){
      Carta carta = mazo.get(i);
      String cartaInfo = Integer.toString(carta.getNumero()) + "-" + Integer.toString(carta.getPalo()) + "-" + Integer.toString(carta.getValor()) + "/";
      mazoStr += cartaInfo;
    }
    return mazoStr;
  }
  
  /**
   * Carga la informacion del mazo como parametro en el mazo de la clase
   * @param infoMazo String con la informacion del mazo
   */
  public void cargar(String infoMazo){
    mazo = doArray(infoMazo);
  } 

  /**
   * Hace un arreglo de cartas de la informacion de una mano
   * @param mano informacion de la mano de un jugador
   * @return arreglo de cartas
   */
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
  
}