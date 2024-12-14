package BaiTapChuong6;

import java.util.Arrays;
import java.util.Scanner;

 abstract class  CanBo{
    private String ma;
    private String hoten;
    private int tuoi;
    private String diachi;
    
    public CanBo(){
        ma = "";
        hoten = "";
        tuoi = 0;
        diachi = "";
    }
    
    public CanBo(String ma , String hoten , int tuoi , String diachi){
        this.ma = ma;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.diachi = diachi;
    }
    
    public String getMa(){
        return ma;
    }
    public void setMa(String ma){
        this.ma = ma;
    }
    
    public String getHoten(){
        return hoten;
    }
    public void setHoten(String hoten){
        this.hoten = hoten;
    }
    
    public int getTuoi(){
        return tuoi;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    
    public String getDiachi(){
        return diachi;
    }
    public void setDiachi(String diachi){
        this.diachi = diachi;
    }  
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cac thong tin" );
        System.out.print("Nhap ma: ");
        ma = sc.nextLine();
        System.out.print("Nhap Ho va Ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diachi = sc.nextLine();
    }
    
    public void xuat(){
        System.out.println("Thong tin cua can bo: ");
        System.out.println("Ma: "+ma);
        System.out.println("Ho va ten: "+hoten);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("Dia chi: "+diachi);
    }    
};


class CongNhan extends CanBo{
    private int bac;
    
    public CongNhan(){
        super();
        bac = 0;
    }
    public CongNhan(String ma , String hoten , int tuoi , String diachi,int bac){
        super( ma ,  hoten ,  tuoi , diachi);
        this.bac = bac;
    }
    
    public int getBac(){
        return bac;
    }
    
    public void setBac(int bac){
        this.bac = bac;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap bac cua cong nhan: ");
        bac = sc.nextInt();
    }
    
    public void xuat(){
        super.xuat();
        System.out.println("Bac cua cong nhan: "+bac);
    }  
};



class KySu extends CanBo{
    private String chuyennganh;
    
    public KySu(){
        super();
        chuyennganh ="";
    }
    public KySu(String ma , String hoten , int tuoi , String diachi,String chuyennganh){
        super( ma ,  hoten ,  tuoi ,  diachi);
        this.chuyennganh = chuyennganh;
    }
    
    public String getChuyennganh(){
        return chuyennganh;
    }
    public void setChuyennganh(String chuyennganh){
        this.chuyennganh = chuyennganh;
    }
   
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap chuyen nganh cua ky su: ");
        chuyennganh = sc.nextLine();
    }
    
    public void xuat(){
        super.xuat();
        System.out.println("Chuyen nganh cua ky su: "+chuyennganh);
    }  
};

class NhanVien extends CanBo{
    private String congviec;
    
    public NhanVien(){
        super();
        congviec = "";
    }
    public NhanVien(String ma , String hoten , int tuoi , String diachi , String congviec){
         super( ma ,  hoten ,  tuoi ,  diachi);
         this.congviec = congviec;       
    }
    
    public String getCongviec(){
        return congviec;
    }
    public void setCongviec(String congviec){
        this.congviec = congviec;
    }
    
     public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap cong viec cua nhan vien: ");
        congviec = sc.nextLine();
    }
    
     public void xuat(){
         super.xuat();
         System.out.println("Cong viec cua nhan vien: "+congviec);
     }
    
};


class DSCB{
    private int n;
    private CanBo [] dscb;
    
    public DSCB(){
    n = 0;
    dscb = new CanBo[n];
}
    
    public DSCB(int n , CanBo [] dscb){
        this.n = n;
        this.dscb = dscb;
    }
    
