package proyecto_blackjack;

import javax.swing.ImageIcon;

public class Carta {

  int palo = 0; // 0 = treboles, 1 = picas 2 = corazones 3 = diamantes
  int numero = 0;
  int ID = 0;
  private ImageIcon imagen;
  
  public Carta(int palo, int numero) {
    this.palo = palo;
    this.numero = numero;
    this.imagen = new ImageIcon(getClass().getResource(getNombreImagen(palo, numero)));
    System.out.println(getClass().getResource(getNombreImagen(palo, numero)));
  }
  
  public int getPalo(){
    return palo;
  }

  public int getNumero(){
    return numero;
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