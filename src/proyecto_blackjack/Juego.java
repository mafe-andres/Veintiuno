package proyecto_blackjack;

import java.util.Scanner;


public class Juego {

  private Mazo mazo;
  Jugador jugador1;
  Jugador jugador2;
  private int victorias1, victorias2;
  //Scanner capt = new Scanner(System.in);

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
  }
  
  public void setNombres(String jugador1, String jugador2){
    this.jugador1.setNombre(jugador1);
    this.jugador2.setNombre(jugador2);
  }
  
  public void repartirCarta(Jugador jugador){
    jugador.recibirCarta(mazo.getCarta());
  }
  
  
  // Metodo de prueba
  public void mostrarCartas(Jugador jugador){
    for(int i=0;i<jugador.getMano().size();i++){
      System.out.println("Carta:"+jugador.getMano().get(i).getNumero()+" Palo: "+jugador.getMano().get(i).getPalo());
    }
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