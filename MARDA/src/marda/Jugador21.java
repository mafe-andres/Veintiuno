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
