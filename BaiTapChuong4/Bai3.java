package BaiTapChuong4;

import java.util.Scanner;

class TamGiac{
    private Diem dinh1;
    private Diem dinh2;
    private Diem dinh3;
    
    public TamGiac(){
        dinh1 = new Diem();
        dinh2 = new Diem();
        dinh3 = new Diem();
    }
    
    public TamGiac(Diem a , Diem b , Diem c){
        dinh1 = a;
        dinh2 = b;
        dinh3 = c;
    }
   public void nhap(){
       Scanner sc = new Scanner(System.in);
       int m;
       System.out.println("Nhap dinh 1:");
       System.out.print("x: ");
       m = sc.nextInt();
       dinh1.setX(m);
       System.out.print("y: ");
       m = sc.nextInt();
       dinh1.setY(m);
       
       System.out.println("Nhap dinh 2:");
       System.out.print("x: ");
       m = sc.nextInt();
       dinh2.setX(m);
       System.out.print("y: ");
       m = sc.nextInt();
       dinh2.setY(m);
       
       System.out.println("Nhap dinh 3:");
       System.out.print("x: ");
       m = sc.nextInt();
       dinh3.setX(m);
       System.out.print("y: ");
       m = sc.nextInt();
       dinh3.setY(m);
   }
    public Diem getDinh1(){
        return dinh1;
    }
    public void setDinh1(int x,int y){
        dinh1.setX(x);
        dinh1.setY(y);
    }
    public Diem getDinh2(){
        return dinh2;
    }
    public void setDinh2(int x,int y){
        dinh2.setX(x);
        dinh2.setY(y);
    }
    public Diem getDinh3(){
        return dinh3;
    }
    public void setDinh3(int x,int y){
        dinh3.setX(x);
        dinh3.setY(y);
    }
    
    
    public void xuat(){
        System.out.println("Diem 1: \n"+"x: "+dinh1.getX()+" y: "+dinh1.getY());
        System.out.println("Diem 2: \n"+"x: "+dinh2.getX()+" y: "+dinh2.getY());
        System.out.println("Diem 3: \n"+"x: "+dinh3.getX()+" y: "+dinh3.getY());
    }
    
   public double ChuVi(){
       double s;
       s = Math.sqrt(Math.pow(dinh2.getX()-dinh1.getX(),2) + Math.pow(dinh2.getY()-dinh1.getY(),2));
       s = s + Math.sqrt(Math.pow(dinh3.getX()-dinh2.getX(),2) + Math.pow(dinh3.getY()-dinh2.getY(),2));
       s = s + Math.sqrt(Math.pow(dinh1.getX()-dinh3.getX(),2) + Math.pow(dinh1.getY()-dinh3.getY(),2));
       
       return s;
   }
    
    
};





public class Bai3 {
   public static void main(String[] args){
       TamGiac a = new TamGiac();
       a.nhap();
       a.xuat();
       
       System.out.println(a.ChuVi());
       
   } 
}
