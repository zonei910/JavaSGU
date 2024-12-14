package BaiTapChuong4;

import java.util.Scanner;

class Diem{
    private int x;
    private int y;
    
    public Diem(){
        x = 0;
        y = 0;
    }
    
    public Diem(int x , int y){
        this.x =x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    
    
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        x = sc.nextInt();
        System.out.print("Nhap y: ");
        y = sc.nextInt();  
    }
    
    public void xuat(){
        System.out.println("Diem x: "+x+" Diem y: "+y);
    }
};



class Mau extends Diem{
    private int mau;
    
    public Mau(){
        super();
        mau = 0;
    }
    public Mau(int x , int y , int mau){
        super(x,y);
        this.mau = mau;
    }
    
    public int getMau(){
        return this.mau;
    }
    public void setMau(int mau){
        this.mau = mau;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap mau: ");
        mau = sc.nextInt();              
    }
    
    public void xuat(){
        super.xuat();
        System.out.println("Mau: "+mau);
    }  
};

class DoanThang{
    private Mau mau1;
    private Mau mau2;
    
    public DoanThang(){
        mau1 = new Mau();
        mau2 = new Mau();
    }
    public DoanThang(Mau mau1 , Mau mau2){
        this.mau1 = mau1;
        this.mau2 = mau2;    
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        Mau a = new Mau();
        Mau b = new Mau();
        System.out.println("Nhap diem thu 1: ");
        a.nhap();
        mau1 = a;
        System.out.println("Nhap diem thu 2: ");
        b.nhap();
        mau2 = b;
    }
    
    public void xuat(){
        System.out.println("Mau thu 1:");
        mau1.xuat();
        System.out.println("Mau thu 2:");
        mau2.xuat();
    }
    
    public double khoangcach(){
        return Math.sqrt(Math.pow(mau2.getX()-mau1.getX(),2)+ Math.pow(mau2.getY()-mau1.getY(),2));   
    }
    
    public boolean checkmau(){
        if(mau1.getMau() == mau2.getMau()) return true;
        else return false;
    }
    
};


public class Bai2 {
    public static void main(String[] args){
    DoanThang a = new DoanThang();
    a.nhap();
        System.out.println("");
        System.out.println("");
    a.xuat();
    
        System.out.println("Khoang cach cua 2 mau trong lop la: "+a.khoangcach());
       
        if(a.checkmau() == true)
            System.out.println("2 mau cua doi tuong giong nhau");
        else 
            System.out.println("2 mau cua doi tuong khong giong nhau");
        
    }
}
