
package BaiTapChuong3;

import java.util.Scanner;

class Diem{
    private float x;
    private float y;
    
    //Ham tao binh thuong
    public Diem(){
        this.x = 0;
        this.y = 0;
    }
   //Ham tao co tham so 
   public Diem(float x , float y){
        this.x = x ;
        this.y = y;
    }
    //Ham tao doi tuong copy doi tuong khac
   public Diem(Diem mm){
       this.x = mm.x ;
       this.y = mm.y;
   }
   
   //Get
    public float getDiemx(){
        return this.x;
    }
    
    public float getDiemy(){
        return this.y;
    }
    
    //Set
    public void setDiem(float x , float y){
        this.x = x;
        this.y = y;
    }        
   //Nhap bang Scanner 
    public void nhapDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem x: "); 
        this.x = sc.nextFloat();
        System.out.print("Nhap diem y: ");
        this.y = sc.nextFloat();
    }
   
    
    public void xuatDiem(){
        System.out.println("Toa do diem x: "+this.x + "\n" + "Toa do diem y: " +this.y);
                
    }
    
    //method chu yeu
    public void diChuyenDiem(float x , float y){
        this.x = this.x + x;
        this.y = this.y + y;
    }
    
}


public class Bai1 {
    public static void main(String[] args){
        Diem a = new Diem();
        a.nhapDiem();
        a.diChuyenDiem(10, 10);
        a.xuatDiem();
        
        a.setDiem(100,100);
        System.out.println(a.getDiemx());
        System.out.println(a.getDiemy());
    }
}
