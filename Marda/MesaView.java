import java.util.HashSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
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
     * @param nombre el nombre del jugador 1
     */
    public void setTextJug1(String name){
        nameJug1.setText(name);
        jugador1 = name;
    }
    
    /**
     * Cambia el nombre del jugador1 en la ventana.
     * @param nombre el nombre del jugador 2
     */
    public void setTextJug2(String name){
        nameJug2.setText(name);
        jugador2 = name;
    }
    
    public void setVictorias(int victorias1, int victorias2) {
        victorias1label.setText(Integer.toString(victorias1));
        victorias2label.setText(Integer.toString(victorias2));
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
     * Muestra el boton de plantarse para el jugador del turno actual.
     */
    public void mostrarPlantarse(){
        if(controlador.getTurno() == 1){
            PlantarseJug1.setVisible(true);
            PlantarseJug2.setVisible(false);
        }else if(controlador.getTurno() == 2){
            PlantarseJug2.setVisible(true);
            PlantarseJug1.setVisible(false);
        }
    }
    
    /**
     * Muestra una carta.
     * @param c la carta que se debe mostrar
     */
    public void showCarta(int c){
        switch (c){
            case 1:
                carta1.setVisible(true);
                break;
            case 2:
                carta2.setVisible(true);
                break;
            case 3:
                carta3.setVisible(true);
                break;
            case 4:
                carta4.setVisible(true);
                break;
            case 5:
                carta5.setVisible(true);
                break;
            case 6:
                carta6.setVisible(true);
                break;
            case 7:
                carta7.setVisible(true);
                break;
            case 8:
                carta8.setVisible(true);
                break;
             case 9:
                carta9.setVisible(true);
                break;
            case 10:
                carta10.setVisible(true);
                break;
        }
    }
    
    /**
     * Esconde una carta.
     * @param c la carta que se debe esconder
     */
    public void hideCarta(int c){
        switch (c){
            case 1:
                carta1.setVisible(false);
                break;
            case 2:
                carta2.setVisible(false);
                break;
            case 3:
                carta3.setVisible(false);
                break;
            case 4:
                carta4.setVisible(false);
                break;
            case 5:
                carta5.setVisible(false);
                break;
            case 6:
                carta6.setVisible(false);
                break;
            case 7:
                carta7.setVisible(false);
                break;
            case 8:
                carta8.setVisible(false);
                break;
             case 9:
                carta9.setVisible(false);
                break;
            case 10:
                carta10.setVisible(false);
                break;
        }
    }
    
    /**
     * Actualiza el icono dee una una carta.
     * @param c la carta que se debe actualizar
     * @param icon El icono con el que se va a actualizar la carta
     */
    public void setIconCarta(int c, String icon){
        ImageIcon icono = new ImageIcon(getClass().getResource(icon));
        switch (c){
            case 1:
                carta1.setIcon(icono);
                break;
            case 2:
                carta2.setIcon(icono);
                break;
            case 3:
                carta3.setIcon(icono);
                break;
            case 4:
                carta4.setIcon(icono);
                break;
            case 5:
                carta5.setIcon(icono);
                break;
            case 6:
                carta6.setIcon(icono);
                break;
            case 7:
                carta7.setIcon(icono);
                break;
            case 8:
                carta8.setIcon(icono);
                break;
             case 9:
                carta9.setIcon(icono);
                break;
            case 10:
                carta10.setIcon(icono);
                break;
        }
    }
    
    /**
     * Crea los componentes de la ventana. Codigo autogenerado.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        victorias1label = new javax.swing.JLabel();
        victorias2label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        ayuda = new javax.swing.JLabel();
        victlabel = new javax.swing.JLabel();
        pedirCarta = new javax.swing.JLabel();
        GuardarPartida = new javax.swing.JButton();
        PlantarseJug2 = new javax.swing.JButton();
        PlantarseJug1 = new javax.swing.JButton();
        NuevoJuego = new javax.swing.JButton();
        carta10 = new javax.swing.JLabel();
        carta9 = new javax.swing.JLabel();
        carta8 = new javax.swing.JLabel();
        carta7 = new javax.swing.JLabel();
        carta6 = new javax.swing.JLabel();
        carta5 = new javax.swing.JLabel();
        carta4 = new javax.swing.JLabel();
        carta3 = new javax.swing.JLabel();
        carta2 = new javax.swing.JLabel();
        carta1 = new javax.swing.JLabel();
        nameJug1 = new javax.swing.JLabel();
        nameJug2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 468));
        getContentPane().setLayout(null);

        victorias1label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        victorias1label.setForeground(new java.awt.Color(255, 255, 255));
        victorias1label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victorias1label.setText("0");
        getContentPane().add(victorias1label);
        victorias1label.setBounds(310, 320, 10, 25);

        victorias2label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        victorias2label.setForeground(new java.awt.Color(255, 255, 255));
        victorias2label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victorias2label.setText("0");
        getContentPane().add(victorias2label);
        victorias2label.setBounds(380, 320, 10, 25);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(290, 310, 120, 40);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(350, 312, 60, 40);

        ayuda.setForeground(new java.awt.Color(255, 255, 255));
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
        victlabel.setForeground(new java.awt.Color(255, 255, 255));
        victlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victlabel.setText("Victorias");
        victlabel.setMaximumSize(new java.awt.Dimension(100, 25));
        victlabel.setMinimumSize(new java.awt.Dimension(100, 25));
        victlabel.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(victlabel);
        victlabel.setBounds(306, 280, 90, 25);

        pedirCarta.setForeground(new java.awt.Color(255, 255, 255));
        pedirCarta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pedirCarta.setText("Pedir carta");
        pedirCarta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedirCartaMouseClicked(evt);
            }
        });
        getContentPane().add(pedirCarta);
        pedirCarta.setBounds(170, 80, 150, 90);

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

        PlantarseJug2.setBackground(new java.awt.Color(0, 0, 0));
        PlantarseJug2.setForeground(new java.awt.Color(255, 255, 255));
        PlantarseJug2.setText("Plantarse");
        PlantarseJug2.setActionCommand("Inciar Ronda");
        PlantarseJug2.setName("Repartir"); // NOI18N
        PlantarseJug2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlantarseJug2MouseClicked(evt);
            }
        });
        PlantarseJug2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlantarseJug2ActionPerformed(evt);
            }
        });
        getContentPane().add(PlantarseJug2);
        PlantarseJug2.setBounds(530, 400, 90, 22);

        PlantarseJug1.setBackground(new java.awt.Color(0, 0, 0));
        PlantarseJug1.setForeground(new java.awt.Color(255, 255, 255));
        PlantarseJug1.setText("Plantarse");
        PlantarseJug1.setActionCommand("Inciar Ronda");
        PlantarseJug1.setName("Repartir"); // NOI18N
        PlantarseJug1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlantarseJug1MouseClicked(evt);
            }
        });
        PlantarseJug1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlantarseJug1ActionPerformed(evt);
            }
        });
        getContentPane().add(PlantarseJug1);
        PlantarseJug1.setBounds(80, 400, 90, 22);

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

        carta10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carta10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta10MouseReleased(evt);
            }
        });
        getContentPane().add(carta10);
        carta10.setBounds(422, 305, 50, 80);

        carta9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carta9MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta9MouseReleased(evt);
            }
        });
        getContentPane().add(carta9);
        carta9.setBounds(453, 305, 50, 80);

        carta8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carta8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta8MouseReleased(evt);
            }
        });
        getContentPane().add(carta8);
        carta8.setBounds(485, 305, 50, 80);

        carta7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carta7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta7MouseReleased(evt);
            }
        });
        getContentPane().add(carta7);
        carta7.setBounds(509, 305, 50, 80);

        carta6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carta6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta6MouseReleased(evt);
            }
        });
        getContentPane().add(carta6);
        carta6.setBounds(582, 305, 50, 80);

        carta5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carta5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta5MouseReleased(evt);
            }
        });
        getContentPane().add(carta5);
        carta5.setBounds(225, 305, 50, 79);

        carta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carta4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta4MouseReleased(evt);
            }
        });
        getContentPane().add(carta4);
        carta4.setBounds(198, 305, 50, 80);

        carta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carta3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta3MouseReleased(evt);
            }
        });
        getContentPane().add(carta3);
        carta3.setBounds(166, 305, 50, 80);

        carta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carta2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta2MouseReleased(evt);
            }
        });
        getContentPane().add(carta2);
        carta2.setBounds(141, 305, 50, 80);

        carta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carta1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta1MouseReleased(evt);
            }
        });
        carta1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                carta1PropertyChange(evt);
            }
        });
        getContentPane().add(carta1);
        carta1.setBounds(68, 305, 50, 80);

        nameJug1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameJug1.setForeground(new java.awt.Color(255, 255, 255));
        nameJug1.setText("user");
        getContentPane().add(nameJug1);
        nameJug1.setBounds(70, 280, 110, 16);

        nameJug2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameJug2.setForeground(new java.awt.Color(255, 255, 255));
        nameJug2.setText("user");
        getContentPane().add(nameJug2);
        nameJug2.setBounds(510, 280, 110, 16);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fonditoblackjack.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 432);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Indica cuando se hace click en el boton nuevo juego.
     * @param evt Evento.
     */
    private void NuevoJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoJuegoActionPerformed
        PlantarseJug1.setVisible(false);
        PlantarseJug2.setVisible(false);
        controlador.jugar();
    }//GEN-LAST:event_NuevoJuegoActionPerformed


    private void carta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta1MouseClicked
    }//GEN-LAST:event_carta1MouseClicked

    /**
     * Indica cuando se presiona la carta 1. Muestra la carta oculta.
     * @param evt Evento.
     */
    private void carta1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta1MousePressed
        // if(controlador.getTurno() == 1){
        //     ImageIcon front = new ImageIcon(getClass().getResource(controlador.getCartaOculta(1)));
        //     carta1.setIcon(front);
        // }
    }//GEN-LAST:event_carta1MousePressed

    /**
     * Indica cuando se presiona la carta 1. Esconde la carta oculta.
     * @param evt Evento.
     */
    private void carta1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta1MouseReleased
        ImageIcon back = new ImageIcon(getClass().getResource("/Imagenes/back.png"));
        carta1.setIcon(back);
    }//GEN-LAST:event_carta1MouseReleased

    private void carta5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta5MouseClicked
    }//GEN-LAST:event_carta5MouseClicked

    private void carta5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta5MousePressed
    }//GEN-LAST:event_carta5MousePressed

    private void carta5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta5MouseReleased
    }//GEN-LAST:event_carta5MouseReleased

    private void carta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta4MouseClicked
    }//GEN-LAST:event_carta4MouseClicked

    private void carta4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta4MousePressed
    }//GEN-LAST:event_carta4MousePressed

    private void carta4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta4MouseReleased
    }//GEN-LAST:event_carta4MouseReleased

    private void carta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta3MouseClicked
    }//GEN-LAST:event_carta3MouseClicked

    private void carta3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta3MousePressed
    }//GEN-LAST:event_carta3MousePressed

    private void carta3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta3MouseReleased
    }//GEN-LAST:event_carta3MouseReleased

    private void carta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta2MouseClicked
    }//GEN-LAST:event_carta2MouseClicked

    private void carta2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta2MousePressed
    }//GEN-LAST:event_carta2MousePressed

    private void carta2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta2MouseReleased
    }//GEN-LAST:event_carta2MouseReleased

    private void carta6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta6MouseClicked
    }//GEN-LAST:event_carta6MouseClicked

    /**
     * Indica cuando se presiona la carta 6. Muestra la carta oculta.
     * @param evt Evento.
     */
    private void carta6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta6MousePressed
        // if(controlador.getTurno() == 2){
        //     ImageIcon front = new ImageIcon(getClass().getResource(controlador.getCartaOculta(2)));
        //     carta6.setIcon(front);
        // }
    }//GEN-LAST:event_carta6MousePressed

    /**
     * Indica cuando se presiona la carta 6. Esconde la carta oculta.
     * @param evt Evento.
     */
    private void carta6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta6MouseReleased
        ImageIcon back = new ImageIcon(getClass().getResource("/Imagenes/back.png"));
        carta6.setIcon(back);
    }//GEN-LAST:event_carta6MouseReleased

    private void carta7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta7MouseClicked
    }//GEN-LAST:event_carta7MouseClicked

    private void carta7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta7MousePressed
    }//GEN-LAST:event_carta7MousePressed

    private void carta7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta7MouseReleased
    }//GEN-LAST:event_carta7MouseReleased

    private void carta8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta8MouseClicked
    }//GEN-LAST:event_carta8MouseClicked

    private void carta8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta8MousePressed
    }//GEN-LAST:event_carta8MousePressed

    private void carta8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta8MouseReleased
    }//GEN-LAST:event_carta8MouseReleased

    private void carta9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta9MouseClicked
    }//GEN-LAST:event_carta9MouseClicked

    private void carta9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta9MousePressed
    }//GEN-LAST:event_carta9MousePressed

    private void carta9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta9MouseReleased
    }//GEN-LAST:event_carta9MouseReleased

    private void carta10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta10MouseClicked
    }//GEN-LAST:event_carta10MouseClicked

    private void carta10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta10MousePressed
    }//GEN-LAST:event_carta10MousePressed

    private void carta10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta10MouseReleased
    }//GEN-LAST:event_carta10MouseReleased

    /**
     * Indica cuando se hace click en el boton pedir carta.
     * @param evt Evento.
     */
    private void pedirCartaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedirCartaMouseClicked
        // controlador.pedirCarta();
        // controlador.nextTurno();
    }//GEN-LAST:event_pedirCartaMouseClicked

    /**
     * Indica cuando se hace click en el boton de ayuda. Muestra un mensaje con las reglas.
     * @param evt Evento.
     */
    private void ayudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayudaMouseClicked
        JOptionPane.showMessageDialog(null, "Este juego consiste en un enfrentamiento entre 2 jugadores comparando las cartas que estos tengan en\n"+
        "su mano, intentanto conseguir 21 puntos o el número más cercano posible sin pasarse. Al iniciar\n"+
        "la ronda, se le dara 2 cartas a cada jugador, una carta boca abajo que solo puede ver su jugador,\n"+
        "esto lo podrá hacer presionando encima de la carta. Cuando un jugador ya no quiera más cartas,\n"+
        "tendrá la opción de plantarse, cuando ambos jugadores se planten, la ronda terminará y se\n"+
        "dará un ganador.\n\n"+
        "Reglas\n\n"+
        "1. Cada jugador solo podrá pedir una carta por turno.\n"+
        "2.En el blackjack, los dieces, las jotas, las reinas y los reyes tienen un valor de 10 cada una.\n"+
        "3.Los ases pueden tener dos valores diferentes: uno u once (puedes elegir cuál).\n"+
        "4.Cuando el valor total de tu mano es de 22 o más, esto se conoce comúnmente como \"bancarrota\",\n"+
        "y automáticamente perderás la ronda.\n"+
        "5. En caso de un empate, ganará el jugador con menos cartas en su mano. Si ambos tuvieran la\n"+
        "misma cantidad de cartas, habría un empate.\n","¿Cómo jugar?",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_ayudaMouseClicked

    private void PlantarseJug1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlantarseJug1ActionPerformed
    }//GEN-LAST:event_PlantarseJug1ActionPerformed

    /**
     * Indica cuando se hace click en el boton plantarse del jugador 1.
     * @param evt Evento.
     */
    private void PlantarseJug1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlantarseJug1MouseClicked
        // controlador.verificarAses();
        // PlantarseJug1.setVisible(false);
    }//GEN-LAST:event_PlantarseJug1MouseClicked

    private void carta1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_carta1PropertyChange
    }//GEN-LAST:event_carta1PropertyChange

    /**
     * Indica cuando se hace click en el boton plantarse del jugador 2.
     * @param evt Evento.
     */
    private void PlantarseJug2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlantarseJug2MouseClicked
        // controlador.verificarAses();
        // PlantarseJug2.setVisible(false);
    }//GEN-LAST:event_PlantarseJug2MouseClicked

    private void PlantarseJug2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlantarseJug2ActionPerformed
    }//GEN-LAST:event_PlantarseJug2ActionPerformed

    private void GuardarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarPartidaActionPerformed
        // TODO add your handling code here:
        if(controlador.guardarJuego()){
            JOptionPane.showMessageDialog(null, "Se guardó la partida correctamente","Partida",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_GuardarPartidaActionPerformed

    private Controlador controlador;
    private String jugador1;
    private String jugador2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarPartida;
    private javax.swing.JButton NuevoJuego;
    private javax.swing.JButton PlantarseJug1;
    private javax.swing.JButton PlantarseJug2;
    private javax.swing.JLabel ayuda;
    private javax.swing.JLabel carta1;
    private javax.swing.JLabel carta10;
    private javax.swing.JLabel carta2;
    private javax.swing.JLabel carta3;
    private javax.swing.JLabel carta4;
    private javax.swing.JLabel carta5;
    private javax.swing.JLabel carta6;
    private javax.swing.JLabel carta7;
    private javax.swing.JLabel carta8;
    private javax.swing.JLabel carta9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel nameJug1;
    private javax.swing.JLabel nameJug2;
    private javax.swing.JLabel pedirCarta;
    private javax.swing.JLabel victlabel;
    private javax.swing.JLabel victorias1label;
    private javax.swing.JLabel victorias2label;
    // End of variables declaration//GEN-END:variables
}
