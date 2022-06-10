public class Juego {

  Mazo mazo;
  Jugador jugador1;
  Jugador jugador2;
	int victorias;
  
  public Juego(String jugador1, String jugador2) {
    this.jugador1 = new Jugador(jugador1);
    this.jugador2 = new Jugador(jugador2);
		this.mazo = new Mazo();
  }

  public void iniciar(){
    mazo.iniciarBaraja();
  }
  
}