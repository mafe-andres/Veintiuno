public class Carta {

  int palo = 0;
  int numero = 0;
  int ID = 0;
  
  public Carta(int palo, int numero) {
    this.palo = palo;
    this.numero = numero;
  }
  
  public int getPalo(){
    return palo;
  }

  public int getNumero(){
    return numero;
  }
  
}