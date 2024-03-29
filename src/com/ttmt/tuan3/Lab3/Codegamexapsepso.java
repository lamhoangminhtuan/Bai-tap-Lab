/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttmt.tuan3.Lab3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lâm Hoàng Minh Tuấn
 */
public class Codegamexapsepso extends javax.swing.JFrame{
     public Codegamexapsepso() {
        initComponents();
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        so15 = new javax.swing.JButton();
        so14 = new javax.swing.JButton();
        so13 = new javax.swing.JButton();
        so12 = new javax.swing.JButton();
        so11 = new javax.swing.JButton();
        so10 = new javax.swing.JButton();
        so9 = new javax.swing.JButton();
        so8 = new javax.swing.JButton();
        so7 = new javax.swing.JButton();
        so6 = new javax.swing.JButton();
        so5 = new javax.swing.JButton();
        so4 = new javax.swing.JButton();
        so3 = new javax.swing.JButton();
        so2 = new javax.swing.JButton();
        so1 = new javax.swing.JButton();
        space = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game Mini");
        setResizable(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTitle.setText("TRÒ CHƠI XẾP Ô SỐ");
        jPanel2.add(lblTitle);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        btnStart.setText("Bắt đầu");
        btnStart.addActionListener(this::btnStartActionPerformed);
        jPanel3.add(btnStart);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setLayout(new java.awt.GridLayout(4, 4));

        so15.setText("1");
        so15.setEnabled(false);
        so15.addActionListener(this::so15ActionPerformed);
        jPanel4.add(so15);

        so14.setText("2");
        so14.setEnabled(false);
        so14.addActionListener(this::so14ActionPerformed);
        jPanel4.add(so14);

        so13.setText("3");
        so13.setEnabled(false);
        so13.addActionListener(this::so13ActionPerformed);
        jPanel4.add(so13);

        so12.setText("4");
        so12.setEnabled(false);
        so12.addActionListener(this::so12ActionPerformed);
        jPanel4.add(so12);

        so11.setText("5");
        so11.setEnabled(false);
        so11.addActionListener(this::so11ActionPerformed);
        jPanel4.add(so11);

        so10.setText("6");
        so10.setEnabled(false);
        so10.addActionListener(this::so10ActionPerformed);
        jPanel4.add(so10);

        so9.setText("7");
        so9.setEnabled(false);
        so9.addActionListener(this::so9ActionPerformed);
        jPanel4.add(so9);

        so8.setText("8");
        so8.setEnabled(false);
        so8.addActionListener(this::so8ActionPerformed);
        jPanel4.add(so8);

        so7.setText("9");
        so7.setEnabled(false);
        so7.addActionListener(this::so7ActionPerformed);
        jPanel4.add(so7);

        so6.setText("10");
        so6.setEnabled(false);
        so6.addActionListener(this::so6ActionPerformed);
        jPanel4.add(so6);

        so5.setText("11");
        so5.setEnabled(false);
        so5.addActionListener(this::so5ActionPerformed);
        jPanel4.add(so5);

        so4.setText("12");
        so4.setEnabled(false);
        so4.addActionListener(this::so4ActionPerformed);
        jPanel4.add(so4);

        so3.setText("13");
        so3.setEnabled(false);
        so3.addActionListener(this::so3ActionPerformed);
        jPanel4.add(so3);

        so2.setText("14");
        so2.setEnabled(false);
        so2.addActionListener(this::so2ActionPerformed);
        jPanel4.add(so2);

        so1.setEnabled(false);
        so1.addActionListener(this::so1ActionPerformed);
        jPanel4.add(so1);

        space.setText("15");
        space.setEnabled(false);
        space.addActionListener(this::spaceActionPerformed);
        jPanel4.add(space);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean ktraBtnStart = false;
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed

        if (this.ktraBtnStart == false) {
            if (this.getTitle().trim().equals("Game Mini")) {
                String hoTen = JOptionPane.showInputDialog("Nhập họ tên người chơi").trim();
                while (true) {
                    if (!hoTen.trim().equals("")) {
                        this.setTitle(hoTen);
                        this.btnStart.setText("Dừng");
                        this.ktraBtnStart = true;
                        break;
                    } else {
                        hoTen = JOptionPane.showInputDialog("Nhập họ tên người chơi!!!").trim();
                    }
                }
            } else {
                this.ktraBtnStart = true;
                this.btnStart.setText("Dừng");
            }
        } else {
            this.ktraBtnStart = false;
            this.btnStart.setText("Tiếp tục");
        }
        winChua();
    }//GEN-LAST:event_btnStartActionPerformed

    private void so15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so15ActionPerformed
        hoanDoi(btnNull, so11, so14, btnNull, so15);
        winChua();
    }//GEN-LAST:event_so15ActionPerformed

