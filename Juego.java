import java.util.Scanner;

public class Juego {

  Mazo mazo;
  Jugador jugador1;
  Jugador jugador2;
	int victorias;
  
  public Juego(String name1, String name2) {
    this.jugador1 = new Jugador(name1);
    this.jugador2 = new Jugador(name2);
		this.mazo = new Mazo();
  }

  public void iniciar(){
    mazo.iniciarBaraja();
    ronda();
  }
  
  public int turno(Jugador jugador){
    if(jugador.recibirCarta()){
      jugador.mano.add(mazo.getCarta());
      return 1;
    }
    return 0;
  }

  public int ronda(){
    while(true){
      if(jugador1.suma(false) > 21 || jugador2.suma(false) > 21){
        break;
      }else if(turno(jugador1) == 0 && turno(jugador2) == 0){
        break;
      }
    }

    if(jugador1.suma(false) > 21){
      jugador2.victorias ++;
      System.out.print("El ganador de este turno es " + jugador2.nombre);
    }else if(jugador2.suma(false) > 21){
      jugador1.victorias ++;
      System.out.print("El ganador de este turno es " + jugador1.nombre);
    }else{
      ganador();    
    }
    return 0;
  }

  public int darCarta(Jugador jugador){

    return 0;
  }

  public void ganador(){
    Scanner capt = new Scanner(System.in);
    boolean AsJugador1 = false;
    boolean AsJugador2 = false;
    if(jugador1.verificarAs() == true){
      System.out.print("Que valor quiere usar con el As\t:\n Digite 1 0 11"); // Esto es solo para probarlo por el momento
      int a = capt.nextInt();
      if(a == 1){
        AsJugador1 = false;
      }else if(a == 11){
        AsJugador1 = true;
      }
    }
    if(jugador2.verificarAs() == true){
      System.out.print("Que valor quiere usar con el As\t:\n Digite 1 0 11"); // Esto es solo para probarlo por el momento
      int a = capt.nextInt();
      if(a == 1){
        AsJugador2 = false;
      }else if(a == 11){
        AsJugador2 = true;
      }
    }
    // Hay que verificar si tiene dos As
    if(jugador1.suma(AsJugador1) < 21 && jugador1.suma(AsJugador1) > jugador2.suma(AsJugador2)){
      jugador1.victorias ++;
      System.out.print("El ganador de este turno es " + jugador1.nombre);
    }else if(jugador2.suma(AsJugador2) < 21 && jugador2.suma(AsJugador2) > jugador1.suma(AsJugador1)){
      jugador2.victorias ++;
      System.out.print("El ganador de este turno es " + jugador2.nombre);
    }
  }

  public void finalizar(){

  }
}