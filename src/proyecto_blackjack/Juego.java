package proyecto_blackjack;

import java.util.Scanner;


public class Juego {

  private Mazo mazo;
  Jugador jugador1;
  Jugador jugador2;
  private int victorias1, victorias2;
  Scanner capt = new Scanner(System.in);

  public Juego(String name1, String name2) {
    this.jugador1 = new Jugador(name1);
    this.jugador2 = new Jugador(name2);
    this.mazo = new Mazo();
  }

  //Deberia de iniciar la baraja y controlar las rondas (preguntar si quiere jugar otra ronda)
  public void jugar(){
    mazo.iniciarBaraja();
    int jugar = 0;
    int a = 0;
    while(jugar<5){
      ronda();
      System.out.println("Quiere jugar otra vez: \n1. Si\t2.No\n");
      a = capt.nextInt();
      if(a == 1){
        jugar = 4;
        jugador1.desecharMano();
        jugador2.desecharMano();
      }else{
        jugar = 6;
      }
    }
  }
  
  //Deberia de manejar la entrada de cartas y ver si hay As
  public void turno(Jugador jugador){
    if(jugador.recibirCarta()){
      jugador.getMano().add(mazo.getCarta());
    }
    if(jugador.getTermino() == true){
      verificar(jugador);
    }
  }

//Debe de hacer los turnos y despues ver cual es el ganador
  public void ronda(){
      jugador1.setTermino(false); 
      jugador2.setTermino(false);
      jugador1.getMano().add(mazo.getCarta());
      jugador1.getMano().add(mazo.getCarta());
      jugador2.getMano().add(mazo.getCarta());
      jugador2.getMano().add(mazo.getCarta());
      while(true){
        if(jugador1.getTermino() == false){
          System.out.println("Jugador 1");
          mostrarCartas(jugador1);
          turno(jugador1);
          if(jugador1.suma(jugador1.getAsJugador()) > 21){
            jugador1.setTermino(true);
          }
          mostrarCartas(jugador1);
        }
        if(jugador2.getTermino() == false){
          System.out.println("Jugador 2");
          mostrarCartas(jugador2);
          turno(jugador2);
          if(jugador2.suma(jugador2.getAsJugador()) > 21){
            jugador2.setTermino(true);
          }
          mostrarCartas(jugador2);
        }
        if(jugador1.getTermino() == true && jugador2.getTermino() == true){
          break;
        }
      }
      ganador();
  }


  public void mostrarCartas(Jugador jugador){
    for(int i=0;i<jugador.getMano().size();i++){
      System.out.println("Carta:"+jugador.getMano().get(i).getNumero()+" Palo: "+jugador.getMano().get(i).getPalo());
    }
  }

  public void verificar(Jugador jugador){
    if(jugador1.verificarAs() == true){
      System.out.print("Que valor quiere usar con el As\t:\n Digite 1 0 11"); // Esto es solo para probarlo por el momento
      int a = capt.nextInt();
      if(a == 1){
        jugador.setAsJugador(false);
      }else if(a == 11){
        jugador.setAsJugador(true);
      }
    }
  }


  //Ganador solo tiene que verificar la suma
  public void ganador(){
    if(jugador1.suma(jugador1.getAsJugador()) <= 21 && (jugador1.suma(jugador1.getAsJugador()) > jugador2.suma(jugador2.getAsJugador()))||jugador2.suma(jugador2.getAsJugador()) > 21){
      victorias1++;
      jugador1.setVictorias(victorias1);
      System.out.println("El ganador de este turno es " + jugador1.getNombre());
    }else if(jugador2.suma(jugador2.getAsJugador()) <= 21 && (jugador2.suma(jugador2.getAsJugador()) > jugador1.suma(jugador1.getAsJugador()))||jugador1.suma(jugador1.getAsJugador()) > 21){
      victorias2++;
      jugador2.setVictorias(victorias2);
      System.out.println("El ganador de este turno es " + jugador2.getNombre());
    }else{
      System.out.println("Los jugadores quedaron empates");
    }
  }

}