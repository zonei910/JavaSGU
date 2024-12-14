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
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[10];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        int s=0;
        for(int i: a){
            s=s+i;
            System.out.print(i+" ");
        }
         System.out.println();
        System.out.print(s+"\n");
       
        
        s=0;
        for(int i: a){
            if(i%2==0)
            {
                System.out.print(i+" ");
                s=s+i;
            }
        }
        System.out.println();
        System.out.print(s+"\n");
       
        
         s=0;
        for(int i: a){
            if(i%2!=0)
            {
                System.out.print(i+" ");
                s=s+i;
            }
        }
        System.out.println();
        System.out.print(s+"\n");
       
        
        s=0;
        int co;
        for(int i : a){
            co=0;
            if(i<2) continue;
            for(int j=2;j<i;j++)
                if(i%j==0) 
                co=1;
            if(co==1) continue;
            
            System.out.print(i+" ");
            s=s+i;   
        }
        System.out.println();
        System.out.print(s+"\n");
        
        
        
        int k , x;
        System.out.println("Nhap k: ");
       do{
           k=sc.nextInt();
           if(k>n || k<=0) System.out.println("Nhap lai k: ");
       }while(k>n || k<=0);
            System.out.println("Nhap x: ");
            x = sc.nextInt();     
            for(int i=n ; i>=k;i--)
           a[i] = a[i-1];
        n++; //Không được dùng như vậy nhé dùng 1 mảng b => int b = new int[n+1] , b = Array.copyof(a,n);
        //Dùng mảng động đã học rùi nhé
        a[k] = x;
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        
        
            System.out.println("Nhap k: ");
        do{
            k=sc.nextInt();
            if(k>n || k<=0) System.out.println("Nhap lai k: ");
        }while(k>n || k<=0);
        for(int i=k-1;i<n-1;i++)
            a[i]=a[i+1];
        n--;
        
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        
        System.out.print("Nhap x: ");
        x=sc.nextInt();
        for(int i=0 ; i<n;i++)
        if(a[i]==x){
            System.out.println(i);
            break;
        }
        
        
}
}
