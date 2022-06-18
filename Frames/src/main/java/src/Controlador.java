package src;

public class Controlador {
  public Controlador (String nombre1, String nombre2){
      Juego juego = new Juego(nombre1, nombre2);
        juego.jugar();
  }
}