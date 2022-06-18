package src;
import java.util.ArrayList; 
import java.util.Scanner;

public class Jugador {

  private String nombre = " ";
  private Boolean termino = false;
  private int victorias = 0;
  private ArrayList<Carta> mano = new ArrayList<>();
  private Boolean AsJugador = false;

  Scanner capt = new Scanner(System.in);

  public Jugador(String n) {
    nombre = n;
    termino = false;
  }
  
  public boolean recibirCarta(){
    System.out.print("Desea mas cartas:\n1. Si \n2. No\n"); // Esto es solo para probarlo por el momento
    int a = capt.nextInt();
    if(a == 1){
      return true;
    }else{
      setTermino(true);
      return false;
    }
  }

  public void desecharMano(){
    mano.clear();
  }

  public int suma(boolean As){
    int suma = 0;
    for(int i = 0; i < mano.size(); i++){
        int manoInt = mano.get(i).numero;
        switch(manoInt){
            case 1:
                if(As == true){
                    suma += 11;
                }else{
                    suma += 1;
                }
            case 11:
                suma += 10;
                break;
            case 12:
                suma += 10;
                break;
            case 13:
                suma += 10;
                break;
            default:
                suma += mano.get(i).numero;
                break;
            }   
        }
    return suma;
  }

  public boolean verificarAs(){
    boolean As = false;
    for(int i = 0; i < mano.size(); i++){
      if(mano.get(i).numero == 1){
        As = true;
      }
    }
    return As;
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

  public boolean getAsJugador(){
  return AsJugador;
  }

  public void setAsJugador(boolean AsJugador){
  this.AsJugador = AsJugador;
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