/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai19_SoThocTrenBanCo {
   public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println(" tính không số trên bàn cờ  ");
        
        int soO ;
        System.out.println("nhập sô lương ô: ");
        Scanner nhap = new Scanner(System.in);
        soO = nhap.nextInt();
        System.out.println("tổng số thóc trên %d là %d\n",soO, tinhsothoc(soO));
        
    }
    public static long tínhothoc(int soO) {
        long tong=0;
        for (int i = 0; i <soO; i++){
          //2^i
          // tong += 2^i
          tong += Math.pow(2,1);
        }
        return tong;
    }
  
}