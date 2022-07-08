package proyecto_blackjack;

import javax.swing.JOptionPane;

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
 */
public class Ganador extends javax.swing.JFrame {

    /**
     * Constructor Ganador. Crea ventana para mostrar el ganador. Pregunta si se va a jugar de nuevo.
     * @param controlador una instacia de controlador al que la vista va a notificar
     */
    public Ganador(Controlador controlador) {
        this.setLocationRelativeTo(null);
        this.setTitle("Ganador");
        initComponents();
        this.controlador = controlador;
    }
    
    /**
     * Cambia el nombre del jugador1 en la ventana.
     * @param nombre el nombre del jugador 1
     * @param suma la suma de la mano del jugador 1
     */
    public void setJugador1(String nombre, int suma){
        lblJug1.setText(nombre + ": ");
        lblTotal1.setText("" + suma);
    }
    
    /**
     * Cambia el nombre del jugador2 en la ventana.
     * @param nombre el nombre del jugador 2
     * @param suma la suma de la mano del jugador 2
     */
    public void setJugador2(String nombre, int suma){
        lblJug2.setText(nombre + ": ");
        lblTotal2.setText("" + suma);
    }
    
    /**
     * Cambia el nombre del ganador.
     * @param ganador el nombre del ganador
     */
    public void setGanador(String ganador){
        lblGanador.setText(ganador);
    }

    /**
     * Crea los componentes de la ventana. Codigo autogenerado.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTotal2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSi = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();
        lblGanador = new javax.swing.JLabel();
        lblJug1 = new javax.swing.JLabel();
        lblJug2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTotal1 = new javax.swing.JLabel();
        GuardarPartida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotal2.setText("TotalJug2");
        jPanel1.add(lblTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 209, -1, -1));

        jLabel6.setText("Felicidades el ganador es :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 268, 153, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, 199, 95));

        jLabel8.setText("¿Desea jugar de nuevo?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 170, -1));

        btnSi.setBackground(new java.awt.Color(0, 0, 0));
        btnSi.setForeground(new java.awt.Color(255, 255, 255));
        btnSi.setText("Sí");
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });
        jPanel1.add(btnSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        btnNo.setBackground(new java.awt.Color(0, 0, 0));
        btnNo.setForeground(new java.awt.Color(255, 255, 255));
        btnNo.setText("No");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

        lblGanador.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblGanador.setForeground(new java.awt.Color(0, 204, 51));
        lblGanador.setText("Ganador");
        jPanel1.add(lblGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 268, 98, -1));

        lblJug1.setText("Jugador1");
        jPanel1.add(lblJug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 167, 91, -1));

        lblJug2.setText("Jugador2");
        jPanel1.add(lblJug2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 209, 91, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Suma de las cartas: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 133, 120, -1));

        lblTotal1.setText("TotalJug1");
        jPanel1.add(lblTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 167, -1, -1));

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
        jPanel1.add(GuardarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 317, 156, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Indica cuando se hace click en el boton si.
     * @param evt Evento.
     */
    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed
        controlador.finalizarRonda();
    }//GEN-LAST:event_btnSiActionPerformed

    /**
     * Indica cuando se hace click en el boton no.
     * @param evt Evento.
     */
    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        controlador.finalizar();
    }//GEN-LAST:event_btnNoActionPerformed

    private void GuardarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarPartidaActionPerformed
        // TODO add your handling code here:
        if(controlador.guardarPartida()){
            JOptionPane.showMessageDialog(null, "Se cargo la partida correctamente","Partida",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_GuardarPartidaActionPerformed
    
    private Controlador controlador;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarPartida;
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnSi;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGanador;
    private javax.swing.JLabel lblJug1;
    private javax.swing.JLabel lblJug2;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblTotal2;
    // End of variables declaration//GEN-END:variables
}
