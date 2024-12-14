/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapChuong2;

import java.util.Scanner;

/**
 *
 * @author 14038
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0) System.out.println("Nam khong hop le");
        else{
        if(n%400==0 || (n%4==0 && n%100!=0))
            System.out.println("Nam Nhuan");
            else
            System.out.println("Khong la nam nhuan");
                }
    }
}
