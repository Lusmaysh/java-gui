/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class KalkulatorView extends javax.swing.JFrame {

    private Kalkulator kalkulator;
    /**
     * Creates new form KalkulatorView
     */
    public KalkulatorView() {
        initComponents();
        
        kalkulator = new Kalkulator();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textAngka1 = new javax.swing.JTextField();
        textAngka2 = new javax.swing.JTextField();
        textHasil = new javax.swing.JTextField();
        tombolTambah = new javax.swing.JButton();
        tombolKurang = new javax.swing.JButton();
        tombolKali = new javax.swing.JButton();
        tombolBagi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Kalkulator Sederhana");

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 0, 36)); // NOI18N
        jLabel1.setText("Form Kalkulator");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Angka 1");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Angka 2");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Hasil");

        textAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAngka1ActionPerformed(evt);
            }
        });

        textHasil.setEditable(false);

        tombolTambah.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        tombolTambah.setText("+");
        tombolTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTambahActionPerformed(evt);
            }
        });

        tombolKurang.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        tombolKurang.setText("-");
        tombolKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKurangActionPerformed(evt);
            }
        });

        tombolKali.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        tombolKali.setText("x");
        tombolKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKaliActionPerformed(evt);
            }
        });

        tombolBagi.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        tombolBagi.setText("/");
        tombolBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBagiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(tombolTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tombolKurang)
                                .addGap(18, 18, 18)
                                .addComponent(tombolKali)
                                .addGap(18, 18, 18)
                                .addComponent(tombolBagi))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textAngka1)
                                    .addComponent(textAngka2)
                                    .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolTambah)
                    .addComponent(tombolKurang)
                    .addComponent(tombolKali)
                    .addComponent(tombolBagi))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textAngka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAngka1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAngka1ActionPerformed

    private void tombolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahActionPerformed
       // TODO add your handling code here:
        try {
            double angka1 = Double.parseDouble(textAngka1.getText());
            double angka2 = Double.parseDouble(textAngka2.getText());

            kalkulator.setAngka1(angka1);
            kalkulator.setAngka2(angka2);

            textHasil.setText(String.valueOf(kalkulator.tambah()));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Input tidak boleh karakter!!!",
                    "Peringatan",
                    JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_tombolTambahActionPerformed

    private void tombolKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKurangActionPerformed
        // TODO add your handling code here:
        try{
            
            double angka1 = Double.parseDouble(textAngka1.getText());
            double angka2 = Double.parseDouble(textAngka2.getText());

            kalkulator.setAngka1(angka1);
            kalkulator.setAngka2(angka2);

            textHasil.setText(String.valueOf(kalkulator.kurang()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Input tidak boleh karakter!!!",
                    "Peringatan",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tombolKurangActionPerformed

    private void tombolKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKaliActionPerformed
        // TODO add your handling code here:
        try{
            
            double angka1 = Double.parseDouble(textAngka1.getText());
            double angka2 = Double.parseDouble(textAngka2.getText());

            kalkulator.setAngka1(angka1);
            kalkulator.setAngka2(angka2);

            textHasil.setText(String.valueOf(kalkulator.kali()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Input tidak boleh karakter!!!",
                    "Peringatan",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tombolKaliActionPerformed

    private void tombolBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBagiActionPerformed
        // TODO add your handling code here:
        try{
            
            double angka1 = Double.parseDouble(textAngka1.getText());
            double angka2 = Double.parseDouble(textAngka2.getText());

            kalkulator.setAngka1(angka1);
            kalkulator.setAngka2(angka2);
            
            
            textHasil.setText(String.valueOf(kalkulator.bagi()));
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Input tidak boleh karakter!!!",
                    "Peringatan",
                    JOptionPane.WARNING_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this,
                    e.getMessage(),
                    "Peringatan",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tombolBagiActionPerformed

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
            java.util.logging.Logger.getLogger(KalkulatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textAngka1;
    private javax.swing.JTextField textAngka2;
    private javax.swing.JTextField textHasil;
    private javax.swing.JButton tombolBagi;
    private javax.swing.JButton tombolKali;
    private javax.swing.JButton tombolKurang;
    private javax.swing.JButton tombolTambah;
    // End of variables declaration//GEN-END:variables
}