/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
//import main.Mahasiswa;

/**
 *
 * @author PC
 */
public class KelasView extends javax.swing.JFrame {

    private Kelas kelas;
    DefaultListModel<String> modelList = new DefaultListModel<>();
    /**
     * Creates new form test
     */
    public KelasView() {
        initComponents();
        jList1.setModel(modelList);
        kelas = new Kelas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        radioLaki = new javax.swing.JRadioButton();
        radioPerempuan = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        buttonSubmit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setLayout(new java.awt.GridLayout(0, 2));

        jLabel1.setText("Nama");
        jPanel1.add(jLabel1);
        jPanel1.add(textNama);

        jLabel2.setText("Jenis Kelamin");
        jPanel1.add(jLabel2);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup1.add(radioLaki);
        radioLaki.setText("Laki-laki");
        jPanel3.add(radioLaki);

        buttonGroup1.add(radioPerempuan);
        radioPerempuan.setText("Perempuan");
        jPanel3.add(radioPerempuan);

        jPanel1.add(jPanel3);

        jLabel4.setText("Kelas Pelatihan");
        jPanel1.add(jLabel4);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "Dasar", "Menengah", "Lanjutan" }));
        jPanel1.add(jComboBox1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel2.setLayout(new java.awt.BorderLayout());

        buttonSubmit.setText("Submit");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });
        jPanel4.add(buttonSubmit);

        jButton1.setText("reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jLabel3.setText("Ringkasan Pilihan");
        jPanel5.add(jLabel3);

        jScrollPane1.setViewportView(jList1);

        jPanel5.add(jScrollPane1);

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        // TODO add your handling code here:
        modelList.clear();
        
        if(textNama.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong");
            return;
        }
        kelas.setNama(textNama.getText());
        
        if(!radioLaki.isSelected() && !radioPerempuan.isSelected())
        {
            JOptionPane.showMessageDialog(this, "Jenis kelamin tidak boleh kosong");
            return;
        }
        kelas.setJenisKelamin(radioLaki.isSelected() ? "Laki-laki" : "Perempuan");
        
        if(jComboBox1.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(this, "Kelas tidak boleh kosong");
            return;
        }
        kelas.setKelasPelatihan(jComboBox1.getSelectedItem().toString());

        modelList.addElement("Nama: "+kelas.getNama());
        modelList.addElement("Jenis Kelamin: "+kelas.getJenisKelamin());
        modelList.addElement("Kelas Pelatihan: "+kelas.getKelasPelatihan());
        
//        JOptionPane.showMessageDialog(this, "Sukses");
    }//GEN-LAST:event_buttonSubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        textNama.setText("");
        buttonGroup1.clearSelection();
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(KelasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioLaki;
    private javax.swing.JRadioButton radioPerempuan;
    private javax.swing.JTextField textNama;
    // End of variables declaration//GEN-END:variables
}