
package BaiTapChuong3;

import java.util.Scanner;

class HinhTron{
    private float r;
    public HinhTron(){
        this.r = 100;
    }
    
    public HinhTron(float r){
        this.r = r;
    }
    
    public HinhTron(HinhTron mm){
        this.r = mm.r;
    }
    
    public void setR(float r){
        this.r = r;
    }
    
    public float getR(){
        return this.r;
    }
    
    public float DienTich(){
        return (float) (3.14*this.r*this.r);
    }
    
    public float ChuVi(){
        return (float) (2*3.14*this.r);
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        this.r = sc.nextFloat();
    }
    
    public void xuat(){
        System.out.println(this.r);
        System.out.println(DienTich() + " " + ChuVi());
    }
    
}



public class Bai3 {
    public static void main(String[] args) {
        HinhTron a = new HinhTron(10);
        
        a.xuat();
        
    }
}
