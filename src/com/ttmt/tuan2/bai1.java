/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttmt.tuan2;

import javax.swing.JFrame;

/**
 *
 * @author Lâm Hoàng Minh Tuấn
 */
public class bai1 extends JFrame{
    public bai1() {
        super("Demo Windows"); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }

    public static void main(String[] args) {
        bai1 ui = new bai1();
        ui.setSize(400, 300); 
        ui.setLocationRelativeTo(null); 
        ui.setVisible(true);
    }
}
