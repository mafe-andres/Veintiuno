package marda;

public class Controlador21 extends Controlador{
    final int numCartasXPalo = 13;
    final int numPalos = 4;

    public Controlador21(){
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        Mazo mazo = new Mazo(numCartasXPalo, numPalos);
        mesa = new Mesa21(jugador1, jugador2, mazo);
        mesaView = new MesaView21(this);
        inicioView = new InicioView(this, "VeintiUno"); 
        jugadoresView = new JugadoresView(this);
    }

    public void nuevaRonda(){

    }
    public void turno(){

    }
    public void actualizarCartas(){

    }
    public void ganador(int ganador){

    }
}