package proyecto_blackjack;

import java.util.ArrayList;
import java.util.*;

public class Mazo {

  ArrayList<Carta> mazo = new ArrayList<Carta>();

  public void iniciarBaraja(){
      mazo.clear(); //Se limpia por si hay cartas
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

  public Carta getCarta(){
    Carta a = mazo.get(0);
    mazo.remove(0);
    return a;
  }
  
}