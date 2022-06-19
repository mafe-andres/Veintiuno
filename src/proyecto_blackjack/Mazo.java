package proyecto_blackjack;

import java.util.ArrayList;
import java.util.*;

public class Mazo {

  ArrayList<Carta> mazo = new ArrayList<Carta>();

  public void iniciarBaraja(){
    for (int i = 1; i < 14; i++) {
      Carta cartaNueva = new Carta(0, i);
      mazo.add(cartaNueva);
    }
    for (int i = 1; i < 14; i++) {
      Carta cartaNueva = new Carta(1, i);
      mazo.add(cartaNueva);
    }
    for (int i = 1; i < 14; i++) {
      Carta cartaNueva = new Carta(2, i);
      mazo.add(cartaNueva);
    }
    for (int i = 1; i < 14; i++) {
      Carta cartaNueva = new Carta(3, i);
      mazo.add(cartaNueva);
    }
    Collections.shuffle(mazo);
  }

  public Carta getCarta(){
    Carta a = mazo.get(0);
    mazo.remove(0);
    return a;
  }
  
}