package proyecto_blackjack;
import java.util.ArrayList;

public class Controlador{
    final int CARTASXMES = 10;
    private Juego juego;
    private Mesa mesa;
    private Inicio inicio;
    private Jugadores jugadores;
    private JugarDeNuevo jugarDeNuevo;
    private int turno;
    private boolean[] plantarse = new boolean[3]; // Se usa 3 para usar pos1 y pos2
    private boolean masCartas;
    
    public Controlador() {
        this.juego = new Juego();
    }
    public void iniciar(){
        inicio = new Inicio(this);
        inicio.setVisible(true);
        turno(0);
    }
    
    // Comienza el ciclo principal del programa
    public void jugar() {
        // Probar
        juego.inicializarJuego();
        iniciarRonda();
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
            num = cartas.get(10); //Pos10 inician cartas jug2
            palo = cartas.get(11);
        }
        return getNombreImagen(num,palo);
        
    }
    
    private void actualizarCartas() {
        ArrayList<Integer> cartas = juego.getCartasMesa();
        int num = cartas.get(0);
        int palo = cartas.get(0);
        for (int i = 0; i< CARTASXMES; i++) {
            num= cartas.get(i*2);
            palo = cartas.get((i*2)+1);
            if (num!=0){
              mesa.iconCarta(i+1,getNombreImagen(num,palo));
              mesa.showCarta(i+1);
            } else {
                mesa.hideCarta(i+1);
            }
        }
        mesa.iconCarta(1,"/Imagenes/back.png");
        mesa.iconCarta(6,"/Imagenes/back.png");
    }
    
     public String getNombreImagen(int numero, int palo){
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
     
    public void iniciarRonda() {
        plantarse[0] = false;
        plantarse[1] = false;
        juego.inicializarRonda();
        turno(1);
        //jugarDeNuevo = new JugarDeNuevo();
        //jugarDeNuevo.setVisible(true);
    }
    
    public void turno(int jug) {
        turno = jug;
        mesa.mostrarPlantarse();
        mesa.mostrarTurno();
        
        if (turno == 3){
            // Calcular ganador y posiblemente mostrar boton siguiente ronda.
        } else if (turno == 4){
            turno = 1;
        } 
        if (turno == 1){
            
            masCartas = true;
        }
        if (turno == 2) {
            masCartas=true;
        }
        
        actualizarCartas();
    }
    
    public void setPlantarse(int posicion){
        this.plantarse[posicion] = true;
    }
    
    public void nextTurno(){
        if (turno == 1) {
            if (plantarse[2] == true){
                if (plantarse[1] == true) {
                    turno(3);
                } else {
                    turno(1);
                }
            } else {
                turno(2);
            }
        } else if (turno ==2) {
            if (plantarse[1] == true){
                if (plantarse[2] == true) {
                    turno(3);
                } else {
                    turno(2);
                }
            } else {
                turno(1);
            }
        }
    }
    
    public void finalizar() {
        
    }
}
