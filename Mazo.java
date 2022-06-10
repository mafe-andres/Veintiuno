import java.util.ArrayList;
import java.util.*;

public class Mazo {

  ArrayList<Carta> mazo = new ArrayList<Carta>();

  public void iniciarBaraja(){
    for (int i = 0; i < 13; i++) {
      Carta cartaNueva = new Carta(0, i);
      mazo.add(cartaNueva);
    }
    for (int i = 0; i < 13; i++) {
      Carta cartaNueva = new Carta(1, i);
      mazo.add(cartaNueva);
    }
    for (int i = 0; i < 13; i++) {
      Carta cartaNueva = new Carta(2, i);
      mazo.add(cartaNueva);
    }
    for (int i = 0; i < 13; i++) {
      Carta cartaNueva = new Carta(3, i);
      mazo.add(cartaNueva);
    }
    Collections.shuffle(mazo);
  }

  public Carta getCarta(int id){
    return mazo.get(id);
  }
  
}