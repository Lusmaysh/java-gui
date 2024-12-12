/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import config.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class MahasiswaView extends javax.swing.JFrame {

    private Koneksi k;
    private DefaultTableModel tblModel;
    /**
     * Creates new form MahasiswaView
     */
    public MahasiswaView() {
        initComponents();
        k = new Koneksi();
        refreshTable();
    }

    public DefaultTableModel defaultTableModel() {
        return new DefaultTableModel (new Object [][]{}, new String[]{"NIM","NAMA"}) {
                boolean[] canEdit = new boolean[]{
                    false, false
                };
                
                @Override
                public boolean isCellEditable(int row, int column){
                    return canEdit[column];
                }
        };
    }
    
    public void refreshTable() {
        try {
            String data[] = new String[2];
            tblModel = defaultTableModel();
            tabelMahasiswa.setModel(tblModel);
            
            String sqlSelect = "SELECT * FROM mahasiswa";
            Statement stmt = k.createStatement();
            ResultSet result = stmt.executeQuery(sqlSelect);
            while (result.next()) {
                data[0] = result.getString("nim");
                data[1] = result.getString("nama");
                tblModel.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilData(){
        int row = tabelMahasiswa.getSelectedRow();
        textNim.setText(tblModel.getValueAt(row, 0).toString());
        textNama.setText(tblModel.getValueAt(row, 1).toString());
        
        textNim.setEnabled(true);
        tombolSimpan.setEnabled(true);
        tombolHapus.setEnabled(true);
    }
    
    public void clearForm(){
        textNim.setText(null);
        textNama.setText(null);
        
        textNim.setEnabled(true);
        tombolSimpan.setEnabled(true);
        
        tabelMahasiswa.clearSelection();
    }
    
    public void validasiNim(String nim){
        try {
            Statement stmt = k.createStatement();
            String sqlSelect = "SELECT * FROM mahasiswa WHERE nim = '"+nim+"'";
            ResultSet result = stmt.executeQuery(sqlSelect);
            if(result.next()){
                int confirm = JOptionPane.showConfirmDialog(this,
                        "Kode sudah ada!\nApakah anda ingin mengubah data?",
                        "Konfirmasi",JOptionPane.YES_NO_OPTION);
                if(confirm == 0){
                    textNim.setText(result.getString("nim"));
                    textNama.setText(result.getString("nama"));
                } else {
                    clearForm();
                }
            }
        } catch (SQLException ex) {            
            Logger.getLogger(MahasiswaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textNim = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        tombolSimpan = new javax.swing.JButton();
        tombolBaru = new javax.swing.JButton();
        tombolHapus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMahasiswa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("DEMO KONEKSI");
        jPanel3.add(jLabel1);

        jPanel1.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel4.setLayout(new java.awt.GridLayout(0, 2, 10, 10));

        jLabel2.setText("NIM");
        jPanel4.add(jLabel2);

        textNim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textNimFocusLost(evt);
            }
        });
        jPanel4.add(textNim);

        jLabel3.setText("NAMA");
        jPanel4.add(jLabel3);
        jPanel4.add(textNama);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        tombolSimpan.setText("SIMPAN");
        tombolSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolSimpanActionPerformed(evt);
            }
        });
        jPanel6.add(tombolSimpan);

        tombolBaru.setText("BARU");
        tombolBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBaruActionPerformed(evt);
            }
        });
        jPanel6.add(tombolBaru);

        tombolHapus.setText("HAPUS");
        tombolHapus.setEnabled(false);
        tombolHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolHapusActionPerformed(evt);
            }
        });
        jPanel6.add(tombolHapus);

        getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        jScrollPane1.setToolTipText("");

        tabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMahasiswaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tabelMahasiswaMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMahasiswa);

        jPanel2.add(jScrollPane1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSimpanActionPerformed
        // TODO add your handling code here:
        if(textNim.getText().isEmpty() || textNama.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String sqlInsert = "insert into mahasiswa (nim, nama) values ('"+textNim.getText()+"', '"+textNama.getText()+"')";
        try {
            Statement stmt = k.createStatement();
            stmt.executeUpdate(sqlInsert);
            JOptionPane.showMessageDialog(this, "Data berhasil di simpan!");
            
        } catch (SQLException ex) {
            if(ex.getErrorCode() == 1062 /*duplikat entry*/) {
                try {
                    String sqlUpdate = "UPDATE  mahasiswa SET "
                            + "NAMA = '"+textNama.getText()+"' "
                            + "WHERE nim = '"+textNim.getText()+"'";
                    Statement stmt = k.createStatement();
                    stmt.executeUpdate(sqlUpdate);
                    JOptionPane.showMessageDialog(this, "Data berhasil di ubah!");
                } catch (SQLException ex1) {
                    Logger.getLogger(MahasiswaView.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            System.out.println("ERROR: "+ex.getMessage());
        }
        tombolHapus.setEnabled(false);
        refreshTable();
    }//GEN-LAST:event_tombolSimpanActionPerformed

    private void textNimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNimFocusLost
        // TODO add your handling code here:
        validasiNim(textNim.getText());
    }//GEN-LAST:event_textNimFocusLost

    private void tombolBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBaruActionPerformed
        // TODO add your handling code here:
        tombolHapus.setEnabled(false);
        clearForm();
    }//GEN-LAST:event_tombolBaruActionPerformed

    private void tabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMahasiswaMouseClicked
        // TODO add your handling code here:
        tampilData();
    }//GEN-LAST:event_tabelMahasiswaMouseClicked

    private void tombolHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolHapusActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin menghapus data ini?", "Peringatan",JOptionPane.YES_NO_OPTION);
        if (confirm == 0){
            try {
                // TODO add your handling code here:
                String sqlDelete = "DELETE FROM mahasiswa WHERE nim = '"+textNim.getText()+"'";
                Statement stmt = k.createStatement();
                stmt.executeUpdate(sqlDelete);
                JOptionPane.showMessageDialog(this, "Data berhasil di hapus!");
            } catch (SQLException ex) {
                Logger.getLogger(MahasiswaView.class.getName()).log(Level.SEVERE, null, ex);
            }
            refreshTable();
        } 
        tombolHapus.setEnabled(false);
    }//GEN-LAST:event_tombolHapusActionPerformed

    private void tabelMahasiswaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMahasiswaMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tabelMahasiswaMouseExited

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
            java.util.logging.Logger.getLogger(MahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MahasiswaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelMahasiswa;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNim;
    private javax.swing.JButton tombolBaru;
    private javax.swing.JButton tombolHapus;
    private javax.swing.JButton tombolSimpan;
    // End of variables declaration//GEN-END:variables
}
