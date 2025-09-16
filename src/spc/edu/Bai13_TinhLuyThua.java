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
public class Bai13_TinhLuyThua {
    public static void main(String[] args) {
         Scanner nhap = new Scanner(System.in);
         
         System.out.println("nhap con so: ");
          int ConSo = nhap.nextInt();
           System.out.println( "nhap mu: ");
            int SoMu = nhap.nextInt();
            long ketqua = 1 ;
    for (int i = 0; i < SoMu; i++)
    {
       ketqua *= ConSo;
    }
        System.out.println(ConSo +"^" + SoMu + "=" + ketqua);
    }
    
}
