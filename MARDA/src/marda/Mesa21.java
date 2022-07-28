package marda;

import java.util.ArrayList;

public class Mesa21 extends Mesa{

    final int CARTASXMES = 10;
    final int CARTASXJUG = 5;
 
    public Mesa21(Jugador jugador1, Jugador jugador2, Mazo mazo){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.mazo = mazo;
    }

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

}
