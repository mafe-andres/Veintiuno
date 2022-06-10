import java.util.ArrayList; 

public class Jugador {

  String nombre = " ";
  int victorias = 0;
  ArrayList<Carta> mano = new ArrayList<Carta>();
  
  public Jugador(String n) {
    nombre = n;
  }
  
  public static boolean recibirCarta(){
    return true;
  }

  public static boolean desecharMano(){
    return false;
  }
  
}