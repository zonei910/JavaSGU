package BaiTapChuong6;

import java.util.Arrays;
import java.util.Scanner;

class VanPhongPham{
    private String ma;
    private String ten;
    private int soluong;
    private int gia;
    
    public VanPhongPham(){
        ma = "";
        ten = "";
        soluong = 0;
        gia = 0;
    }
    
    public VanPhongPham(String ma , String ten , int soluong , int gia){
        this.ma = ma ;
        this.ten = ten;
        this.soluong = soluong;
        this.gia = gia;
    }
    
    public VanPhongPham(VanPhongPham a){
        this.ma = a.ma;
        this.ten = a.ten;
        this.soluong = a.soluong;
        this.gia = a.gia;   
    }
    
    public String getMa(){
        return ma;
    }
    public void setMa(String ma){
        this.ma = ma;
    }
    
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    
    public int getSoluong(){
        return soluong;
    }
    public void setSoluong(int soluong){
        this.soluong = soluong;
    }
    
    public int getGia(){
        return gia;
    }
    public void setGia(int gia){
        this.gia = gia;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cac thong tin vat pham");
        System.out.print("Nhap ma san pham trong van phong pham: ");
        ma = sc.nextLine();
        System.out.print("Nhap ten san pham trong van phong pham: ");
        ten = sc.nextLine();
        System.out.print("Nhap so luong hien co cua san pham trong van phong pham: ");
        soluong = sc.nextInt();
        System.out.print("Nhap gia ban san pham trong van phong pham: ");
        gia = sc.nextInt();
    }
    
    public void xuat(){
        System.out.println("San pham nay co: ");
        System.out.println("Ma: "+ma);
        System.out.println("Ten: "+ten);
        System.out.println("So luong hien co: "+soluong);
        System.out.println("Gia ban: "+gia);
    }  
};


class Tap extends VanPhongPham{
    private int sotrang;
    
    public Tap(){
        super();
        sotrang = 0;
    }
    
    public Tap(String ma , String ten , int soluong , int gia , int sotrang){
        super(ma,ten,soluong,gia);
        this.sotrang = sotrang;
    }
    
    public Tap(Tap a){
        super(a.getMa() , a.getTen() ,a.getSoluong() ,a.getGia());
        this.sotrang = a.sotrang;
    }
    
    public int getSotrang(){
        return sotrang;
    }
   public void setSotrang(int sotrang){
       this.sotrang = sotrang;
   }
        
@Override   public void nhap(){
       Scanner sc = new Scanner(System.in);
       super.nhap();
       System.out.print("Nhap so trang cho quyen vo nay: ");
       sotrang = sc.nextInt();
   }
    
   
  @Override  public void xuat(){
        super.xuat();
        System.out.println("So trang: "+sotrang);
        System.out.println("");
    }
};






 class But extends VanPhongPham{
    private String maumuc;
    
    public But(){
        super();
        maumuc = "";
    }
    
    public But(String ma , String ten , int soluong , int gia,String maumuc){
        super(ma,ten,soluong,gia);
        this.maumuc = maumuc;
    }
    
    public But(But a){
        super(a.getMa() , a.getTen() ,a.getSoluong() ,a.getGia());
        this.maumuc = a.maumuc;
    }
  
    public String getMaumuc(){
        return this.maumuc;
    }
    
    public void setMaumuc(String maumuc){
        this.maumuc = maumuc;
    }
  
@Override    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap mau muc: ");
        this.maumuc = sc.nextLine();
    }
    
@Override    public void xuat(){
        super.xuat();
        System.out.println("Mau muc: " + this.maumuc);     
    }
    
    
    
};






class DanhSachVanPhongPham{
    public int n; 
    private VanPhongPham [] dssp;
    
    public DanhSachVanPhongPham(){
        n = 0;
        dssp = new VanPhongPham[n];
    }
    
    public DanhSachVanPhongPham(int n ,int m,VanPhongPham [] ds ){
        this.n = n ; 
        dssp = ds;    
    }
  
    
    
    public void them(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Chon loai vat pham de them:");
        System.out.println("1. Tap");
        System.out.println("2. But");
          System.out.print("Nhap lua chon cua ban: ");
         int luachon = sc.nextInt();
          
        if(luachon == 1){
            dssp = Arrays.copyOf(dssp , n+1);
            dssp[n] = new Tap();
            dssp[n].nhap();
            n++;
        }
        if(luachon == 2){
            dssp = Arrays.copyOf(dssp ,n+1);
            dssp[n] = new But();
            dssp[n].nhap();
            n++;
        }      
    }

       public void xuat(){
           for(int i = 0 ; i<n ; i++)
               dssp[i].xuat();
       }
    
    public int getN(){
        return n;
    }
};



public class Bai1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachVanPhongPham a = new DanhSachVanPhongPham();
        a.them();
        a.them();
        System.out.println("");
        System.out.println("");
        a.xuat();
    }
}
