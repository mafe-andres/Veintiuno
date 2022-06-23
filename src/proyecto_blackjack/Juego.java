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

  //Deberia de iniciar la baraja y controlar las rondas (preguntar si quiere jugar otra ronda)
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
  
  
  // Devuelve las cartas que hay en la mesa actualmente organizadas en un arraylist
  // De la pos 0-9 jugador1, 10-19 jugador2. 
  //Vienen organizadas primero el numero y luego el palo de cada carta y en orden que se han pedido.
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

  public void cambiarAs(Jugador jugador, int pos) {
      jugador.cambiarAs(pos);
  }
  
  //Ganador solo tiene que verificar la suma
  public void ganador(){
      // Se simplifico
    int suma1 = jugador1.suma();
    int suma2 = jugador2.suma();
  
    if(suma1 <= 21 && suma2 <= 21) {
      if (suma1>suma2) {
        victorias1++;  
      } else if (suma1<suma2) {
        victorias2++;
      } else if (suma1==suma2) {
        if (jugador1.getMano().size() < jugador2.getMano().size())  {
          victorias1++;  
        } else if (jugador1.getMano().size() > jugador2.getMano().size()){
            victorias2++;
        }
      }
    } else if (suma1 <= 21) {
        victorias1++;
    } else if (suma2 <=21) {
        victorias2++;
    }
  }
}