/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Daniel
 */
import clases.Cuadricula;
import clases.GameEngine;
import java.awt.Cursor;
import java.awt.Point;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class GJuego extends javax.swing.JFrame {

    /**
     * Creates new form GJuego
     */
    private JLabel etiquetas[][] = new JLabel[6][7];
    private Cuadricula cuadricula;
    private GameEngine motor;
    private byte jugadorActivo = 1;
    public GJuego() {
        initComponents();
        this.cuadricula = new Cuadricula();
        this.motor = new GameEngine(cuadricula);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        for(int f=0;f<6;f++){
            for(int c=0;c<7;c++){
                etiquetas[f][c] = new JLabel();
                Image img = new ImageIcon(getClass().getResource("/gui/img/azul.png")).getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT);
                etiquetas[f][c].setIcon(new ImageIcon(img));
                
                contenedor.add(etiquetas[f][c]);
            }
        }   
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        columna1 = new javax.swing.JLabel();
        columna2 = new javax.swing.JLabel();
        columna3 = new javax.swing.JLabel();
        columna4 = new javax.swing.JLabel();
        columna5 = new javax.swing.JLabel();
        columna6 = new javax.swing.JLabel();
        columna7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jugador = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cuatro En Línea");
        getContentPane().add(jLabel1, java.awt.BorderLayout.NORTH);

        contenedor.setLayout(new java.awt.GridLayout(7, 7));

        columna1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        columna1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        columna1.setText("---");
        columna1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        columna1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                columna1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                columna1MouseEntered(evt);
            }
        });
        contenedor.add(columna1);

        columna2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        columna2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        columna2.setText("---");
        columna2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        columna2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                columna2MouseClicked(evt);
            }
        });
        contenedor.add(columna2);

        columna3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        columna3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        columna3.setText("---");
        columna3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        columna3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                columna3MouseClicked(evt);
            }
        });
        contenedor.add(columna3);

        columna4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        columna4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        columna4.setText("---");
        columna4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        columna4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                columna4MouseClicked(evt);
            }
        });
        contenedor.add(columna4);

        columna5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        columna5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        columna5.setText("---");
        columna5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        columna5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                columna5MouseClicked(evt);
            }
        });
        contenedor.add(columna5);

        columna6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        columna6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        columna6.setText("---");
        columna6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        columna6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                columna6MouseClicked(evt);
            }
        });
        contenedor.add(columna6);

        columna7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        columna7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        columna7.setText("---");
        columna7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        columna7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                columna7MouseClicked(evt);
            }
        });
        contenedor.add(columna7);

        getContentPane().add(contenedor, java.awt.BorderLayout.CENTER);

        jugador.setText("Jugador :");
        jPanel2.add(jugador);

        save.setText("Guardar");
        jPanel2.add(save);

        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void columna1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_columna1MouseClicked
        // TODO add your handling code here:
        byte celda = cuadricula.ultimaVacia((byte)0);
        cuadricula.insertarFicha(celda, (byte)0, (byte)jugadorActivo);
        this.cambiarFicha((byte)jugadorActivo, celda, 0);
        if(motor.ComprobarGanador(jugadorActivo)){
            JOptionPane.showMessageDialog(null, "Ganador: ");
          }
        if(jugadorActivo==1)
            jugadorActivo=2;
        else
            jugadorActivo=1;
    }//GEN-LAST:event_columna1MouseClicked

    private void columna2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_columna2MouseClicked
        // TODO add your handling code here:
        this.setFicha((byte)1,jugadorActivo);
    }//GEN-LAST:event_columna2MouseClicked

    private void columna3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_columna3MouseClicked
        // TODO add your handling code here:
        this.setFicha((byte)2, jugadorActivo);
    }//GEN-LAST:event_columna3MouseClicked

    private void columna4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_columna4MouseClicked
        // TODO add your handling code here:
        this.setFicha((byte)3, jugadorActivo);
    }//GEN-LAST:event_columna4MouseClicked

    private void columna5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_columna5MouseClicked
        // TODO add your handling code here:
        this.setFicha((byte)4, jugadorActivo);
    }//GEN-LAST:event_columna5MouseClicked

    private void columna6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_columna6MouseClicked
        // TODO add your handling code here:
        this.setFicha((byte)5, jugadorActivo);
    }//GEN-LAST:event_columna6MouseClicked

    private void columna7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_columna7MouseClicked
        // TODO add your handling code here:
        this.setFicha((byte)6, jugadorActivo);
    }//GEN-LAST:event_columna7MouseClicked

    private void columna1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_columna1MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_columna1MouseEntered
    private void cambiarFicha(byte color,int fila,int columna){
        Image img = new ImageIcon(getClass().getResource("/gui/img/rojo.png")).getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT);
        if(color==2)
            img=new ImageIcon(getClass().getResource("/gui/img/amarillo.png")).getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT);
        this.etiquetas[fila][columna].setIcon(new ImageIcon(img));
        
    }
    private void setFicha(byte columna,byte jugador){
        byte celda = cuadricula.ultimaVacia((byte)columna);
        cuadricula.insertarFicha(celda, (byte)columna, (byte)jugador);
        this.cambiarFicha((byte)jugador, celda, columna);
        if(motor.ComprobarGanador(jugador)){
            JOptionPane.showMessageDialog(null, "Ganador: Jugador " + jugador);
          }
        if(jugador==1)
            jugadorActivo=2;
        else
            jugadorActivo=1;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel columna1;
    private javax.swing.JLabel columna2;
    private javax.swing.JLabel columna3;
    private javax.swing.JLabel columna4;
    private javax.swing.JLabel columna5;
    private javax.swing.JLabel columna6;
    private javax.swing.JLabel columna7;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jugador;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}