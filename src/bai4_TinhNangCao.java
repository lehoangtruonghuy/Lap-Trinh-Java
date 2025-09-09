
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class bai4_TinhNangCao {
    public static void main(String[] args) {
        System.out.println("tinh so mu");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
        double a = sc.nextDouble();
        System.out.println("nhap so mu");
        int n = sc.nextInt();
        
        double ketqua = Math.pow ( a, n );
        System.out.println(a + " ^ " + n + " = " + ketqua );
        
    }
}
