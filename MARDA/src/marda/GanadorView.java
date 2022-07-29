package marda;

import javax.swing.JOptionPane;

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
 */
public class GanadorView extends javax.swing.JFrame {

    /**
     * Constructor Ganador. Crea ventana para mostrar el ganador. Pregunta si se va a jugar de nuevo.
     * @param controlador una instacia de controlador al que la vista va a notificar
     */
    public GanadorView(Controlador controlador) {
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
        GuardarPartida1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTotal2.setText("TotalJug2");

        jLabel6.setText("Felicidades el ganador es :");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jLabel8.setText("¿Desea jugar de nuevo?");

        btnSi.setBackground(new java.awt.Color(0, 0, 0));
        btnSi.setForeground(new java.awt.Color(255, 255, 255));
        btnSi.setText("Sí");
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });

        btnNo.setBackground(new java.awt.Color(0, 0, 0));
        btnNo.setForeground(new java.awt.Color(255, 255, 255));
        btnNo.setText("No");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        lblGanador.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblGanador.setForeground(new java.awt.Color(0, 204, 51));
        lblGanador.setText("Ganador");

        lblJug1.setText("Jugador1");

        lblJug2.setText("Jugador2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Suma de las cartas: ");

        lblTotal1.setText("TotalJug1");

        GuardarPartida1.setBackground(new java.awt.Color(0, 0, 0));
        GuardarPartida1.setForeground(new java.awt.Color(255, 255, 255));
        GuardarPartida1.setText("Guardar Partida");
        GuardarPartida1.setActionCommand("Inciar Ronda");
        GuardarPartida1.setName("Repartir"); // NOI18N
        GuardarPartida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarPartidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnSi)
                        .addGap(34, 34, 34)
                        .addComponent(btnNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJug1)
                    .addComponent(lblTotal1))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJug2)
                    .addComponent(lblTotal2))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblGanador))
                .addGap(46, 46, 46)
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSi)
                    .addComponent(btnNo))
                .addContainerGap(49, Short.MAX_VALUE))
        );

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        controlador.finalizarJuego();
    }//GEN-LAST:event_btnNoActionPerformed

    private void GuardarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarPartidaActionPerformed
        // TODO add your handling code here:
        // if(controlador.guardarPartida()){
        //     JOptionPane.showMessageDialog(null, "Se cargo la partida correctamente","Partida",JOptionPane.INFORMATION_MESSAGE);
        // }
    }//GEN-LAST:event_GuardarPartidaActionPerformed
    
    private Controlador controlador;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarPartida1;
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
