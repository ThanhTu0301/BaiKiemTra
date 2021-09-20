/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class UsenameandPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usename = "HuyHoang";
        String password = "2021";
        System.out.println("Nhap Usename: ");
        String Usename = sc.nextLine();
        System.out.println("Nhap Password: ");
        String Password = sc.nextLine();
        if((usename.equals(Usename)) && (password.equals(Password))){
            System.out.println("Nhap Dung(Usename,Password)");
        }else{
            System.out.println("Nhap Sai(Usename,Password");
        }
    }
}