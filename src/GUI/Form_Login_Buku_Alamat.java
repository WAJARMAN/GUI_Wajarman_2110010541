/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Form_Login_Buku_Alamat extends javax.swing.JFrame {

    /**
     * Creates new form Form_Login_Buku_Alamat
     */
    public Form_Login_Buku_Alamat() {
        initComponents();
         Dimension screenSize = 
         Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = this.getSize();
            if (frameSize.height > screenSize.height) {
                frameSize.height = screenSize.height;
            }
            if (frameSize.width > screenSize.width) {
                frameSize.width = screenSize.width;
            }
            this.setLocation(
                    (screenSize.width - frameSize.width) / 2, 
                    (screenSize.height - frameSize.height) / 2); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        txtusername = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtusername.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 220, 70));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 330, 50));

        txtpassword.setFont(new java.awt.Font("Cambria", 0, 48)); // NOI18N
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 220, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Documents\\semester 5\\PBO 2 Pak edya\\Pink Muda Pengingat Muslim Quote Islami Kiriman Instagram.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                    // Memeriksa apakah teks pada JTextField "txtusername" kosong
             if (txtusername.getText().equals("")) {
                 // Menampilkan pesan peringatan jika username tidak diisi
                 JOptionPane.showMessageDialog(null, "Username Wajib Di isi!!");
                 // Fokuskan kursor ke JTextField "txtusername"
                 txtusername.requestFocus();
             } 
             // Memeriksa apakah teks pada JTextField "txtpassword" kosong
             else if (txtpassword.getText().equals("")) {
                 // Menampilkan pesan peringatan jika password tidak diisi
                 JOptionPane.showMessageDialog(null, "Password Wajib Di isi!!");
                 // Fokuskan kursor ke JTextField "txtpassword"
                 txtpassword.requestFocus();
             } 
             // Memeriksa apakah username mengandung "admin" dan password mengandung "admin"
             else if (txtusername.getText().contains("admin") && txtpassword.getText().contains("admin")) {
                 // Menampilkan pesan bahwa login berhasil
                 new BukuAlamat().show();
                 javax.swing.JOptionPane.showMessageDialog(null, "Anda Berhasil Login");
                 // Menutup frame atau form login saat login berhasil
                 this.dispose();
             } 
             // Jika username dan password tidak sesuai dengan kondisi sebelumnya
             else {
                 // Menampilkan pesan bahwa username atau password tidak sesuai
                 JOptionPane.showMessageDialog(null, "Username atau Password tidak sesuai");
             }

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
            java.util.logging.Logger.getLogger(Form_Login_Buku_Alamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Login_Buku_Alamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Login_Buku_Alamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Login_Buku_Alamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Login_Buku_Alamat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtpassword;
    private java.awt.TextField txtusername;
    private java.awt.TextField txtusername10;
    private java.awt.TextField txtusername11;
    private java.awt.TextField txtusername12;
    private java.awt.TextField txtusername13;
    private java.awt.TextField txtusername14;
    private java.awt.TextField txtusername15;
    private java.awt.TextField txtusername16;
    private java.awt.TextField txtusername17;
    private java.awt.TextField txtusername18;
    private java.awt.TextField txtusername19;
    private java.awt.TextField txtusername20;
    private java.awt.TextField txtusername21;
    private java.awt.TextField txtusername22;
    private java.awt.TextField txtusername23;
    private java.awt.TextField txtusername24;
    private java.awt.TextField txtusername5;
    private java.awt.TextField txtusername6;
    private java.awt.TextField txtusername7;
    private java.awt.TextField txtusername8;
    private java.awt.TextField txtusername9;
    // End of variables declaration//GEN-END:variables
}
