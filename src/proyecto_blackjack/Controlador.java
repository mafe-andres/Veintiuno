package proyecto_blackjack;

public class Controlador{
    private Juego juego;
    private Mesa mesa;
    
    public Controlador(String jugador1, String jugador2) {
        mesa = new Mesa();
        mesa.setVisible(true);
        juego = new Juego(jugador1, jugador2); 
    }
    
     public void jugar(){
         juego.jugar();
     }
}
