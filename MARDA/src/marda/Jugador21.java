package marda;

public class Jugador21 extends Jugador{

    private boolean sePlanto;

    public Jugador21(){

    }   

    public void setSePlanto(boolean sePlanto){
        this.sePlanto = sePlanto;
    }

    public boolean getSePlanto(){
        return sePlanto;
    }

    public void cambiarAs(int pos){
        mano.get(pos).setValor(11);
    }
}
