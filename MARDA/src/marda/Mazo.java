package marda;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
 */
public class Mazo {

  private ArrayList<Carta> mazo = new ArrayList<Carta>();
  private int numCartas;
  private int numPalos;

  /**
   * Constructor Mazo. Limpa el mazo, agrega cartas y las mezcla.
   */
  public Mazo(int numCartas, int numPalos){
    this.numCartas = numCartas;
    this.numPalos = numPalos;
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

  public void escribirMazo(String path){
    //write mazo
  }
  
}