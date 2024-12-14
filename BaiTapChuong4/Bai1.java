package BaiTapChuong4;

import java.util.Scanner;

class NoiSinh{
    private String Phuong;
    private String Quan;
    private String TinhThanh;
    
    public NoiSinh(){
        Phuong = "";
        Quan = "";
        TinhThanh ="";
    }
    
    public NoiSinh(String phuong , String quan , String tinhthanh){
        this.Phuong = phuong;
        this.Quan = quan;
        this.TinhThanh = tinhthanh;
    }
    
    public String getPhuong(){
        return this.Phuong;
    }
    public void setPhuong(String phuong){
        this.Phuong = phuong;
    }
    
    
    public String getQuan(){
        return this.Quan;
    }
     public void setQuan(String quan){
        this.Quan = quan;
    }
     
     
    public String getTinhThanh(){
        return this.TinhThanh;
    }
    public void setTinhThanh(String tinhthanh){
        this.TinhThanh = tinhthanh;
    }
    
   //Muốn ok hơn thì làm hàm check nhập vào nhé 
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        String phuong,quan,tinhthanh;
               
            System.out.println("Nhap Phuong: ");
            phuong = sc.nextLine();
            System.out.println("Nhap Quan: ");
            quan = sc.nextLine();
            System.out.println("Nhap Tinh Thanh: ");
            tinhthanh = sc.nextLine();
            
            this.Phuong = phuong; 
            this.Quan = quan;
            this.TinhThanh = tinhthanh;
    }
    
    public void xuat(){
        System.out.println("Thanh nien nay sinh o phuong "+this.Phuong+" quan "+this.Quan+" thanh pho "+this.TinhThanh);
    }
    
    public String toString(){
        return "Thanh nien nay sinh o phuong "+this.Phuong+" quan "+this.Quan+" thanh pho "+this.TinhThanh;
    }
};





class Nguoi{
    private NoiSinh ns;
    private String CCCD;
    private String Name;
    private String DiaChi;
    
    public Nguoi(String cccd , String name , String diachi,NoiSinh m){
        this.ns = m;
        this.CCCD = cccd;
        this.Name = name;
        this.DiaChi = diachi;
    }
     
    public Nguoi(){
        this.ns = new NoiSinh();
        this.CCCD = "";
        this.Name = "";
        this.DiaChi ="";
    }
    
    public String getCCCD(){
        return this.CCCD;
    }
    public void setCCCD(String CCCD){
        this.CCCD = CCCD;
    }
    
    public String getName(){
        return this.Name;
    }
     public void setName(String Name){
        this.Name = Name;
    }
    public String getDiaChi(){
        return this.DiaChi;
    }
     public void setDiaChi(String DiaChi){
        this.DiaChi = DiaChi;
    }
    
    public NoiSinh getNoiSinh(){
        return this.ns;
    }
     public void setNoiSinh(NoiSinh m){
        this.ns = m;
    } 
     
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        String cccd , name , diachi;
        NoiSinh m;
        m = new NoiSinh();
        
        System.out.println("Nhap CCCD: ");
        cccd = sc.nextLine();
        this.CCCD = cccd;
        System.out.println("Nhap Name: ");
        name = sc.nextLine();
        this.Name = name;
        System.out.println("Nhap Dia Chi: ");
        diachi = sc.nextLine();
        this.DiaChi = diachi;
        m.nhap();
        this.ns = m;    
    } 
     
    public void xuat(){
        System.out.println("Thanh nien nay co CCCD so "+this.CCCD+" ten "+this.Name+" dia chi "+this.DiaChi);
        this.ns.xuat();
    }    
};

class SinhVien extends Nguoi{
    private int MaSV;
    private String Classes;
    
    public SinhVien(){
        super();
        this.MaSV = 0;
        this.Classes = "";
    }
    
    public SinhVien(int MaSV , String Classes , String CCCD , String Name , String DiaChi , NoiSinh ns){
        super(CCCD , Name , DiaChi , ns);
        this.MaSV = MaSV;
        this.Classes = Classes;
    }
    
    public int getMaSV(){
        return this.MaSV;
    }
    public void setMaSV(int MaSV){
        this.MaSV = MaSV;
    }
    
        
    public String getClasses(){
        return this.Classes;
    }
    public void setClasses(String Class){
        this.Classes = Class;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap Ma Sinh Vien: ");
        this.MaSV = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap Lop: ");
        this.Classes = sc.nextLine();
        
    }
 
    public void xuat(){
        super.xuat();
        System.out.println("Thanh nien nay co ma sinh vien "+this.MaSV+" lop "+this.Classes);
    }
}









public class Bai1 {
    public static void main(String[] args) {
   SinhVien h = new SinhVien();
   h.nhap();
   h.xuat();
   
        
        
        
    }
}
