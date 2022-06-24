package proyecto_blackjack;

public class Carta {
  final int As11 = 11;
  int palo = 0;
  int numero = 0;
  int valor = 0;
  
  public Carta(int numero, int palo) {
    this.palo = palo;
    this.numero = numero;
    if(numero == 11 || numero == 12 || numero == 13){
      valor = 10;
    }else{
        valor = numero;
    }
  }
  
  public int getPalo(){
    return palo;
  }

  public int getNumero(){
    return numero;
  }
  
  public int getValor() {
      return valor;
  }
  public void setValorAs() {
    valor = As11;
  }  
}