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
public class Bai9_SoNgayTrongThang {
    public static void main(String[] args) {
        System.err.println("chuong trinh tinh so ngay trong thang khi nhap thang");
        Scanner nhap = new Scanner(System.in);
        int thang;
        System.err.println("Nhap so thang(1-12):");
        thang = nhap.nextInt();
        if (thang < 1 || thang > 12) {
            System.out.println("Thang khong hop le. Vui long nhap thang trong khoang 1-12.");
        } else {
            int soNgay = 0;

          
            switch (thang) {
                case 1, 3, 5, 7, 8, 10, 12 -> soNgay = 31;
                case 4, 6, 9, 11 -> soNgay = 30;
                case 2 -> { 
                    System.out.print("Nhap nam: ");
                    int nam = nhap.nextInt();

                    // Kiểm tra năm nhuận
                    if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                        soNgay = 29; // Năm nhuận
                    } else {
                        soNgay = 28; // Năm không nhuận
                    }
                }
            }
            System.out.println("Thang " + thang + " co " + soNgay + " ngay.");
        }
    }
}
