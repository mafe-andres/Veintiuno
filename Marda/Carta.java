package proyecto_blackjack;

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
 */
public class Carta {

  int palo = 0;
  int numero = 0;
  int valor = 0;
  
  /**
   * Constructor Carta. Crea una carta y le asigna un numero y un palo.
   * @param numero el numero de la carta
   * @param numero el palo de la carta
   */
  public Carta(int numero, int palo, int valor) {
    this.palo = palo;
    this.numero = numero;
    this.valor = valor;
  }
  
  /**
   * Actualiza el numero de una carta al numero que se pasa por parametro
   * * @param numero el numero al que se desea cambiar
   */
  public void setNumero(int numero) {
    this.numero = numero;
  } 

  /**
   * Actualiza el palo de una carta al palo que se pasa por parametro
   * * @param palo el palo al que se desea cambiar
   */
  public void setPalo(int palo) {
    this.palo = palo;
  } 
  
  /**
   * Actualiza el valor de una carta al valor que se pasa por parametro
   * * @param valor el valor al que se desea cambiar
   */
  public void setValor(int valor) {
    this.valor = valor;
  }
  
  /**
   * Retorna numero.
   * @return el numero de una carta
   */
  public int getNumero(){
    return numero;
  }

  /**
   * Retorna palo.
   * @return el palo de una carta
   */
  public int getPalo(){
    return palo;
  }

  /**
   * Retorna valor.
   * @return el valor que tiene asignado una carta
   */
  public int getValor() {
      return valor;
  }

}