package marda;

/**
 *
 * @author Andy Alvarado, María Andres, Tonny Ortiz, Gustavo Pinto
 */
public class AsesView extends javax.swing.JFrame {

    /**
     * Constructor Ases. Crea ventana para preguntar que valor le va a dar a los ases.
     * @param controlador una instacia de controlador al que la vista va a notificar
     */
    public AsesView(Controlador21 controlador) {
        this.setLocationRelativeTo(null);
        this.setTitle("As");
        this.controlador = controlador;
        initComponents();
    }
    
    /**
     * Cambia los valores de jugador y la posicion del as en la ventana.
     * @param pos la posicion donde se encuentra el as
     * @param jug el jugador del actual turno
     */
    public void setAs(int pos, int jug){
        lbl1.setText("Su carta numero " + pos + " es un As. ¿Cómo desea utilizarlo?");
        posicionAs = pos;
        jugador = jug;
    }

    /**
     * Crea los componentes de la ventana. Codigo autogenerado.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Valores = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        valor1 = new javax.swing.JRadioButton();
        valor11 = new javax.swing.JRadioButton();
        lbl1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        valor1.setBackground(new java.awt.Color(255, 255, 255));
        Valores.add(valor1);
        valor1.setText("1");
        valor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor1ActionPerformed(evt);
            }
        });

        valor11.setBackground(new java.awt.Color(255, 255, 255));
        Valores.add(valor11);
        valor11.setText("11");

        lbl1.setText("Su carta numero _ es un As. ¿Cómo desea utilizarlo?");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        btnAceptar.setBackground(new java.awt.Color(0, 0, 0));
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(valor11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(10, 10, 10)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor1)
                    .addComponent(valor11))
                .addGap(27, 27, 27)
                .addComponent(btnAceptar)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Indica cuando se selecciona la opcion 1.
     * @param evt Evento.
     */
    private void valor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor1ActionPerformed

    /**
     * Indica cuando se hace click en el boton aceptar.
     * @param evt Evento.
     * @bug la ventana no se esconde cuando se seleciona la opcion 1
     */
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        if(valor11.isSelected() == true){
            controlador.cambiarAs(jugador, posicionAs);
        }
        this.setVisible(false);
        controlador.finalizarTurno();
    }//GEN-LAST:event_btnAceptarActionPerformed
    
    private Controlador21 controlador;
    private int posicionAs;
    private int jugador;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Valores;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JRadioButton valor1;
    private javax.swing.JRadioButton valor11;
    // End of variables declaration//GEN-END:variables
}
