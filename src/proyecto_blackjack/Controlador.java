package proyecto_blackjack;

public class Controlador{
    private Juego juego;
    private Mesa mesa;
    private Inicio inicio;
    private Jugadores jugadores;
    private JugarDeNuevo jugarDeNuevo;
    private boolean fin;
    
    public Controlador() {
        this.juego = new Juego();
    }
    public void iniciar(){
        inicio = new Inicio(this);
        inicio.setVisible(true);
        // Preguntar quien va primero TODO
    }
    // Comienza el ciclo principal del programa
    public void jugar() {
        // Probar
        while (ronda()) {}
        finalizar();
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
    
    public boolean ronda() {
        fin = true;
        juego.inicializarRonda();
        turno(1);
        turno(2);
        jugarDeNuevo = new JugarDeNuevo();
        jugarDeNuevo.setVisible(true);
        return true;
    }
    
    public void turno(int jug) {
        if (jug == 1) { // turno jug1
            
        } else { // turno jug2
            
        }
    }
    
    public void finalizar() {
        
    }
}
