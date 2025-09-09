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
public class Bai5_HoTenVaTuoi {
    public static void main(String[] args) {
        System.out.println("chuong trinh nhap ho va ten, nam sinh de tinh tuoi");
        Scanner nhap = new Scanner(System.in);
        
        System.out.println("nhap ho va ten: ");
        String hoten = nhap.nextLine();
        System.out.println("nhap nam sinh: ");
        int nam = nhap.nextInt();
        
        int tuoi = 2025 - nam;
        
        System.out.printf("xin chao ban %s, ban nam nay duoc %d tuoi\n", hoten, tuoi);
    }
}
