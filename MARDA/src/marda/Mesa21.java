package marda;

import java.util.ArrayList;

public class Mesa21 extends Mesa{

    final int CARTASXMES = 10;
    final int CARTASXJUG = 5;
 
    public Mesa21(Jugador21 jugador1, Jugador21 jugador2, Mazo mazo){
        this.mazo = mazo;
        setJugadores(jugador1, jugador2);
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

    public String ganador(){
      int victorias1 = jugador1.getVictorias(), victorias2 = jugador2.getVictorias();
      int suma1 = jugador1.suma();
      int suma2 = jugador2.suma();
      String ganador = "";
      if(suma1 <= 21 && suma2 <= 21) {
        if (suma1>suma2) {
          victorias1++;  
          ganador = jugador1.getNombre();
        } else if (suma1<suma2) {
          victorias2++;
          ganador = jugador2.getNombre();
        } else if (suma1==suma2) {
          if (jugador1.getMano().size() < jugador2.getMano().size())  {
            victorias1++; 
            ganador = jugador1.getNombre();
          } else if (jugador1.getMano().size() > jugador2.getMano().size()){
              victorias2++;
              ganador = jugador2.getNombre();
          }else{
              ganador = "Empate";
          }
        }
      } else if (suma1 <= 21) {
          victorias1++;
          ganador = jugador1.getNombre();
      } else if (suma2 <=21) {
          victorias2++;
          ganador = jugador2.getNombre();
      }else{
          ganador = "No hay ganador";
      }
      jugador1.setVictorias(victorias1);
      jugador2.setVictorias(victorias2);
      return ganador;
    }

}
