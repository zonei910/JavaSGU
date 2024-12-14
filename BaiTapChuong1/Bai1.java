
package BaiTapChuong1;


import java.util.Scanner;

public class Bai1{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
    char[] chuoi1 = {'d','e','c','a',
'f','f','e','i','n','a','t','e','d'};
char[] chuoi2 = new char[7];
System.arraycopy(chuoi1,2,chuoi2,0,7);
System.out.println(chuoi2); 
     }
      
      
    
}