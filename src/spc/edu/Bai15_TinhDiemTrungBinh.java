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
public class Bai15_TinhDiemTrungBinh {
    public static void main(String[] args) {
        int diem;
        int somonhoc = 0;
        double tongdiem = 0;
        
        Scanner Scanner = new Scanner (System.in);
        while (true){
        System.out.printf("Nhap Diem Mon %d: ", somonhoc);
                diem = Scanner.nextInt();
                
                if(diem == -1) {
                    break;
                }
                if((diem <=0 || diem >=10)){
                    System.out.println("Diem Phai Nhap Tu 0 Den 10");
                continue;
            }
                somonhoc++;
                tongdiem += diem;
    }
        double diemtrungbinh = tongdiem/somonhoc;
        System.out.printf("Ban Da Hoc %d Mon Hoc, Diem Trung Binh La: %f\n", somonhoc, diemtrungbinh);
    }
}


