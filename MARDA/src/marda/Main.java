package marda;

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
 */
public class Main {
    
    /**
    * Crea una nueva instancia de controlador y lo inicia
    */
    public static void main(String args[]) {
        Controlador controlador = new Controlador21(); //concreto
        controlador.iniciar();
        controlador.getCartaOculta(1);
    }
}