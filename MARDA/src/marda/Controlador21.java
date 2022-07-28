package marda;

import java.util.ArrayList;

public class Controlador21 extends Controlador{
    final int numCartasXPalo = 13;
    final int numPalos = 4;

    public Controlador21(){
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        Mazo mazo = new Mazo(numCartasXPalo, numPalos);
        mesa = new Mesa21(jugador1, jugador2, mazo);
        mesaView = new MesaView21(this);
        inicioView = new InicioView(this, "VeintiUno", "/Imagenes/Logo.png"); 
        jugadoresView = new JugadoresView(this, "/Imagenes/Logo.png");
    }

    public void nuevaRonda(){

    }
    public void turno(){

    }
    
    public void actualizarCartas(){

    }
    public void ganador(int ganador){

    }

    public String getCartaOculta(int jug){
        ArrayList<Integer> cartas = mesa.getCartasMesa();
        int num;
        int palo;
        if (jug == 1) {
            num = cartas.get(0);
            palo = cartas.get(1);
        } else{
            num = cartas.get(10);
            palo = cartas.get(11);
        }
        return getRutaCarta(num,palo);   
    }
}