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
public class Bai10_menu {
      public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
              int chon;
              
              do {
                  // In menu
                  System.out.println("MENU");
                  System.out.println("1. Bai tap 1");
                  System.out.println("2. Bai tap 2");
                  System.out.println("3. Bai tap 3");
                  System.out.println("4. Thoat");
                  System.out.print("Moi ban chon: ");
                  chon = sc.nextInt();
                  
                  switch (chon) {
                      case 1 -> System.out.println("Ban da chon Bai tap 1");
                      case 2 -> System.out.println("Ban da chon Bai tap 2");
                      case 3 -> System.out.println("Ban da chon Bai tap 3");
                      case 4 -> System.out.println("Tam biet!");
                      default -> System.out.println("Lua chon khong hop le!");
                  }
                  System.out.println();
              } while (chon != 4);
          }
    }
}

