
import java.util.Scanner;
import java.util.ArrayList;

class Sap{
    private int DONGIA = 40000000;
    private int soThuTu;
    private int dienTich;
    protected int doanhThu;

    protected int tinhThueDoanhThu(){
        return 0;
    }
    protected  int tinhTienDichVu(){
        return 0;
    }
    private int tinhTienThueSap(){
        return DONGIA * dienTich;
    }
    public int tinhTienPhaiDong(){
        return tinhTienThueSap() + tinhThueDoanhThu();
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu tu: ");
        soThuTu = sc.nextInt();
        System.out.print("Nhap dien tich: ");
        dienTich = sc.nextInt(); 
        System.out.print("Nhap doanh thu: ");
        doanhThu = sc.nextInt();
    }

}

class SapThucPham extends Sap{
    private int tienDichVu;
    protected int tinhThueDoanhThu(){
        return 5;
    }

    protected int tinhTienDichVu(){
        return tienDichVu;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap tien dich vu: ");
        tienDichVu = sc.nextInt();
    }
}


class SapQuanAo extends Sap{
    protected int tinhThueDoanhThu(){
        return 10;
    }
}

class SapTrangSuc extends Sap{
    protected int tinhThueDoanhThu(){ 
        if(doanhThu < 100000000) return 20;
        else return 30;
    }
}

class Cho{
   public ArrayList<Sap> dssap ;
    public Cho(){
        dssap = new ArrayList<Sap>();
    }

    public ArrayList<Sap> getDS(){
        return dssap;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap sap muon them vao cho");
        System.out.println("1. Sap thuc pham");
        System.out.println("2. Sap quan ao");
        System.out.println("3. Sap trang suc");
        System.out.print("Lua chon cua ban: ");
        int chon = sc.nextInt();
        Sap a;
        switch(chon){
            case 1:
                a = new SapThucPham();
                a.nhap();
                dssap.add(a);
                break;
            case 2:
                a = new SapQuanAo();
                a.nhap();
                dssap.add(a);
                break;
            case 3:
                a = new SapTrangSuc();
                a.nhap();
                dssap.add(a);
                break;
            default:
                System.out.println("Nhap sai");
                break;
        }
    }

    public int tinhTongSoTien(){
        int s = 0;
        for(int i = 0 ; i <getDS().size();i++)
            s = s + getDS().get(i).tinhTienPhaiDong();
        return s;
    }


}



public class Bai3 {
    public static void main(String[] args) {
        Cho a = new Cho();
        a.nhap();
        a.nhap();
        a.nhap();

        System.out.println(a.tinhTongSoTien());
        
            
        

    }
}
