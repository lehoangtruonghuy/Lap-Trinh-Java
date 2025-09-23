/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai19_FindMaxInArray {
    public static void main(String[] args) {
Scanner nhap = new Scanner(System.in);

        int[] x = new int[10]; 
        System.out.println("Nhap 10 so nguyen:");
        for (int i = 0; i < x.length; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            x[i] = nhap.nextInt();
        }
        int max = x[0];
        int sum = x[0];
        int sumEven = (x[0] % 2 == 0) ? x[0] : 0; 
        int sumOdd = (x[0] % 2 != 0) ? x[0] : 0;  
        for (int i = 1; i < x.length; i++) {
            // tìm max
            if (x[i] > max) {
                max = x[i];
            }
            // tính tổng
            sum += x[i];

            // tính chẵn lẻ
            if (x[i] % 2 == 0) {
                sumEven += x[i];
            } else {
                sumOdd += x[i];
            }
        }
        System.out.println("Gia tri lon nhat la: " + max);
        System.out.println("Tong cac phan tu la: " + sum);
        System.out.println("Tong cac so chan la: " + sumEven);
        System.out.println("Tong cac so le la: " + sumOdd);
    }
}