    public void them(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon them can bo nao?");
        System.out.println("1. Cong nhan");
        System.out.println("2. Ky su");
        System.out.println("3. Nhan vien");
        System.out.print("Lua chon cua ban: ");
        int luachon = sc.nextInt();
        
        switch(luachon){
            case 1: 
                dscb = Arrays.copyOf(dscb , n+1);
                dscb[n] = new CongNhan();
                dscb[n].nhap();
                n++;
                  break;
            case 2:
                dscb = Arrays.copyOf(dscb , n+1);
                dscb[n] = new KySu();
                dscb[n].nhap();
                n++;
                break;
            case 3:
                dscb = Arrays.copyOf(dscb , n+1);
                dscb[n] = new NhanVien();
                dscb[n].nhap();
                n++;
            break;
            default: System.out.println("Nhap sai!!!");
        }   
    }
    
public void sua(String ma){
     Scanner sc = new Scanner(System.in);
    System.out.println("Ban muon sua gi");
    System.out.println("1. Ma");
    System.out.println("2. Ho va ten");
    System.out.println("3. Tuoi");
    System.out.println("4. Dia chi");
    System.out.println("5. Bac cua cong nhan");
    System.out.println("6. Chuyen nganh ky su");
    System.out.println("7. Cong viec cua nhan vien");
    System.out.print("Lua chon cua ban: ");
    int luachon = sc.nextInt();
    sc.nextLine();
    switch(luachon){
        case(1):
            System.out.println("Nhap ma moi: ");
            String mamoi = sc.nextLine();
            for(int i=0;i<n;i++){
                if(dscb[i].getMa().equals(ma))
                    dscb[i].setMa(mamoi);
            }
            break;
        case(2):
            System.out.print("Nhap ho ten moi: ");
            String hoten = sc.nextLine();
            for(int i=0;i<n;i++){
                if(dscb[i].getMa().equals(ma))
                    dscb[i].setHoten(hoten);
            }
            break;
        case(3):
            System.out.print("Nhap tuoi moi: ");
            int tuoi = sc.nextInt();
            for(int i=0;i<n;i++){
                if(dscb[i].getMa().equals(ma))
                    dscb[i].setTuoi(tuoi);
            }
            break;
        case(4):
            System.out.print("Nhap dia chi moi: ");
            String diachi = sc.nextLine();
            for(int i=0;i<n;i++){
                if(dscb[i].getMa().equals(ma))
                    dscb[i].setDiachi(diachi);
            }
            break;
        case(5):
            for(int i=0;i<n;i++){
                if(dscb[i].getMa().equals(ma)){
                    if(dscb[i] instanceof CongNhan){
                                   System.out.print("Nhap bac moi: ");
                                int bac = sc.nextInt();
                                  dscb[i].setBac(bac);
                    }
                    else System.out.println("Loi");
                }
            }
            break;
        case (6):
            
            for(int i=0;i<n;i++){
                if(dscb[i].getMa().equals(ma)){
                    if(dscb[i] instanceof KySu){
                     System.out.print("Nhap nganh moi: ");
                       String chuyennganh = sc.nextLine();   
                        dscb[i].setChuyennganh(chuyennganh);
                    }
                    else System.out.println("Can bo khong thuoc kieu the hien tuong ung");
                }
            }
            break;
        case (7):
            
            for(int i=0;i<n;i++){
                if(dscb[i].getMa().equals(ma)){
                    if(dscb[i] instanceof NhanVien){
                     System.out.print("Nhap cong viec moi: ");
                       String congviec = sc.nextLine();                  
                        dscb[i].setCongviec(congviec);
                    }
                    else System.out.println("Can bo khong thuoc kieu the hien tuong ung");
                }
            }
            break;
        default: System.out.println("Nhap lai!!!");
    }
        
}

   public void xoa(String ma){
    for(int i=0;i<n;i++)
        if(dscb[i].getMa().equals(ma))
            for(int j=i;j<n-1;j++)
               dscb[j] = dscb[j+1]; 
      dscb = Arrays.copyOf(dscb, n-1);
      n--;
   }
    
    public void timkiem(String hoten){
        for(int i=0;i<n;i++)
        if(dscb[i].getHoten().equals(hoten))
        {
            dscb[i].xuat();
            break;
        }
    }
   
   public void hienthi(){
       for(int i=0;i<n;i++)
           dscb[i].xuat();
   }  
};







public class Bai2 {
    public static void main(String[] args) {
       DSCB a = new DSCB();      
       a.them();
       a.them();
       a.sua("1");
       System.out.println("");
       System.out.println("");
       a.hienthi();
     
    }
}
