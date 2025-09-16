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
public class Bai16_GiaiThua {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Moi ban nhap mot so nguyen duong: ");
        int so = scanner.nextInt();
        
        long giaiThua = 1;
        
        if (so < 0) {
            System.out.println("Giai thua chi duoc tinh cho so khong am.");
        } else {
            for (int i = 1; i <= so; i++) {
                giaiThua *= i;
            }
            System.out.println("Giai thua cua " + so + " la: " + giaiThua);
        }
        
        scanner.close();
    }
}