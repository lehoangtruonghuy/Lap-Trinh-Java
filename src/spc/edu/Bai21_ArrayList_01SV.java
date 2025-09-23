/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai21_ArrayList_01SV {
    public static void main(String[] args) {
         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
           System.out.println("chương trình nhập vào ArrayList: ");
           ArrayList<String> sinhvien = new ArrayList<>();
           Scanner nhap = new Scanner (System.in);
           while (true) {
               System.out.println("Nhập Tên Sinh Viên: ");
               String s = nhap.next();
                if ("0".equals(s)) break;
                sinhvien.add(s);
           }
           System.out.println("Danh Sách sinh Viên Là: " + sinhvien.toString());
           System.out.println("\n Tổng Số Có : " + sinhvien.size() + " Sinh Viên ");
    }
          
}
