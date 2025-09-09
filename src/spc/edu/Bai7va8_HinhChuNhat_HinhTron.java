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
public class Bai7va8_HinhChuNhat_HinhTron {
    public static void main(String[] args) {
        System.out.println("tinh dien tich cv hinh chu nhat va hinh tron");
        Scanner nhap = new Scanner(System.in);
        
        /*Hình Tròn*/
        System.out.println("nhap ban kinh hinh tron r: ");
        double r = nhap.nextDouble();
        double chuvihinhtron = 2 * Math.PI * r;
        double dientichhinhtron = 2 * Math.PI * r * r;
        System.out.println("hinh tron");
        System.out.println("chu vi = " + chuvihinhtron);
        System.out.println("dien tich = " + dientichhinhtron);
        
        /*hinh nhật*/
        System.out.println("nhap chieu dai hinh chu nhat = ");
        double dai = nhap.nextDouble();
        System.out.println("nhap chieu rong hinh chu nhat = ");
        double rong = nhap.nextDouble();
        double cvhinhchunhat = 2 * (dai + rong);
        double dientichhinhchunhat = dai * rong;
         System.out.println("hinh chu nhat");
        System.out.println("chu vi = " + cvhinhchunhat);
        System.out.println("dien tich = " + dientichhinhchunhat);
              
    }
}
