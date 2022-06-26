package proyecto_blackjack;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Esta clase define el controlador del juego, el cual será el encargado de controlar a las clases modelo y vista
 * @author: Andy Alvarado, Antony Ortiz, Gustavo Pinto y Maria Andres
 * @version: 2022
 */
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
    
     /**
     * Constructor de la clase, inicializa las clases juego y mesa
     * @param
     */
    public Controlador() {
        this.juego = new Juego();
        mesa = new Mesa(this);
        inicio = new Inicio(this);
        jugadores = new Jugadores(this);
        ganador = new Ganador(this);
    }

     /**
     * Método para inicializar la clase inicio y cambiar su visibilidad a true
     * @param 
     */
    public void iniciar(){
        inicio.setVisible(true);
    }
     
     /**
     * Método inicializar la clase jugadores y cambiar su visibilidad a true
     * @param 
     */ 
    public void initJugadores(){
        inicio.setVisible(false);
        jugadores.setVisible(true);
    }
     
     /**
     * Método que cambia las visibilidad de las clases jugadores y mesa, y settea los nombres de los jugadores
     * @param jugador1 String que contiene el nombre del jugador 1
     * @param jugador2 String que contiene el nombre del jugador 2
     */ 
    public void initMesa(String jugador1, String jugador2){
        jugadores.setVisible(false);
        juego.setNombres(jugador1, jugador2);
        mesa.setVisible(true);
        mesa.setTextJug1(jugador1);
        mesa.setTextJug2(jugador2);
    }
    
     /**
     * Comienza el ciclo principal del programa
     * @param
     */
    public void jugar() {
        juego.inicializarJuego();
        iniciarRonda();
    }

     /**
     * Método para iniciar una ronda del juego
     * @param 
     */
    public void iniciarRonda() {
        setPlantarse(1, false);
        setPlantarse(2, false);
        juego.inicializarRonda();
        turno(1);
    }
    
      /**
     * Método finalzar la ronda del juego
     * @param 
     */   
    public void finalizarRonda(){
        ganador.setVisible(false);
        iniciarRonda();
    }
 
     /**
     * Método para finalizar el juego
     * @param
     */     
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

     /**
     * Método que llama a repartir carta y actualizar carta, y settea la variable masCartas
     * @param
     */ 
    public void pedirCarta() {
        juego.repartirCarta(turno);
        masCartas = false;
        actualizarCartas();
    }

    /**
     * Getter de la variable turno
     * @return Int con la variable turno
     */     
    public int getTurno(){
        return turno;
    }
 
     /**
     * Retorna la carta que se encuentra oculta en la mesa
     * @param jug Int con el numero de jugador
     * @return String con el nombre de la carta oculta
     */ 
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

    
     /**
     * Actualiza la cartas que se encuentran en la mesa
     * @param 
     */ 
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

     /**
     * Retorna la ubicación de la imagen 
     * @param numero Int con el numero que tiene la carta
     * @param palo Int con el palo que tiene la carta
     * @return String con la ubicación de la carta
     */ 
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

     /**
     * Método que realiza el turno para cada jugador
     * @param jug Int que contiene el numero del jugador para el turno
     */ 
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
    
     /**
     * Setter para el arreglo plantarse
     * @param jugador Int con el numero del jugador
     * @param plantado Booleano para settear la variable plantado
     */    
    public void setPlantarse(int jugador, boolean plantado){
        juego.setPlantarse(jugador, plantado);
        //this.plantarse[posicion] = true;
    }
    
     
     /**
     * Método para verifica el turno que sigue
     * @param
     */    
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

    /**
     * Método que verificar los ases que haya en la mano de los jugadores
     * @param
     */     
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
    
    /**
     * Método que finalizar el turno del jugador
     * @param
     */     
    public void finalizarTurno(){
        asVerificados ++;
        if(asVerificados == asMano){
            setPlantarse(turno, true);
            nextTurno();
        }
    }
    
     /**
     * Método que cambia el as de valor
     * @param jug Int con el numero de jugador
     * @param pos Int con la posicion
     */     
    public void cambiarAs(int jug, int pos) {
        juego.cambiarAs(jug, pos);
     }
}