    private final JButton btnNull = new JButton("null");
    private void so4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so4ActionPerformed
        hoanDoi(so8, space, btnNull, so5, this.so4);
        winChua();
    }//GEN-LAST:event_so4ActionPerformed

    private void so14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so14ActionPerformed
        hoanDoi(btnNull, so10, so13, so15, so14);
        winChua();
    }//GEN-LAST:event_so14ActionPerformed

    private void so13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so13ActionPerformed
        hoanDoi(btnNull, so9, so12, so14, so13);
        winChua();
    }//GEN-LAST:event_so13ActionPerformed

    private void so12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so12ActionPerformed
        hoanDoi(btnNull, so8, btnNull, so13, so12);
        winChua();
    }//GEN-LAST:event_so12ActionPerformed

    private void so11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so11ActionPerformed
        hoanDoi(so15, so7, so10, btnNull, so11);
        winChua();
    }//GEN-LAST:event_so11ActionPerformed

    private void so10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so10ActionPerformed
        hoanDoi(so14, so6, so9, so11, so10);
        winChua();
    }//GEN-LAST:event_so10ActionPerformed

    private void so9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so9ActionPerformed
        hoanDoi(so13, so5, so8, so10, so9);
        winChua();
    }//GEN-LAST:event_so9ActionPerformed

    private void so8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so8ActionPerformed
        hoanDoi(so12, so4, btnNull, so9, so8);
        winChua();
    }//GEN-LAST:event_so8ActionPerformed

    private void so7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so7ActionPerformed
        hoanDoi(so11, so3, so6, btnNull, so7);
        winChua();
    }//GEN-LAST:event_so7ActionPerformed

    private void so6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so6ActionPerformed
        hoanDoi(so10, so2, so5, so7, so6);
        winChua();
    }//GEN-LAST:event_so6ActionPerformed

    private void so5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so5ActionPerformed
        hoanDoi(so9, so1, so4, so6, so5);
        winChua();
    }//GEN-LAST:event_so5ActionPerformed

    private void so3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so3ActionPerformed
        hoanDoi(so7, btnNull, so2, btnNull, so3);
        winChua();
    }//GEN-LAST:event_so3ActionPerformed

    private void so2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so2ActionPerformed
        hoanDoi(so6, btnNull, so1, so3, so2);
        winChua();
    }//GEN-LAST:event_so2ActionPerformed

    private void so1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so1ActionPerformed
        hoanDoi(so5, btnNull, space, so2, so1);
        winChua();
    }//GEN-LAST:event_so1ActionPerformed

    private void spaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaceActionPerformed
        hoanDoi(so4, btnNull, btnNull, so1, space);
        winChua();
    }//GEN-LAST:event_spaceActionPerformed

    public void hoanDoi(JButton tren, JButton duoi, JButton phai, JButton trai, JButton giua) {
        if (tren.getText().equals("")) {
            tren.setText(giua.getText());
            giua.setText("");
        } else if (duoi.getText().equals("")) {
            duoi.setText(giua.getText());
            giua.setText("");
        } else if (phai.getText().equals("")) {
            phai.setText(giua.getText());
            giua.setText("");
        } else if (trai.getText().equals("")) {
            trai.setText(giua.getText());
            giua.setText("");
        }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Codegamexapsepso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(() -> {
            new Codegamexapsepso().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton so1;
    private javax.swing.JButton so10;
    private javax.swing.JButton so11;
    private javax.swing.JButton so12;
    private javax.swing.JButton so13;
    private javax.swing.JButton so14;
    private javax.swing.JButton so15;
    private javax.swing.JButton so2;
    private javax.swing.JButton so3;
    private javax.swing.JButton so4;
    private javax.swing.JButton so5;
    private javax.swing.JButton so6;
    private javax.swing.JButton so7;
    private javax.swing.JButton so8;
    private javax.swing.JButton so9;
    private javax.swing.JButton space;
    // End of variables declaration//GEN-END:variables

    private void winChua() {

        // ket thuc
        if (this.so15.getText().equals("1")
                && this.so14.getText().equals("2")
                && this.so13.getText().equals("3")
                && this.so12.getText().equals("4")
                && this.so11.getText().equals("5")
                && this.so10.getText().equals("6")
                && this.so9.getText().equals("7")
                && this.so8.getText().equals("8")
                && this.so7.getText().equals("9")
                && this.so6.getText().equals("10")
                && this.so5.getText().equals("11")
                && this.so4.getText().equals("12")
                && this.so3.getText().equals("13")
                && this.so2.getText().equals("14")
                && this.so1.getText().equals("15")
                && this.space.getText().equals("")
                && this.ktraBtnStart) {
            int ret = JOptionPane.showConfirmDialog(null, this.getTitle() + " có muốn tiếp tục không?", " Chiến Thắng!", JOptionPane.YES_NO_OPTION);
            if (ret == JOptionPane.YES_OPTION) {
                this.ktraBtnStart = false;
                this.btnStart.setText("Bắt đầu");
                this.setTitle("Game Mini");

                this.so1.setText("1");
                this.so2.setText("2");
                this.so3.setText("3");
                this.so4.setText("4");
                this.so5.setText("5");
                this.so6.setText("6");
                this.so7.setText("7");
                this.so8.setText("8");
                this.so9.setText("9");
                this.so10.setText("10");
                this.so11.setText("11");
                this.so12.setText("12");
                this.so13.setText("13");
                this.so14.setText("14");
                this.so15.setText("15");
                this.space.setText("");
            } else if (ret == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
        }
        this.so1.setEnabled(ktraBtnStart);
        this.so2.setEnabled(ktraBtnStart);
        this.so3.setEnabled(ktraBtnStart);
        this.so4.setEnabled(ktraBtnStart);
        this.so5.setEnabled(ktraBtnStart);
        this.so6.setEnabled(ktraBtnStart);
        this.so7.setEnabled(ktraBtnStart);
        this.so8.setEnabled(ktraBtnStart);
        this.so9.setEnabled(ktraBtnStart);
        this.so10.setEnabled(ktraBtnStart);
        this.so11.setEnabled(ktraBtnStart);
        this.so12.setEnabled(ktraBtnStart);
        this.so13.setEnabled(ktraBtnStart);
        this.so14.setEnabled(ktraBtnStart);
        this.so15.setEnabled(ktraBtnStart);
        this.space.setEnabled(ktraBtnStart);
    }
}
