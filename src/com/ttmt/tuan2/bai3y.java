/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttmt.tuan2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Lâm Hoàng Minh Tuấn
 */
public class bai3y extends JFrame{
    public bai3y(){
        super("hoc boxLayout");
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel pnBox=new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox,BoxLayout.Y_AXIS));
        JButton btn1=new JButton("BoxLayout");
        btn1.setForeground(Color.red);
        JButton btn2=new JButton("X_AXIS");
        btn2.setForeground(Color.blue);
        JButton btn3=new JButton("Y_AXIS");
        btn3.setForeground(Color.yellow);
        Font font=new Font("Arial",Font.BOLD|Font.ITALIC,25);
        btn1.setFont(font); btn2.setFont(font);
        btn3.setFont(font);
        pnBox.add(btn1);pnBox.add(btn2);pnBox.add(btn3);
        add(pnBox);
    }

    public static void main(String[] args) {
        new bai3y();
    }
}
