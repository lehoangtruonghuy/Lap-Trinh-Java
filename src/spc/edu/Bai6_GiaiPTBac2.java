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
public class Bai6_GiaiPTBac2 {
      public static void main(String[] args) {
        System.out.println("giai PT bac 2");
        Scanner nhap = new Scanner(System.in);
        double a, b, c, x1, x2, delta;
        
         System.out.println("Nhap he so a: ");
         a = nhap.nextDouble();
         System.out.println("Nhap he so b: ");
         b = nhap.nextDouble();
         System.out.println("Nhap he so c: ");
         c = nhap.nextDouble();
         
          if (a == 0) { // Giải phương trình bậc 1: bx + c = 0
            if (b == 0) {
                if (c != 0) {
            
                    System.out.println("phuong trinh vo nghiem");         
                       }
            else {
                    System.out.println("Phuong trinh co vo so nghiem");
            }
        } else {
            x1 = x2 = -c / b;
                     System.out.println("Phuong trinh co nghiem x = " + x1);
                        }
    } else {
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        }
        else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("\"Phuong trinh co nghiem kep x1 = x2 = \" << x1");
               }
        else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet"); 
               System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
       }
        }

        nhap.close();
    }
}
    
