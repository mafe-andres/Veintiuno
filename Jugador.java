import java.util.ArrayList; 
import java.util.Scanner;

public class Jugador {

  String nombre = " ";
  int victorias = 0;
  ArrayList<Carta> mano = new ArrayList<Carta>();
  
  public Jugador(String n) {
    nombre = n;
  }
  
  public boolean recibirCarta(){
    Scanner capt = new Scanner(System.in);
    System.out.print("Desea mas cartas:\nDigite 1 para SI y 2 para NO "); // Esto es solo para probarlo por el momento
    int a = capt.nextInt();
    if(a == 1){
      return true;
    }else if(a == 2){
      return false;
    }else{
      return false;
    }
  }

  public void desecharMano(){
    mano.clear();
  }

  public int suma(boolean As){
    int suma = 0;
    for(int i = 0; i < mano.size(); i++){
      if(mano.get(i).numero == 11 || mano.get(i).numero == 12 || mano.get(i).numero == 13){
        suma += 10;
      }else if(mano.get(i).numero == 1){
        if(As == true){
          suma += 11;
        }else{
          suma += 1;
        }
      }else{
        suma += mano.get(i).numero;
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
}