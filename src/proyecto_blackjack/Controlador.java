package proyecto_blackjack;

public class Controlador{
    private Juego juego;
    private Mesa mesa;
    private Inicio inicio;
    private Jugadores jugadores;
    
    public Controlador(Juego juego) {
        this.juego = juego;
        inicio = new Inicio(this);
        inicio.setVisible(true);
    }
    
     public void jugar(){
        juego.jugar();
    }
     
    public void initJugadores(){
        inicio.setVisible(false);
        jugadores = new Jugadores(this);
        jugadores.setVisible(true);
    }
     
    public void initMesa(String jugador1, String jugador2){
        jugadores.setVisible(false);
        juego.setNombres(jugador1, jugador2);
        mesa = new Mesa(this);
        mesa.setVisible(true);
    }
}
