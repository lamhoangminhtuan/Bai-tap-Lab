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
public class bai2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính chu vi, diện tích hình chữ nhật!");
        System.out.print("Nhập vào chiều dài: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhập vào chiều rộng: ");
        double rong = scanner.nextDouble();
        double chiVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double min = Math.min(dai, rong);

        System.out.println("Chu vi = " + chiVi);
        System.out.printf("Diện tích = %.2f\n", dienTich);
        System.out.println("Cạnh nhỏ nhất = " + min);
        scanner.close();
    }
}
