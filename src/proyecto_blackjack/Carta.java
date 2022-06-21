package proyecto_blackjack;

import javax.swing.ImageIcon;

public class Carta {
  final int As1 = 1;
  final int As11 = 11;
  int palo = 0; // 0 = treboles, 1 = picas 2 = corazones 3 = diamantes
  int numero = 0;
  int valor = 0;
  private ImageIcon imagen;
  
  public Carta(int palo, int numero) {
    this.palo = palo;
    this.numero = numero;
    this.valor = numero;
    this.imagen = new ImageIcon(getClass().getResource(getNombreImagen(palo, numero)));
    System.out.println(getClass().getResource(getNombreImagen(palo, numero)));
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
    if (valor == As1) {
        valor = As11;
    } else if (valor == As11) {
        valor = As1;
    }
  }
  
  
  public String getNombreImagen(int palo, int numero){
      String nombre = "";
        switch(palo){
            case 0:
                nombre = "/Imagenes/" + numero + "treboles.png";
                break;
            case 1:
                nombre = "/Imagenes/" + numero + "picas.png";
                break;
            case 2:
                nombre = "/Imagenes/" + numero + "corazones.png";
                break;
            case 3:
                nombre = "/Imagenes/" + numero + "diamantes.png";
                break;
        }
      return nombre;
  }
  
}