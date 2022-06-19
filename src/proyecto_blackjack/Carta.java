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
//    this.imagen = new ImageIcon(getClass().getResource("/cartas/"+getNombreImagen(palo, numero)));
  }
  
  public int getPalo(){
    return palo;
  }

  public int getNumero(){
    return numero;
  }
  
  public String getNombreImagne(int palo, int numero){
      String nombre = "";
      //switch(palo){
          
      
      return nombre;
  }
  
}