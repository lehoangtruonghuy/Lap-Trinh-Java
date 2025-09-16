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
public class Bai18_TongSoChanLe {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so bat dau: ");
        int soBatDau = scanner.nextInt();
        
        System.out.print("Nhap so ket thuc: ");
        int soKetThuc = scanner.nextInt();
        
        long tongChan = 0;
        long tongLe = 0;
        
        for (int i = soBatDau; i <= soKetThuc; i++) {
            if (i % 2 == 0) {
                tongChan += i;
            } else {
                tongLe += i;
            }
        }
        
        System.out.println("Tong cac so chan la: " + tongChan);
        System.out.println("Tong cac so le la: " + tongLe);
        
        scanner.close();
    }
} 
