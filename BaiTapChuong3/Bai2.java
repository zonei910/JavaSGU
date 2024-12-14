


package BaiTapChuong3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class HinhChuNhat{
    private float dai;
    private float rong;
    
    public HinhChuNhat(){
        this.dai = 0;
        this.rong= 0;
    }
    
    public HinhChuNhat(float dai , float rong){
        this.dai = dai;
        this.rong = rong;
    }
    
    public HinhChuNhat(HinhChuNhat mm){
        this.dai = mm.dai;
        this.rong = mm.rong;
    }
    
    public float getDai(){
        return this.dai;
    }
    
    public float getRong(){
        return this.rong;
    }
    
    public void setDaiRong(float dai , float rong){
        this.dai = dai;
        this.rong = rong;
    } 
    
    public void nhapHinhChuNhat(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        this.dai = sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        this.rong = sc.nextFloat();
    }
    
    public void xuatHinhChuNhat(){
        System.out.println(this.dai + " " + this.rong);
        System.out.println(DienTich() + " " + ChuVi());
    }
    
    public float DienTich(){
        return this.dai * this.rong;
    }
    
    public float ChuVi(){
        return (this.dai+this.rong)*2;
    }
            
}






public class Bai2 {
    public static void main(String[] args){
       HinhChuNhat a = new HinhChuNhat();
       a.nhapHinhChuNhat();
       a.xuatHinhChuNhat();
        System.out.println("Dien tich: " + a.DienTich());
        System.out.println("Chu vi: "+ a.ChuVi());
        
      a.setDaiRong(10, 10);
      System.out.println(a.getDai() + " " + a.getRong());
      System.out.println("Dien tich: " + a.DienTich());
      System.out.println("Chu vi: "+ a.ChuVi());
        
       
        
    }
    
}
