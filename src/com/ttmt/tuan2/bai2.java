/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttmt.tuan2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Lâm Hoàng Minh Tuấn
 */
public class bai2 extends JFrame{
    public bai2() {
        super("Demo FlowLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.PINK);

        JButton button1 = new JButton("FlowLayout");
        JButton button2 = new JButton("Add các control");
        JButton button3 = new JButton("Trên 1 dòng");
        JButton button4 = new JButton("Hết chỗ chứa");
        JButton button5 = new JButton("Thì xuống dòng");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);

        Container container = getContentPane();
        container.add(panel);
    }

    public static void main(String[] args) {
        bai2 ui = new bai2();
        ui.setSize(400, 300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
