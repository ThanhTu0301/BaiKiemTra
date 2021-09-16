
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
public class Bai5_GiaiPhuongTrinhBac1 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap tham so a:");
        float a=sc.nextFloat();
        System.out.println("Nhap tham so b:");
        float b=sc.nextFloat();
        if (a == 0){    //nếu a==0 thì
            if (b == 0){    //nếu b==0 thì
            System.out.println("Phuong trinh y=ax+b vo so nghiem");
            }
            else{       //nếu không thì (nếu (b!=0) thì)
            System.out.println("Phuong trinh y=ax+b vo nghiem");
            }
        }
        else {      //nếu không thì (nếu (a!=0) thì)
            System.out.println("Phuong trinh y=ax+b có nghiem x la" + -b/a);
        }
    }
}
