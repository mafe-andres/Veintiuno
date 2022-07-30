package marda;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Esta clase define el controlador concreto del juego 21, el cual será el encargado de controlar a las clases modelo concreto y vista concreta.
 * @author: Andy Alvarado, Gustavo Pinto y Maria Andres
 * @version: 2022
 */
public class Controlador21 extends Controlador{
    final int numCartasXPalo = 13;
    final int numPalos = 4;
    private Mesa21 my_mesa;
    private Jugador21 my_jugador1;
    private Jugador21 my_jugador2;
    private AsesView[] ases = new AsesView[4];
    private int asMano, asVerificados;

     /**
     * Constructor Controlador Concreto. Inicializa el las vistas y determina los palos y imagenes de las cartas
     */
    public Controlador21(){
        my_jugador1 = new Jugador21();
        my_jugador2 = new Jugador21();
        String[] palos = {"treboles", "picas" ,"corazones", "diamantes"};
        Mazo mazo = new Mazo(numCartasXPalo, numPalos, palos);
        my_mesa = new Mesa21(my_jugador1, my_jugador2, mazo);
        mesaView = new MesaView21(this);
        inicioView = new InicioView(this, "VeintiUno", "/Imagenes/Logo.png"); 
        ganadorView = new GanadorView(this, "/Imagenes/Logo.png");
        jugadoresView = new JugadoresView(this, "/Imagenes/Logo.png");
        setMesa(my_mesa);
        iniciar();
    }
    
     /**
   * Desecha las cartas y empieza el juego de nuevo con un nuevo maso
   */
    public void nuevaRonda(){
        mesa.jugador1.desecharMano();
        mesa.jugador2.desecharMano();
        my_jugador1.setSePlanto(false);
        my_jugador2.setSePlanto(false);
        mesa.jugador1.recibirCarta(my_mesa.mazo.getCartaTop());
        mesa.jugador1.recibirCarta(my_mesa.mazo.getCartaTop());
        mesa.jugador2.recibirCarta(my_mesa.mazo.getCartaTop());
        mesa.jugador2.recibirCarta(my_mesa.mazo.getCartaTop());
        mesaView.setVictorias(mesa.jugador1.getVictorias(),mesa.jugador2.getVictorias());
        actualizarCartas();
        turno = 1;
        turno();
    }
    
     /**
   * Dependiendo del turno actual, declara un ganador o sigue con el juego
   */
    public void turno(){
        if(turno == 3){
            ganador();
        } else {
            actualizarCartas();
            mesaView.mostrarTurno();
            mesaView.mostrarPlantarse();
        }
    }
    
     /**
   * Actualiza las cartas en la mesa
   */
    public void actualizarCartas() {
        ArrayList<Integer> cartas = my_mesa.getCartasMesa();
        int num = cartas.get(0);
        int palo = cartas.get(0);
        for (int i = 0; i< 10; i++) {
            num= cartas.get(i*2);
            palo = cartas.get((i*2)+1);
            if (num!=0){
              mesaView.setIconCarta(i+1,getRutaCarta(num,palo));
              mesaView.showCarta(i+1);
            } else {
                mesaView.hideCarta(i+1);
            }
        }
        mesaView.setIconCarta(1,"/Imagenes/back.png");
        mesaView.setIconCarta(6,"/Imagenes/back.png");
    }
    
     /**
   * Devuelve la carta oculta de un jugador especifico
   * @param jug el jugador del cual se debe averiguar la carta oculta
   * @return carta oculta
   */
    public String getCartaOculta(int jug){
        ArrayList<Integer> cartas = my_mesa.getCartasMesa();
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
    
     /**
   * Cambia si un jugador esta plantado o no
   * @param jugador Jugador que se planto
   * @param plantado Si esta plantado o no
   */
    public void setPlantarse(int jugador, boolean plantado){
        if (jugador == 1){
            my_jugador1.setSePlanto(plantado);
        } else {
            my_jugador2.setSePlanto(plantado);
        }
    }
    
     /**
   * Cambia el turno al siguiente
   */
    public void nextTurno(){
        if (turno == 1) {
            if (my_jugador2.getSePlanto() == true){
                if (my_jugador1.getSePlanto() == true) {
                    turno = 3;
                }
            } else {
                turno = 2;
            }
        } else if (turno ==2) {
            if (my_jugador1.getSePlanto() == true){
                if (my_jugador2.getSePlanto() == true) {
                    turno = 3;
                }
            } else {
                turno = 1;
            }
        }
        turno();
    }
    
     /**
   * Se encarga de darle una carta al jugador dependiendo del turno
   */
    public void pedirCarta(){
        if (turno == 1){
            mesa.jugador1.recibirCarta(my_mesa.mazo.getCartaTop());
        } else if (turno == 2){
            mesa.jugador2.recibirCarta(my_mesa.mazo.getCartaTop());
        }

    }
    
     /**
   * Finaliza el turno del jugador, y verifica el valor de los ases
   */
    public void finalizarTurno(){
        asVerificados ++;
        if(asVerificados == asMano){
            setPlantarse(turno, true);
            nextTurno();
        }
    }
    
     /**
   * Verifica si un jugador tiene ases en su mano para preguntarle por el valor que le desea dar
   */
    public void verificarAses(){
        boolean encontro = false;
        ArrayList<Carta> cartas;
        if(turno == 1){
            cartas = my_mesa.jugador1.getMano();
        }else{
            cartas = my_mesa.jugador2.getMano();
        }
        asMano = 0;
        int contadorAses = 0;
        for(int i = 0; i < cartas.size(); i++){
            if(cartas.get(i).getNumero() == 1){
                encontro = true;
                ases[contadorAses] = new AsesView(this);
                ases[contadorAses].setAs(i+1, turno);
                ases[contadorAses].setVisible(true);
                contadorAses++;
                asMano++;
            }
        }
        asVerificados = 0;
        if(!encontro){
            setPlantarse(turno, true);
            nextTurno();
        }
    }
    
     /**
   * Cambia el vaor de un as de un jugador y posicion especifica
   * @param jugador Jugador al que se le desea cambiar el valor del As
   * @param pos Posicion donde se encuentra el As en la mano del jugador
   */
    public void cambiarAs(int jugador, int pos) {
        if(jugador == 1){
            my_jugador1.cambiarAs(pos-1);
        }else{
            my_jugador2.cambiarAs(pos-1);
        }
    }
    
     /**
   * Finaliza el juego, cierra todas las vistas del juego
   */
    @Override
    public void finalizarJuego(){
        mesaView.dispose();
        ganadorView.dispose();
        inicioView.dispose();
        jugadoresView.dispose();
        for (int i = 0; i < 4; i++){
            if (!Objects.isNull(ases[i])){
                ases[i].dispose();
            }
        }
    }
    
     /**
   * Finaliza la ronda y empieza una nueva
   */
    @Override
    public void finalizarRonda(){
        ganadorView.setVisible(false);
        nuevaRonda();
    }
}