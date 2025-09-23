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
public class Bai20_ArrayList_01 {
       public static void main(String[] args) {
       System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
           System.out.println("chương trình nhập vào ArrayList: ");
        ArrayList<String> s = new ArrayList<String>();

        s.add("Kẹt1");                   
        s.add("Kẹt2");    
        s.add("Kẹt3");    
        s.add("Kẹt4");                  
        s.add("Kẹt5");                 
        s.add("Kẹt6");                 
        s.remove(2);  
        s.remove("Kẹt5");
        for (int i = 0; i < s.size (); i++) {
        System.out.println(s.get(i));
    }
}
}