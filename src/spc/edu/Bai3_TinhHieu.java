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
public class Bai3_TinhHieu {
    public static void main(String[] args) {
        System.out.println("chuong trinh tinh hieu so 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = sc.nextInt();
        System.out.println("nhap so b");
        int b = sc.nextInt();
        int Hieu = a - b;
        System.out.println(a + " - " + b + " = " + Hieu );
        
         int Tich = a * b;
        System.out.println(a + " * " + b + " = " + Tich );
        
        double Thuong = (double) a / b;
         System.out.println(a + " / " + b + " = " + Thuong );
                
    }
  
}
