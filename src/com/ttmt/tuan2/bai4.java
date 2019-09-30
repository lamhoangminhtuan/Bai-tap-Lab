/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttmt.tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Lâm Hoàng Minh Tuấn
 */
public class bai4 extends JFrame{
    public bai4 (String title) {
        super(title);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);

        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
        pnNorth.setBackground(Color.ORANGE);
        pnBorder.add(pnNorth,BorderLayout.NORTH);
        JPanel pnSouth = new JPanel();
        pnSouth.setBackground(Color.BLUE);
        pnBorder.add(pnSouth,BorderLayout.SOUTH);
        JPanel pnWest = new JPanel();
        pnWest.setBackground(Color.GREEN);
        pnBorder.add(pnWest,BorderLayout.WEST);
        JPanel pnEast=new JPanel();
        pnEast.setBackground(Color.YELLOW);
        pnBorder.add(pnEast,BorderLayout.EAST);
        JPanel pnCenter=new JPanel();
        pnCenter.setBackground(Color.WHITE);
        pnBorder.add(pnCenter,BorderLayout.CENTER);
        add(pnBorder);
    }
     public static void main(String[] args) {
        new bai4("Bai 4 - ve BorderLayout");
     }
}
