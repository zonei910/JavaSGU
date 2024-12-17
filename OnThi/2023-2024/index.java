import java.util.Scanner;
import java.util.Arrays;

//Câu 1
/*
Interface:
-Là 1 lớp không thể tạo đối tượng
-Các phương thức trong interface mặc định là các phương thức trừu tượng
-Khi 1 lớp kế thừa giao diện thì lớp con này phải chứa tất cả các phương thức của interface gọi là ràng buộc

VD:
public interface IKeu{
    void keu();
}

public class cho implements Ikeu {
    bắt buộc phải có 


    public void keu(){
        //
    }
}


 */


//Câu 2
class Employee{
    private String name;
    private int id;
    public Employee(String name , int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

}

class Manager extends Employee{
    private String department;
    public Manager(String name , int id , String department){
        super(name,id);
        this.department = department;
        //=> vì name và id là private nên không thể this.id , this.name được nên sai cái này nhé
    }

    public String getDepartment(){
        return department;
    }


}
//Kết thúc câu 2

//Câu 3: kết quả xuất ra Print A "\n" Print B

class A{
    public void display(){
        System.out.println("Print A");
    }
}

class B extends A{
    public void display(){
        super.display();
        System.out.println("Print B");
    }
}

//Kết thúc câu 3


//Câu 4

class Video{
    private String title;
    private String classification;
    private int time;
    public Video(String fullTitle , String programClassification , int runningTime){
        title = fullTitle;
        classification = programClassification;
        time = runningTime;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getClassification(){
        return classification;
    }

    public void setClassification(String classification){
        this.classification = classification;
    }

    public String formatTime(){
        int gio;
        int phut;

        gio = time/60;
        phut = time%60;

        return gio + " gio " + phut +  " phut";

    }

    public void print(){
        System.out.println("Title: " + title);
        System.out.println("Classification: " + classification);
        System.out.println("Time: " + formatTime());
    }



}
//Kết thúc câu 4



//Câu 5
abstract class Member{
    protected String ten;
    protected int loai;
    protected String diaChi;

    public Member(){
        ten = "";
        loai = 0;
        diaChi = "";
    }

    public Member(String ten, int loai, String diaChi){
        this.ten = ten;
        this.loai = loai;
        this.diaChi = diaChi;
    }

    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap loai: ");
        this.loai = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
    }

    public void print(){
        System.out.println("Ten: "+ ten);
        System.out.println("Loai: " + loai);
        System.out.println("Dia chi: "+ diaChi);
    }

    public abstract int tinhPhi();
}

class StandardMember extends Member{
    public StandardMember(){
        super();
    }

    public StandardMember(String ten , int loai , String diaChi){
        super(ten,loai,diaChi);    
    }

    public int tinhPhi(){
        return 100000;
    }
}


class SeniorMember extends Member{
    public SeniorMember(){
        super();
    }
    public SeniorMember(String ten , int loai , String diaChi){
        super(ten,loai,diaChi);    
    }

    public int tinhPhi(){
        if(this.loai <= 2) return 200000;
        else return 400000;
    }

}

class MemberList{
    private int soLuongTV;
    private Member[] danhSachTV;
    public MemberList(){
        soLuongTV = 0;
        danhSachTV = new Member[0];
    }

    public void themTV(){
        Scanner sc = new Scanner(System.in);
        int co = 0;
        do{
            System.out.println("Ban muon them thanh vien nao ?");
            System.out.println("1. StandardMember");
            System.out.println("2. SeniorMember");
            System.out.print("Lua chon cua ban: ");
            int chon = sc.nextInt();
            sc.nextLine();
            switch(chon){
                case 1:
                    co = 1;
                    StandardMember a = new StandardMember();
                    a.nhapTT();    
                    danhSachTV = Arrays.copyOf(danhSachTV , danhSachTV.length + 1);
                    danhSachTV[danhSachTV.length - 1] = a;
                    break;
                case 2:
                    co = 1;
                    SeniorMember b = new SeniorMember();
                    b.nhapTT();    
                    danhSachTV = Arrays.copyOf(danhSachTV , danhSachTV.length + 1);
                    danhSachTV[danhSachTV.length - 1] = b;
                    break;

                default:
                    System.out.println("Vui long chon dung");
                    break;
            }


        }while(co == 0);
    }

    public void tinhTongPhi(){
        long s = 0L;
        for(int i = 0 ; i < danhSachTV.length ; i++){
            s = s + danhSachTV[i].tinhPhi();
        }
        System.out.println("Tong phi cua tat ca thanh vien la: " + s);
    }

    public void xuatDS(){
        for(int i = 0 ; i < danhSachTV.length ; i++){
            danhSachTV[i].print();
            System.out.println("");
        }
    }

}



public class index{
    public static void main(String [] args){
       MemberList a = new MemberList();
       a.themTV();
        a.themTV();
        a.xuatDS();
        a.tinhTongPhi();




    }
}