package proyecto_blackjack;

import java.util.ArrayList; 

public class Jugador {

  private String nombre = " ";
  private Boolean termino = false;
  private int victorias = 0;
  private ArrayList<Carta> mano = new ArrayList<Carta>();

  public Jugador() {
    termino = false;
  }
  
  public void recibirCarta(Carta carta){
    mano.add(carta);
  }

  public void desecharMano(){
    mano.clear();
  }

  public int suma(){
    int suma = 0;
    for(int i = 0; i < mano.size(); i++){
      suma += mano.get(i).getValor();
    }
    return suma;
  }

  public void cambiarAs(int pos){
    mano.get(pos).setValorAs();
  }

  public void setTermino(boolean termino){
  this.termino = termino;
  }

  public boolean getTermino(){
  return termino;
  }

  public ArrayList<Carta> getMano(){
    return mano;
  }

  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public int getVictorias(){
    return victorias;
  }

  public void setVictorias(int victorias){
    this.victorias = victorias;
  }
}