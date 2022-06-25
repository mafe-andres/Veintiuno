package proyecto_blackjack;

import java.util.ArrayList;

public class Juego {

  final int CARTASXMES = 10;
  final int CARTASXJUG = 5;
  private Mazo mazo;
  Jugador jugador1;
  Jugador jugador2;
  private int victorias1, victorias2;

  /**
   * Constructor Juego. Crea dos jugadores y un mazo.
   */
  public Juego() {
    this.jugador1 = new Jugador();
    this.jugador2 = new Jugador();
    this.mazo = new Mazo();
  }

  /**
   * Incializa el juego. Inicializa la baraja y actualiza las victorias del jugador a 0.
   */
  public void inicializarJuego(){
    mazo.iniciarBaraja();
    victorias1 = 0;
    victorias2 = 0;
  }
  
  /**
   * Incializa el ronda. Desecha las manos de lso jugadores y les reparte dos nuevas.
   */
  public void inicializarRonda() {
      jugador1.desecharMano();
      jugador2.desecharMano();
      repartirCarta(1);
      repartirCarta(1);
      repartirCarta(2);
      repartirCarta(2);
  }
  
  /**
   * Actualiza el nombre de los jugadores.
   * @param jugador1 el nombre del jugador 1
   * @param jugador1 el nombre del jugador 2
   */
  public void setNombres(String jugador1, String jugador2){
    this.jugador1.setNombre(jugador1);
    this.jugador2.setNombre(jugador2);
  }
  
  /**
   * Le reparte una carta a un jugador. No se permiten mas de CARTASXJUG por jugador.
   * @param jugador el nombre del jugador al que se le va a dar la carta
   */
  public void repartirCarta(int jugador){
    Carta card = mazo.getCarta();
    if (jugador ==1 && jugador1.getMano().size()<=CARTASXJUG) {
        jugador1.recibirCarta(card);
    } else if(jugador ==2 && jugador2.getMano().size()<=CARTASXJUG) {
        jugador2.recibirCarta(card);
    }
  }
  
  /**
   * Retorna las cartas que estan sobre la mesa. Retorna las cartas de jugador 1 y jugador 2.
   * @return arreglo con las cartas sobre la mesa
   */
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

  /**
   * Cambia el valor de un as.
   * @param jugador el nombre del jugador que tiene el as
   * @param pos las posicion del as
   */
  public void cambiarAs(int jugador, int pos) {
      if(jugador == 1){
          jugador1.cambiarAs(pos-1);
      }else{
          jugador2.cambiarAs(pos-1);
      }
  }
  
  /**
   * Retorna la suma de la mano de un jugador.
   * @param jug el nombre del jugador
   * @return la suma de la mano de un jugador
   */
  public int getSumaJug(int jug){
      int suma = 0;
      if(jug == 1){
          suma = jugador1.suma();
      }else if(jug == 2){
          suma = jugador2.suma();
      }
      return suma;
  }
  
  /**
   * Retorna el ganador de una ronda. Calcula la suma de las manos de ambos jugadores
   * las compara para encontrar el gandor o indicar empate.
   * @return un string con el nombre del jugador, si es empate o si no hay ganador
   */
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
  
  /**
   * Retorna si un jugador esta plantado.
   * @param jug el jugador que se va a preguntar
   * @return booleano que indica si el jugador esta plantado
   */
  public boolean getPlantarse(int jug) {
    boolean response = false;
    if (jug == 1) {
      response = jugador1.getSePlanto();
    } else if (jug == 2) {
        response = jugador2.getSePlanto();
    }
    return response;
  }
  
  /**
   * Actualiza si un jugador esta plantado.
   * @param jug el jugador que se va a plantar o no
   * @param platado si el jugador se va a plantar o no
   */
  public void setPlantarse(int jug, boolean plantado) {
    if (jug == 1) {
      jugador1.setSePlanto(plantado);
    } else if (jug == 2) {
      jugador2.setSePlanto(plantado);
    }
  }
}
