/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Administrator
 */
public class Bai17_Fibonacci {
       public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));  
        System.out.println("dãy số fibonacci");
        int nhap = 100;
        int so1 = 1,so2 = 1, soketiep;
        System.out.printf("%d %d", so1, so2);
        while (true){
            soketiep = so1 + so2;
            if(soketiep > nhap) break;
            System.out.printf("%d",soketiep);
            so1 = so2;
            so2 = soketiep;
        }
    }
  
}
