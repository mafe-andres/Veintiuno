package proyecto_blackjack;

class Controlador {
    static Jugadores jugadores = new Jugadores();
    public static void main(String[] args) {
        jugadores.setVisible(true);
        Juego juego = new Juego("Andy", "Mafe");
        juego.jugar();
    }
}
