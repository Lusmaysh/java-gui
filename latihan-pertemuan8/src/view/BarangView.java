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

/**
 *
 * @author PC
 */
public class BarangView extends javax.swing.JFrame {
    
    private Koneksi k;
    /**
     * Creates new form BarangView
     */
    public BarangView() {
        initComponents();
        k = new Koneksi();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textKodeBarang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textJudulBarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textStokBarang = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        tombolSimpan = new javax.swing.JButton();
        tombolDelete = new javax.swing.JButton();
        tombolUpdate = new javax.swing.JButton();
        tombolRead = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("DATA BARANG");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel2.setLayout(new java.awt.GridLayout(0, 2, 10, 10));

        jLabel2.setText("KODE BARANG");
        jPanel2.add(jLabel2);
        jPanel2.add(textKodeBarang);

        jLabel3.setText("JUDUL BARANG");
        jPanel2.add(jLabel3);
        jPanel2.add(textJudulBarang);

        jLabel4.setText("STOK BARANG");
        jPanel2.add(jLabel4);
        jPanel2.add(textStokBarang);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        tombolSimpan.setText("SIMPAN");
        tombolSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolSimpanActionPerformed(evt);
            }
        });
        jPanel3.add(tombolSimpan);

        tombolDelete.setText("DELETE");
        tombolDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(tombolDelete);

        tombolUpdate.setText("UPDATE");
        tombolUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(tombolUpdate);

        tombolRead.setText("READ");
        tombolRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolReadActionPerformed(evt);
            }
        });
        jPanel3.add(tombolRead);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSimpanActionPerformed
        try {
            // TODO add your handling code here:
            String sqlInsert = "insert into barang (kode_barang, judul_barang, stok_barang) values ('"+textKodeBarang.getText()+"', '"+textJudulBarang.getText()+"', '"+textStokBarang.getText()+"')";
            Statement stmt = k.createStatement();
            stmt.executeUpdate(sqlInsert);
            JOptionPane.showMessageDialog(this, "Data berhasil di simpan!");
            
            textKodeBarang.setText("");
            textJudulBarang.setText("");
            textStokBarang.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(BarangView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        try {
//            // Ambil data dari text fields
//            String kodeBarang = textKodeBarang.getText();
//            String judulBarang = textJudulBarang.getText();
//            String stokBarang = textStokBarang.getText();
//
//            if (kodeBarang.isEmpty() || judulBarang.isEmpty() || stokBarang.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Semua field harus diisi!");
//                return;
//            }
//
//            // Query INSERT menggunakan PreparedStatement
//            String sqlInsert = "INSERT INTO barang (kode_barang, judul_barang, stok_barang) VALUES (?, ?, ?)";
//
//            PreparedStatement pstmt = k.konek.prepareStatement(sqlInsert);
//            pstmt.setString(1, kodeBarang);
//            pstmt.setString(2, judulBarang);
//            pstmt.setString(3, stokBarang);
//
//            int rowsAffected = pstmt.executeUpdate(); // Menjalankan query
//
//            // Mengecek apakah ada baris yang terpengaruh
//            if (rowsAffected > 0) {
//                JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
//            } else {
//                JOptionPane.showMessageDialog(this, "Gagal menyimpan data!");
//            }
//
//            // Kosongkan text fields setelah simpan
//            textKodeBarang.setText("");
//            textJudulBarang.setText("");
//            textStokBarang.setText("");
//
//        } catch (SQLException ex) {
//            // Tangani jika terjadi error
//            Logger.getLogger(BarangView.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data!");
//        }
    }//GEN-LAST:event_tombolSimpanActionPerformed

    private void tombolDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolDeleteActionPerformed
        // TODO add your handling code here:
//        try {
//            // Ambil kode_barang dari text field (misalnya textKodeBarang)
//            String kodeBarang = textKodeBarang.getText();
//
//            if (kodeBarang.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Kode Barang harus diisi!");
//                return;
//            }
//
//            // Query DELETE dengan PreparedStatement
//            String sqlDelete = "DELETE FROM barang WHERE kode_barang = ?";
//
//            // Siapkan PreparedStatement untuk query delete
//            PreparedStatement pstmt = k.konek.prepareStatement(sqlDelete);
//            pstmt.setString(1, kodeBarang); // Mengisi parameter query dengan kode_barang
//
//            // Eksekusi query DELETE
//            int rowsAffected = pstmt.executeUpdate();
//
//            // Mengecek apakah ada data yang terhapus
//            if (rowsAffected > 0) {
//                JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
//            } else {
//                JOptionPane.showMessageDialog(this, "Kode Barang tidak ditemukan!");
//            }
//
//            // Kosongkan semua field input setelah penghapusan
//            textKodeBarang.setText("");
//            textJudulBarang.setText("");
//            textStokBarang.setText("");
//
//        } catch (SQLException ex) {
//            Logger.getLogger(BarangView.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menghapus data!");
//        }

        try {
            // Ambil kode_barang dari text field (misalnya textKodeBarang)
            String kodeBarang = textKodeBarang.getText();

            if (kodeBarang.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Kode Barang harus diisi!");
                return;
            }

            // Query DELETE
            String sqlDelete = "DELETE FROM barang WHERE kode_barang = '" + kodeBarang + "'";

            // Siapkan Statement untuk query DELETE
            Statement stmt = k.konek.createStatement();

            // Eksekusi query DELETE
            int rowsAffected = stmt.executeUpdate(sqlDelete);

            // Mengecek apakah ada data yang terhapus
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
            } else {
                JOptionPane.showMessageDialog(this, "Kode Barang tidak ditemukan!");
            }

            // Kosongkan semua field input setelah penghapusan
            textKodeBarang.setText("");
            textJudulBarang.setText("");
            textStokBarang.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(BarangView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menghapus data!");
        }
    }//GEN-LAST:event_tombolDeleteActionPerformed

    private void tombolUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolUpdateActionPerformed
        // TODO add your handling code here:
        try {
            // Ambil data dari text fields
            String kodeBarang = textKodeBarang.getText();
            String judulBarang = textJudulBarang.getText();
            String stokBarang = textStokBarang.getText();

            if (kodeBarang.isEmpty() || judulBarang.isEmpty() || stokBarang.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua field harus diisi!");
                return;
            }

            // Query UPDATE menggunakan PreparedStatement
            String sqlUpdate = "UPDATE barang SET judul_barang = ?, stok_barang = ? WHERE kode_barang = ?";

            PreparedStatement pstmt = k.konek.prepareStatement(sqlUpdate);
            pstmt.setString(1, judulBarang);  // Set judul_barang
            pstmt.setString(2, stokBarang);   // Set stok_barang
            pstmt.setString(3, kodeBarang);   // Set kode_barang sebagai kondisi

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!");
            } else {
                JOptionPane.showMessageDialog(this, "Kode Barang tidak ditemukan!");
            }

            // Kosongkan text fields
            textKodeBarang.setText("");
            textJudulBarang.setText("");
            textStokBarang.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(BarangView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat memperbarui data!");
        }
    }//GEN-LAST:event_tombolUpdateActionPerformed

    private void tombolReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolReadActionPerformed
        // TODO add your handling code here:
        try {
            // Ambil kode_barang dari text field (misalnya textKodeBarang)
            String kodeBarang = textKodeBarang.getText();

            if (kodeBarang.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Kode Barang harus diisi untuk pencarian!");
                return;
            }

            // Query SELECT untuk mencari data berdasarkan kode_barang
            String sqlSelect = "SELECT * FROM barang WHERE kode_barang = ?";

            PreparedStatement pstmt = k.konek.prepareStatement(sqlSelect);
            pstmt.setString(1, kodeBarang);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Jika data ditemukan, tampilkan di text field
                textKodeBarang.setText(rs.getString("kode_barang"));
                textJudulBarang.setText(rs.getString("judul_barang"));
                textStokBarang.setText(rs.getString("stok_barang"));
            } else {
                JOptionPane.showMessageDialog(this, "Data dengan Kode Barang tersebut tidak ditemukan!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(BarangView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengambil data!");
        }
    }//GEN-LAST:event_tombolReadActionPerformed

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
            java.util.logging.Logger.getLogger(BarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarangView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField textJudulBarang;
    private javax.swing.JTextField textKodeBarang;
    private javax.swing.JTextField textStokBarang;
    private javax.swing.JButton tombolDelete;
    private javax.swing.JButton tombolRead;
    private javax.swing.JButton tombolSimpan;
    private javax.swing.JButton tombolUpdate;
    // End of variables declaration//GEN-END:variables
}