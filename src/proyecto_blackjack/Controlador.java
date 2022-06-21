package proyecto_blackjack;

public class Controlador{
    private Juego juego;
    private Mesa mesa;
    private Inicio inicio;
    private Jugadores jugadores;
    
    public Controlador() {
        this.juego = new Juego();
    }
    public void iniciar(){
        inicio = new Inicio(this);
        inicio.setVisible(true);
    }
    // Comienza el ciclo principal del programa
    public void jugar() {
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
        mesa.setTextJug1(jugador1);
        mesa.setTextJug2(jugador2);
        
    }
}
