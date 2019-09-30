/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttmt.tuan1.Lab1;

import java.util.Scanner;

/**
 *
 * @author Lâm Hoàng Minh Tuấn
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính thể tích khối lập phương!");
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();
        double theTich = Math.pow(canh, 3);

        System.out.printf("Thể tích của khối chữ nhật = %.2f", theTich);
        scanner.close();
    }
}
