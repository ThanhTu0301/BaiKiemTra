
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
public class Bai4_ChuViDuongTron {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Nhap ban kinh hinh tron: ");
        double r = sc.nextDouble();
        System.err.println("Chu vi duong tron co ban kinh " +  r + " la " + r * r * Math.PI);
    }      
}
