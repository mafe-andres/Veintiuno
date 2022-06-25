package proyecto_blackjack;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
 */
public class Mazo {

  private ArrayList<Carta> mazo = new ArrayList<Carta>();

  /**
   * Constructor Mazo.
   */
  public void Mazo(){
  }
  
  /**
   * Inicia el mazo. Limpia el mazo y agrega las cartas de la baraja francesa. Mezcla las cartas.
   */
  public void iniciarBaraja(){
    mazo.clear();
    Carta cartaNueva;
    for (int i = 1; i < 14; i++) {
      cartaNueva = new Carta(i, 0);
      mazo.add(cartaNueva);
    }
    for (int i = 1; i < 14; i++) {
      cartaNueva = new Carta(i, 1);
      mazo.add(cartaNueva);
    }
    for (int i = 1; i < 14; i++) {
      cartaNueva = new Carta(i, 2);
      mazo.add(cartaNueva);
    }
    for (int i = 1; i < 14; i++) {
      cartaNueva = new Carta(i, 3);
      mazo.add(cartaNueva);
    }
    Collections.shuffle(mazo);
  }

  /**
   * Retorna una carta. Agarra la carta en la primera posicion del mazo y la elimina.
   * @return una carta
   */
  public Carta getCarta(){
    Carta a = mazo.get(0);
    mazo.remove(0);
    return a;
  }
}