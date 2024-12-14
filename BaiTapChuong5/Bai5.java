package BaiTapChuong5;

import java.util.Scanner;




abstract class HinhHoc{
    public abstract float tinhdientich();
    public abstract float tinhchuvi();
    public abstract void nhap();
    public abstract void xuat(); 
}

class HinhTron extends HinhHoc{
    private float r;
    
    public HinhTron(){
        r = 0;
    }
    
    public HinhTron(float r){
        this.r = r;
    }
    
    public void setR(float r){
       this.r = r;
    }
    
    public float getR(){
        return r;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        r = sc.nextFloat();
    }
    
    public float tinhdientich(){
        return (float) (3.14 * r * r);
    }
    
    public float tinhchuvi(){
        return (float)(2*3.14*r);
    }
    
    public void xuat(){
        System.out.println("Ban kinh hinh tron: " + r);
        System.out.println("Dien tich hinh tron: "+tinhdientich());
        System.out.println("Chu vi hinh tron: "+tinhchuvi());
    }
    
}


class HinhChuNhat extends HinhHoc{
    private float dai;
    private float rong;
    
    public HinhChuNhat(){
        dai = 0;
        rong =0;
    }
    
    public HinhChuNhat(float dai , float rong){
        this.dai = dai;
        this.rong = rong;
    }
    
    public void nhap(){
        
    }
    
    public float tinhdientich(){
        return dai * rong;
    }
    
    public float tinhchuvi(){
        return (dai+rong)*2;
    }
    
    public void xuat(){
        System.out.println("Chieu dai: "+dai+" Chieu rong: "+rong);
        System.out.println("Dien tich hinh chu nhat: "+tinhdientich());
        System.out.println("Chu vi hinh chu nhat: "+tinhchuvi());
    }
    
}








public class Bai5 {
    public static void main(String[] args){
        HinhHoc a[] = new HinhHoc[2];
        a[0] = new HinhTron(2);
        a[0].xuat();
        System.out.println("");
        a[1] = new HinhChuNhat(1,2);
        a[1].xuat();       
    }
}
