package proyecto_blackjack;

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
 */
public class Carta {

  final int As11 = 11;
  int palo = 0;
  int numero = 0;
  int valor = 0;
  
  /**
   * Constructor Carta. Crea una carta y le asigna un numero y un palo.
   * @param numero el numero de la carta
   * @param numero el palo de la carta
   */
  public Carta(int numero, int palo) {
    this.palo = palo;
    this.numero = numero;
    if(numero == 11 || numero == 12 || numero == 13){
      valor = 10;
    }else{
        valor = numero;
    }
  }
  
  /**
   * Retorna palo.
   * @return el palo de una carta
   */
  public int getPalo(){
    return palo;
  }
  
  /**
   * Retorna numero.
   * @return el numero de una carta
   */
  public int getNumero(){
    return numero;
  }

  /**
   * Retorna valor.
   * @return el valor que tiene asignado una carta
   */
  public int getValor() {
      return valor;
  }

  /**
   * Actualiza el valor de un as a 11.
   */
  public void setValorAs() {
    valor = As11;
  }  
}