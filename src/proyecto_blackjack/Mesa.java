/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_blackjack;
import javax.swing.ImageIcon;
/**
 *
 * @author Andy
 */
public class Mesa extends javax.swing.JFrame {

    /**
     * Creates new form Mesa
     */
    public Mesa(Controlador controlador) {
        this.setLocationRelativeTo(null);
        initComponents();
        this.controlador = controlador;
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/back.png"));
        ImageIcon front = new ImageIcon(getClass().getResource("/Imagenes/13picas.png"));
        carta1.setIcon(imagen);
        carta2.setIcon(front);
        carta3.setIcon(front);
        carta4.setIcon(front);
        carta5.setIcon(front);
        carta6.setIcon(imagen);
        carta7.setIcon(front);
        carta8.setIcon(front);
        carta9.setIcon(front);
        carta10.setIcon(front);
    }
    
    public void setTextJug1(String name){
        nameJug1.setText(name);
    }
    
    public void setTextJug2(String name){
        nameJug2.setText(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
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
        setMinimumSize(new java.awt.Dimension(700, 460));
        setPreferredSize(new java.awt.Dimension(700, 460));
        getContentPane().setLayout(null);

        jButton2.setText("Iniciar Ronda");
        jButton2.setActionCommand("Inciar Ronda");
        jButton2.setName("Repartir"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 370, 120, 22);

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        controlador.jugar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void carta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carta1MouseClicked

    private void carta1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta1MousePressed
        // TODO add your handling code here:
        ImageIcon front = new ImageIcon(getClass().getResource("/Imagenes/11corazones.png"));
        carta1.setIcon(front);
    }//GEN-LAST:event_carta1MousePressed

    private void carta1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta1MouseReleased
        // TODO add your handling code here:
        ImageIcon back = new ImageIcon(getClass().getResource("/Imagenes/back.png"));
        carta1.setIcon(back);
    }//GEN-LAST:event_carta1MouseReleased

    private void carta5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carta5MouseClicked

    private void carta5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_carta5MousePressed

    private void carta5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_carta5MouseReleased

    private void carta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carta4MouseClicked

    private void carta4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_carta4MousePressed

    private void carta4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_carta4MouseReleased

    private void carta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carta3MouseClicked

    private void carta3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_carta3MousePressed

    private void carta3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_carta3MouseReleased

    private void carta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carta2MouseClicked

    private void carta2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_carta2MousePressed

    private void carta2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_carta2MouseReleased

    private void carta6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carta6MouseClicked

    private void carta6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_carta6MousePressed

    private void carta6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_carta6MouseReleased

    private void carta7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carta7MouseClicked

    private void carta7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_carta7MousePressed

    private void carta7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta7MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_carta7MouseReleased

    private void carta8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carta8MouseClicked

    private void carta8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_carta8MousePressed

    private void carta8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta8MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_carta8MouseReleased

    private void carta9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carta9MouseClicked

    private void carta9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_carta9MousePressed

    private void carta9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta9MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_carta9MouseReleased

    private void carta10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carta10MouseClicked

    private void carta10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_carta10MousePressed

    private void carta10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta10MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_carta10MouseReleased

    private Controlador controlador;
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameJug1;
    private javax.swing.JLabel nameJug2;
    // End of variables declaration//GEN-END:variables
}
