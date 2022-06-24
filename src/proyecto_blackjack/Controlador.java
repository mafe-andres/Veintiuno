package proyecto_blackjack;
import java.util.ArrayList;
import java.util.Objects;

public class Controlador{

    final int CARTASXMESA = 10;

    //Vistas
    private Juego juego;
    private Mesa mesa; 
    private Inicio inicio;
    private Jugadores jugadores;
    private Ganador ganador;

    private Ases[] ases = new Ases[4];
    private int turno, asMano, asVerificados;
    private boolean masCartas;
    
    public Controlador() {
        this.juego = new Juego();
        mesa = new Mesa(this);
        inicio = new Inicio(this);
        jugadores = new Jugadores(this);
        ganador = new Ganador(this);
    }

    public void iniciar(){
        inicio.setVisible(true);
    }

    public void initJugadores(){
        inicio.setVisible(false);
        jugadores.setVisible(true);
    }

    public void initMesa(String jugador1, String jugador2){
        jugadores.setVisible(false);
        juego.setNombres(jugador1, jugador2);
        mesa.setVisible(true);
        mesa.setTextJug1(jugador1);
        mesa.setTextJug2(jugador2);
    }
    
    public void jugar() {
        juego.inicializarJuego();
        iniciarRonda();
    }

    public void iniciarRonda() {
        setPlantarse(1, false);
        setPlantarse(2, false);
        juego.inicializarRonda();
        turno(1);
    }
    
    public void finalizarRonda(){
        ganador.setVisible(false);
        iniciarRonda();
    }
    
    public void finalizar() {
        mesa.dispose();
        ganador.dispose();
        inicio.dispose();
        jugadores.dispose();
        for (int i = 0; i < 4; i++){
            if (!Objects.isNull(ases[i])){
                ases[i].dispose();
            }
        }
    }

    public void pedirCarta() {
        juego.repartirCarta(turno);
        masCartas = false;
        actualizarCartas();
    }
    
    public int getTurno(){
        return turno;
    }
    
    public String getCartaOculta(int jug){
        ArrayList<Integer> cartas = juego.getCartasMesa();
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
    
    private void actualizarCartas() {
        ArrayList<Integer> cartas = juego.getCartasMesa();
        int num = cartas.get(0);
        int palo = cartas.get(0);
        for (int i = 0; i< CARTASXMESA; i++) {
            num= cartas.get(i*2);
            palo = cartas.get((i*2)+1);
            if (num!=0){
              mesa.setIconCarta(i+1,getRutaCarta(num,palo));
              mesa.showCarta(i+1);
            } else {
                mesa.hideCarta(i+1);
            }
        }
        mesa.setIconCarta(1,"/Imagenes/back.png");
        mesa.setIconCarta(6,"/Imagenes/back.png");
    }
    
     public String getRutaCarta(int numero, int palo){
      String nombre = "";
        switch(palo){
            case 0:
                nombre = "/Imagenes/" + numero + "treboles.png";
                break;
            case 1:
                nombre = "/Imagenes/" + numero + "picas.png";
                break;
            case 2:
                nombre = "/Imagenes/" + numero + "corazones.png";
                break;
            case 3:
                nombre = "/Imagenes/" + numero + "diamantes.png";
                break;
        }
      return nombre;
    }
    
    public void turno(int jug) {
            turno = jug;
            mesa.mostrarTurno();
            mesa.mostrarPlantarse();
            if (jug == 3){
                ganador.setJugador1(juego.jugador1.getNombre(), juego.jugador1.suma());
                ganador.setJugador2(juego.jugador2.getNombre(), juego.jugador2.suma());
                ganador.setGanador(juego.ganador());
                ganador.setVisible(true);
            } 
            if (jug == 1){
                masCartas = true;
            }
            if (jug == 2) {
                masCartas = true;
            }
            actualizarCartas();
    }
    
    public void setPlantarse(int jugador, boolean plantado){
        juego.setPlantarse(jugador, plantado);
        //this.plantarse[posicion] = true;
    }
    
    public void nextTurno(){
        if (turno == 1) {
            if (juego.getPlantarse(2) == true){
                if (juego.getPlantarse(1) == true) {
                    turno(3);
                }
            } else {
                turno(2);
            }
        } else if (turno ==2) {
            if (juego.getPlantarse(1) == true){
                System.out.println("Pantarse jug2" + juego.getPlantarse(2));
                if (juego.getPlantarse(2) == true) {
                    turno(3);
                }
            } else {
                turno(1);
            }
        }
    }
    
    public void verificarAses(){
        boolean encontro = false;
        ArrayList<Carta> cartas;
        if(turno == 1){
            cartas = juego.jugador1.getMano();
        }else{
            cartas = juego.jugador2.getMano();
        }
        asMano = 0;
        int contadorAses = 0;
        for(int i = 0; i < cartas.size(); i++){
            if(cartas.get(i).getNumero() == 1){
                encontro = true;
                ases[contadorAses] = new Ases(this);
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
    
    public void finalizarTurno(){
        asVerificados ++;
        if(asVerificados == asMano){
            setPlantarse(turno, true);
            nextTurno();
        }
    }
    
    public void cambiarAs(int jug, int pos) {
        juego.cambiarAs(jug, pos);
     }
}
