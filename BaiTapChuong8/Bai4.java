
import java.util.Scanner;
import java.util.ArrayList;
abstract class CaSy{
    protected String name;
    protected int year;
    protected int sold;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten ca sy: ");
        name = sc.nextLine();
        System.out.print("Nhap so nam lam viec: ");
        year = sc.nextInt();
        System.out.print("Nhap so dia da ban: ");
        sold = sc.nextInt();
    }
    public abstract int getLuong();

    public String getName(){
        return name;
    }
}

class CaSyhot extends CaSy{
    private int show;


    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap game show da tham gia: ");
        show = sc.nextInt();
    }

    public int getLuong(){
        return 5000000 + 500000 * year + 1200 * sold + 500000 * show;
    }


}

class CaSycold extends CaSy{
    public int getLuong(){
        return 3000000 + 500000 * year + 1000 * sold;
    }

    public void nhap(){
        super.nhap();
    }
}

class CongTy{
    private ArrayList<CaSy> dscs;
    public CongTy(){
        dscs = new ArrayList<CaSy>();
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ca sy vao cong ty");
        System.out.println("1. Ngoi sao noi tieng");
        System.out.println("2. Chu be dan");
        System.out.print("Lua chon cua ban: ");
        int chon = sc.nextInt();
        CaSy a;

        switch(chon){
            case 1:
                a = new CaSyhot();
                a.nhap();
                dscs.add(a);
                break;
            case 2:
                a =  new CaSycold();
                dscs.add(a);
                break;
            default:
                System.out.println("Nhap sai");
                break;
        } 
    }

    public ArrayList<CaSy> getDS(){
        return dscs;
    }

    public CaSy maxLuong(){
        int max = getDS().get(0).getLuong();
        int vitrimax = 0;
        for(int i = 0 ; i<getDS().size() ; i++)
            if(getDS().get(i).getLuong() > max){
                max = getDS().get(i).getLuong();
                vitrimax = i;
            }
        return getDS().get(vitrimax);
    }
}


public class Bai4 {
    public static void main(String [] args){
        CongTy a = new CongTy();

        a.nhap();
        a.nhap();
        System.out.println("Ca sy luong cao nhat: "+a.maxLuong().getName());


    }
}
