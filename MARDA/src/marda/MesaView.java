package marda;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

/**
 *
 * @author Andy Alvarado, María Andres, Gustavo Pinto
 */
public class MesaView extends javax.swing.JFrame {

    /**
     * Constructor Mesa. Crea ventana donde se va jugar.
     * @param controlador una instacia de controlador al que la vista va a notificar
     */
    public MesaView(Controlador controlador) {
        this.setLocationRelativeTo(null);
        initComponents();
        this.controlador = controlador;
    }
    
    /**
     * Cambia el nombre del jugador1 en la ventana.
     * @param name el nombre del jugador 1
     */
    public void setTextJug1(String name){
        nameJug1.setText(name);
        jugador1 = name;
    }
    
    /**
     * Cambia el nombre del jugador1 en la ventana.
     * @param name el nombre del jugador 2
     */
    public void setTextJug2(String name){
        nameJug2.setText(name);
        jugador2 = name;
    }
    
    public void setVictorias(int victorias1, int victorias2) {
        victorias1label.setText(Integer.toString(victorias1));
        victorias2label.setText(Integer.toString(victorias2));
    }
    
     public void setComoJugar(String comoJugar) {
        this.comoJugar = comoJugar;
    }
    
    /**
     * Muestra un mensaje indicando el comienzo del turno del proximo jugador.
     */
    public void mostrarTurno(){
        if(controlador.getTurno() == 1){
            JOptionPane.showMessageDialog(null, "Turno de " + jugador1,"Turno",JOptionPane.INFORMATION_MESSAGE);
        }else if(controlador.getTurno() == 2){
            JOptionPane.showMessageDialog(null, "Turno de " + jugador2,"Turno",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    /**
     * Actualiza el icono dee una una carta.
     * @param icon El icono con el que se va a añadir la carta
     */
    public void agregarCarta(String icon){
        ImageIcon icono = new ImageIcon(getClass().getResource(icon));
        JLabel cartaNueva = new JLabel();
        cartaNueva.setIcon(icono);
        cartaNueva.setBounds(68,305,50,80);
        add(cartaNueva);      
    }
    
    /**
     * Crea los componentes de la ventana. Codigo autogenerado.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        victorias1label = new javax.swing.JLabel();
        victorias2label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        ayuda = new javax.swing.JLabel();
        victlabel = new javax.swing.JLabel();
        GuardarPartida = new javax.swing.JButton();
        NuevoJuego = new javax.swing.JButton();
        nameJug1 = new javax.swing.JLabel();
        nameJug2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 468));
        getContentPane().setLayout(null);

        victorias1label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        victorias1label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victorias1label.setText("0");
        getContentPane().add(victorias1label);
        victorias1label.setBounds(310, 320, 10, 25);

        victorias2label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        victorias2label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victorias2label.setText("0");
        getContentPane().add(victorias2label);
        victorias2label.setBounds(380, 320, 10, 25);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(290, 310, 120, 40);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(350, 312, 60, 40);

        ayuda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ayuda.setText("¿Cómo jugar?");
        ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ayudaMouseClicked(evt);
            }
        });
        getContentPane().add(ayuda);
        ayuda.setBounds(420, 90, 140, 70);

        victlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        victlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victlabel.setText("Victorias");
        victlabel.setMaximumSize(new java.awt.Dimension(100, 25));
        victlabel.setMinimumSize(new java.awt.Dimension(100, 25));
        victlabel.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(victlabel);
        victlabel.setBounds(306, 280, 90, 25);

        GuardarPartida.setBackground(new java.awt.Color(0, 0, 0));
        GuardarPartida.setForeground(new java.awt.Color(255, 255, 255));
        GuardarPartida.setText("Guardar Partida");
        GuardarPartida.setActionCommand("Inciar Ronda");
        GuardarPartida.setName("Repartir"); // NOI18N
        GuardarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(GuardarPartida);
        GuardarPartida.setBounds(270, 400, 160, 22);

        NuevoJuego.setBackground(new java.awt.Color(0, 0, 0));
        NuevoJuego.setForeground(new java.awt.Color(255, 255, 255));
        NuevoJuego.setText("Nuevo Juego");
        NuevoJuego.setActionCommand("Inciar Ronda");
        NuevoJuego.setName("Repartir"); // NOI18N
        NuevoJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoJuegoActionPerformed(evt);
            }
        });
        getContentPane().add(NuevoJuego);
        NuevoJuego.setBounds(270, 370, 160, 22);

        nameJug1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameJug1.setText("player1");
        getContentPane().add(nameJug1);
        nameJug1.setBounds(70, 280, 110, 16);

        nameJug2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameJug2.setText("player2");
        getContentPane().add(nameJug2);
        nameJug2.setBounds(510, 280, 110, 16);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    /**
     * Indica cuando se hace click en el boton nuevo juego.
     * @param evt Evento.
     */
    private void NuevoJuegoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        controlador.jugar();
    }                                          


    /**
     * Indica cuando se hace click en el boton de ayuda. Muestra un mensaje con las reglas.
     * @param evt Evento.
     */
    private void ayudaMouseClicked(java.awt.event.MouseEvent evt) {                                   
        JOptionPane.showMessageDialog(null, comoJugar,"¿Cómo jugar?",JOptionPane.INFORMATION_MESSAGE);
        
    }                                  

    private void GuardarPartidaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        if(controlador.guardarJuego()){
            JOptionPane.showMessageDialog(null, "Se guardó la partida correctamente","Partida",JOptionPane.INFORMATION_MESSAGE);
        }
    }                                              

    private Controlador controlador;
    private String comoJugar;
    private String jugador1;
    private String jugador2;
    // Variables declaration - do not modify                     
    private javax.swing.JButton GuardarPartida;
    private javax.swing.JButton NuevoJuego;
    private javax.swing.JLabel ayuda;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel nameJug1;
    private javax.swing.JLabel nameJug2;
    private javax.swing.JLabel victlabel;
    private javax.swing.JLabel victorias1label;
    private javax.swing.JLabel victorias2label;
    // End of variables declaration                   
}
