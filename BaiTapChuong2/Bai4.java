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
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c , n;
        do{
        System.out.println("Menu");
        System.out.println("1.Cau a");
        System.out.println("2.Cau b");
        System.out.println("3.Cau c");
        System.out.println("4.Cau d");
        System.out.println("5.Cau e");
      
        System.out.print("Nhap cau can lam: ");
        c= sc.nextInt();
        System.out.print("Nhap n: ");
        n=  sc.nextInt();
        
        switch(c){
            case 1:
                 int s=0;
        for(int i=0;i<=n;i++){
               s=s+i;
               System.out.print(i+" ");
        }
         System.out.println();
         System.out.println(s);
         System.out.println();
         break;
         
         
         
         
            case 2:
         s=0;
        for(int i=0;i<=n;i++)
            if(i%2==0){
             s=s+i;
                System.out.print(i +" ");
            }
        System.out.println();
        System.out.println(s);
        System.out.println();
        break;
        
        
        
        
            case 3:
        s=0;
         for(int i=0;i<=n;i++)
            if(i%2!=0){
             s=s+i;
                System.out.print(i +" ");
            }
        System.out.println();
        System.out.println(s);
        System.out.println();
        break;
        
        
        
        
        
            case 4:
        s=0;
         for(int i=0;i<=n;i++){
             int co=0;
             if(i<2) continue;
             else{
                 for(int j=2;j<i;j++)
                     if(i%j==0) co=1;
                if(co==1) continue;
                 s=s+i;
                 System.out.print(i+" ");
             }
         }    
        System.out.println();
        System.out.println(s);
        System.out.println();
        break;
        
        
        
        
        
            case 5:
        s=2;
        while(n!=0){
           int co = 0;
            for(int i=2;i<s;i++)
                if(s%i==0) co=1;
            if(co==1){
                s++;
                continue;
            }
            System.out.print(s+" ");
            s++;
            n--;
        }    
        break;
        
        
            default: System.out.println("Khong hop le");
       
    }
            System.out.println("Muon tiep tuc [y/n]: ");
            
        }while(true);
}
}
