
package BaiTapChuong2;

import java.util.Scanner;


public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        
        
        System.out.print("Nhap chuoi: ");
       String s = sc.nextLine();
        System.out.println(s.length());
  
        
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        System.out.println(s);
        
        

   /*
        int d = 1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' ')
                d++;
        }
        
        System.out.println(d);
        String tmp[] = s.split(" ");
        for(String x : tmp)
            System.out.println(x);
        
        int k;
        System.out.print("Nhap k: ");
        k = sc.nextInt();
        String x ;
        x = s.substring(0,k);
        System.out.println(x + " " + x.length());
        x = s.substring(s.length() - k , s.length());
        System.out.println(x + " " + x.length());
        
        */
   
        System.out.print("Nhap k: ");
       int k = sc.nextInt();
        int n;
        System.out.print("Nhap n: ");
        n = sc.nextInt();
       int d = k-1;
        while(n!=0){
            d++;
            n--;
        }
      
        
      String  x = s.substring(k-1,d);
        System.out.println(x);
    }
}
