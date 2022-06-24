package proyecto_blackjack;

import java.util.ArrayList;

public class Juego {
  final int CARTASXMES = 10;
  final int CARTASXJUG = 5;
  private Mazo mazo;
  Jugador jugador1;
  Jugador jugador2;
  private int victorias1, victorias2;

  public Juego() {
    this.jugador1 = new Jugador();
    this.jugador2 = new Jugador();
    this.mazo = new Mazo();
  }

  public void inicializarJuego(){
    mazo.iniciarBaraja();
    victorias1 = 0;
    victorias2 = 0;
  }
  
  public void inicializarRonda() {
      jugador1.desecharMano();
      jugador2.desecharMano();
      repartirCarta(1);
      repartirCarta(1);
      repartirCarta(2);
      repartirCarta(2);
  }
  
  public void setNombres(String jugador1, String jugador2){
    this.jugador1.setNombre(jugador1);
    this.jugador2.setNombre(jugador2);
  }
  
  public void repartirCarta(int jugador){
    Carta card = mazo.getCarta();
    if (jugador ==1 && jugador1.getMano().size()<=CARTASXJUG) {
        jugador1.recibirCarta(card);
    } else if(jugador ==2 && jugador2.getMano().size()<=CARTASXJUG) {
        jugador2.recibirCarta(card);
    }
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

  public void cambiarAs(int jugador, int pos) {
      if(jugador == 1){
          jugador1.cambiarAs(pos-1);
      }else{
          jugador2.cambiarAs(pos-1);
      }
  }
  
  public int getSumaJug(int jug){
      int suma = 0;
      if(jug == 1){
          suma = jugador1.suma();
      }else if(jug == 2){
          suma = jugador2.suma();
      }
      return suma;
  }
  
  public String ganador(){
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
    return ganador;
  }
}
