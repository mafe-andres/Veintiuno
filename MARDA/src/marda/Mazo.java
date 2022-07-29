package marda;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
 */
public class Mazo {

  protected ArrayList<Carta> mazo = new ArrayList<Carta>();
  protected int numCartas;
  protected int numPalos;
  protected String[] palos;

  /**
   * Constructor Mazo. Limpa el mazo, agrega cartas y las mezcla.
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

  public void setMazo(ArrayList<Carta> mazo){
      this.mazo.clear();
      this.mazo = mazo;
  }

  public ArrayList<Carta> getMazo(){
    return mazo;
  }

  public int getSize() {
    return mazo.size();
  }

  public String[] getPalos() {
    return palos;
  }

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

  public String toString(){
    String mazoStr = "";
    for (int i =0; i < mazo.size(); i++){
      Carta carta = mazo.get(i);
      String cartaInfo = Integer.toString(carta.getNumero()) + "-" + Integer.toString(carta.getPalo()) + "-" + Integer.toString(carta.getValor()) + "/";
      mazoStr += cartaInfo;
    }
    return mazoStr;
  }

  public void cargar(String infoMazo){
    mazo = doArray(infoMazo);
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
  
}