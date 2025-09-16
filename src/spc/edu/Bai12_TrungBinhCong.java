/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class Bai12_TrungBinhCong {

    public static void main(String[] args) {
        System.out.println("Tinh Trung Binh Cong: ");
        int tong = 0;
        int dem = 0;
        
        for (int i = 27; i <= 250; i++) {
            if (i % 4 == 0) {
                tong += i;
                dem++;
            }
        }
        
        double trungBinhCong = (double) tong / dem;
        
        System.out.println("Trung binh cong la: " + trungBinhCong);
    }
}

