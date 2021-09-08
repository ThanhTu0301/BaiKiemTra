
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Cong_Tru_Nhan_Chia {
      public static void main(String[] args) {
      /*  cộng: +
            trừ:  -
            nhân: *
            chia: /
            chia lấy dư: %
        */
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        System.err.println("Tong là:" + (a+b) + "\nHieu là:" + (a-b)  + "\nTich là:" + (a*b) + "\nThuong là:" + (a/b)  + "\nPhan Du là:" + (a%b) );        
    } 
}