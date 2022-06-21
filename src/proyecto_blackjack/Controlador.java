package proyecto_blackjack;
import java.util.ArrayList;

public class Controlador{
    final int CARTASXMES = 10;
    //final int CARTASXJUG = 5;
    private Juego juego;
    private Mesa mesa;
    private Inicio inicio;
    private Jugadores jugadores;
    private JugarDeNuevo jugarDeNuevo;
    private int turno;
    private boolean fin;
    
    public Controlador() {
        this.juego = new Juego();
    }
    public void iniciar(){
        inicio = new Inicio(this);
        inicio.setVisible(true);
        turno =0;
        // Preguntar quien va primero TODO
    }
    // Comienza el ciclo principal del programa
    public void jugar() {
        // Probar
        juego.inicializarJuego();
        turno =1;
        iniciarRondas();
        //while (ronda()) {}
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
        actualizarCartas();
    }
    
    private void actualizarCartas() {
        ArrayList<Integer> cartas = juego.getCartasMesa();
        int num = cartas.get(0);
        int palo = cartas.get(0);
        for (int i = 0; i< CARTASXMES; i++) {
            num= cartas.get(i*2);
            palo = cartas.get(i*2+1);
            if (num!=0){
              mesa.iconCarta(i+1,getNombreImagen(num,palo));
              mesa.showCarta(i+1);
            } else {
                mesa.hideCarta(i+1);
            }
        }
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
        System.out.println(nombre);
      return nombre;
  }
     
    public boolean iniciarRondas() {
        fin = false;
        juego.inicializarRonda();
        turno(1);
        //turno(2);
        //jugarDeNuevo = new JugarDeNuevo();
        //jugarDeNuevo.setVisible(true);
        return false;
    }
    
    public void turno(int jug) {
        turno = jug;
        juego.repartirCarta(turno);
        actualizarCartas();
        
    }
    
    public void finalizar() {
        
    }
}
