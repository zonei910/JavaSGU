
import java.util.Scanner;
import java.util.ArrayList;
/*
Overriding và Overloading đều thể hiện tính đa hình trong OOP 
Overriding là đa hình động hay ghi đè hàm , dùng trong lớp con kế thừa lớp cha để ghi đè phương thức trùng tên , trùng kiểu dữ liệu (Trùng all) để thể hiện hành vi của lớp con đó
Overloading là đa hình tĩnh , dùng trong 1 lớp khi muốn dùng phương thức giống tên nhưng khác kiểu trả về , kiểu tham số để có thể phù hợp với nhiều đầu vào và đầu ra

overriding
class hihi{
    public void in(int a){
        cout<<"hihi";
    }

    public void in(double a){
        cout<<"huhu";
    }
=> khi gọi in() truyền vào double thì xuất ra huhu còn truyền int thì xuất hihi

}

    class Cha{
        public void keu(){
            cout<<"hihi"
        }
    }

    class Con extends Cha{
        public void keu(){
            cout<<"huhu";
        }
    }

    Con a = new Con()
    a.keu() => ra huhu
 */

/*

in ra Cat + meows
        Cat

 */
class Animal{
    public String name = "Animal";

    public Animal(){

    }

    public void makeSound(){
        System.out.println(name + "makes a sound.");
    }

}

class Cat extends Animal{
    public String name = "Cat";
    public Cat(){

    }
    public void makeSound(){
        System.out.println(name + " meows");
    }
}
//=> chỉ thể hiện được theo phương thức , biến thì vẫn theo bên trái nhéeeeeee


class Point{
    private int x,y;

    public Point(int x , int y){
        this.x = x ; this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }


}

class ScaledPoint extends Point{
    private int c;
    
    public ScaledPoint(int x , int y , int c){
        super(x,y); // Fix như này
        this.c = c;
    }
}


abstract class Shop{
    protected String tenGianHang;
    protected double dienTich;
    
    public Shop(){
        tenGianHang = "";
        dienTich = 0;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten gian hang: ");
        tenGianHang = sc.nextLine();
        System.out.print("Nhap dien tich gian hang: ");
        dienTich = sc.nextDouble();
        sc.nextLine();
    }

    public abstract double tinhTienThue();

}

class RegularShop extends Shop{
    private double hesophuthu;

    public RegularShop(){
        super();
        hesophuthu = 0;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap he so phu thu: ");
        hesophuthu = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public double tinhTienThue(){
        double tienThueTheoDienTich = 0;
        double phuPhiDichVu = 0;
        if(dienTich > 50){
            tienThueTheoDienTich = 5000;
        }else{
            tienThueTheoDienTich = 3000;
        }
        phuPhiDichVu = hesophuthu * tienThueTheoDienTich;
        return (double) tienThueTheoDienTich + phuPhiDichVu;
    }

}

class FoodShop extends Shop{
    private static double chiphiantoanTP = 2000;

    public FoodShop(){
        super();
    }

    public void nhapThongTin(){
        super.nhapThongTin();
    }

    public double tinhTienThue(){
        double tienThueTheoDienTich = 0;
        if(dienTich > 30){
            tienThueTheoDienTich = 8000;
        }else{
            tienThueTheoDienTich = 6000;
        }
        return (double) tienThueTheoDienTich + chiphiantoanTP;
    }


}


class ShopList{
    private ArrayList<Shop> dsshop;

    public ShopList(){
        dsshop = new ArrayList<Shop>(0);
    }

    public void themGianHang(){
        Scanner sc = new Scanner(System.in);
        int co = 0;
    do{
        System.out.println("Chon gian hang can them");
        System.out.println("1. RegularShop");
        System.out.println("2. FoodShop");
        System.out.print("Lua chon cua ban: ");
        int chon = sc.nextInt();
        sc.nextLine();
        
        switch(chon){
            case 1:
                RegularShop regularShop = new RegularShop();
                regularShop.nhapThongTin();
                co = 1;
                Shop newregularShop = (Shop) regularShop;
                dsshop.add(newregularShop);
                break;
            case 2:
                FoodShop foodShop = new FoodShop();
                foodShop.nhapThongTin();
                Shop newfoodShop = (Shop) foodShop;
                dsshop.add(newfoodShop);
                co = 1;
                break;
            default:
                System.out.println("Ban nhap sai vui long nhap lai");
                break;
        }
    }while(co == 0);
    }
    
    public void tinhTongTienThueTheoLoai(){
        double loairegular = 0;
        double loaifood = 0;
        for(int i = 0 ;i<dsshop.size();i++){
            if(dsshop.get(i) instanceof RegularShop){
                loairegular += dsshop.get(i).tinhTienThue();
            }else{
                loaifood += dsshop.get(i).tinhTienThue();
            }
        }

        System.out.println("Tong tien thue cua RegularShop: " + loairegular);
        System.out.println("Tong tien thue cua FoodShop: " + loaifood);

    }



}



public class De_3_4_5 {
    public static void main(String[] args) {
        ShopList a = new ShopList();

        a.themGianHang();
        a.themGianHang();
        a.themGianHang();
        a.tinhTongTienThueTheoLoai();

    }
}
