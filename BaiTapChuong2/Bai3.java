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
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       if(n<2) System.out.println("No");
       else{
           for(int i=2;i<n;i++) 
               if(n%i==0){
                   System.out.println("No");
                   return;
               }
           System.out.println("Yes");
       }
       
        
    }
}
