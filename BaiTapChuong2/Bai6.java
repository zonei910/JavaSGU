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
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        
        if((c>='a' && c<='z') ||(c>='A' && c<='Z')){
            if(c=='u' || c=='e' || c=='o' || c=='a' || c=='i' ||c=='U' || c=='E' || c=='O' || c=='A' || c=='I' )
                System.out.println("Nguyen am");
            else if(c!=' ')
                    System.out.println("Phu am");
        }else System.out.println("Khong phai ki tu chu~");
        
        
    }
}
