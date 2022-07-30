package marda;

public class Jugador21 extends Jugador{

    private boolean sePlanto;
    
    /**
   * Constructor de la clase
   */
    public Jugador21(){

    }   
    
    /**
   * Cambia si se planto el jugador
   * @param sePlanto determina si un jugador se planto
   */
    public void setSePlanto(boolean sePlanto){
        this.sePlanto = sePlanto;
    }
    
    /**
   * Retorna si un jugador esta plantado o no.
   * @return variable bool si se planto o no
   */
    public boolean getSePlanto(){
        return sePlanto;
    }
    
    /**
   * Cambia el valor de un as en x posicion
   * @param pos la posicion del as
   */
    public void cambiarAs(int pos){
        mano.get(pos).setValor(11);
    }
    
    /**
   * Retorna la suma total de las cartas del jugador
   * @return suma de las cartas
   */
    @Override
    public int suma(){
        int suma = 0;
        for(int i = 0; i < mano.size(); i++){
            int valor = mano.get(i).getValor();
            if (valor == 11 || valor == 12 || valor == 13){
                suma += 10;
            } else {
                suma += mano.get(i).getValor();
            }
        }
        return suma;
    }
}
