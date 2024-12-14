
import java.util.Scanner;



interface IInOut{
    void input();
    void print();
}



class Vehicle{ 
    protected String reg_num;
    protected String brand;

    public Vehicle(){
        reg_num = "";
        brand = "";
    }

    public Vehicle(String reg_num , String brand){
        this.reg_num = reg_num;
        this.brand = brand;
    }

    public void setRegNum(String reg_num){
        this.reg_num = reg_num;
    }

    public String getRegNum(){
        return reg_num;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }



}

class Passenger_vehicle extends Vehicle{
    protected int max_pass;

    public Passenger_vehicle(){
        super();
        max_pass = 0;
    }
    public Passenger_vehicle(String reg_num , String brand , int max_pass){
        super( reg_num ,  brand);
        this.max_pass = max_pass;
    }

    public void setMaxPass(int max_pass){
        this.max_pass = max_pass;
    }
    public int getMaxPass(){
        return max_pass;
    }


}

class Car extends Passenger_vehicle implements IInOut{
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mau xe: ");
        reg_num = sc.nextLine();
        System.out.print("Nhap ten hang xe: ");
        brand = sc.nextLine();
        System.out.print("Nhap so luong hanh khach max: ");
        max_pass = sc.nextInt();
    }

    @Override
    public void print(){
        System.out.println("Ma xe: " + reg_num);
        System.out.println("Ten hang xe: " + brand);
        System.out.println("So luong hanh khach toi da: "+max_pass);
    }

}

class Bus extends Passenger_vehicle implements IInOut{
    private int number;

    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mau xe: ");
        reg_num = sc.nextLine();
        System.out.print("Nhap ten hang xe: ");
        brand = sc.nextLine();
        System.out.print("Nhap so luong hanh khach toi da: ");
        max_pass = sc.nextInt();
        System.out.print("Nhap ma so tuyen: ");
        number = sc.nextInt();
    }

    @Override
    public void print(){
        System.out.println("Ma xe: " + reg_num);
        System.out.println("Ten hang xe: " + brand);
        System.out.println("So luong hanh khach toi da: "+max_pass);
        System.out.println("Ma so tuyen: "+number);
    }


} 

class Truck extends Vehicle implements IInOut{
    private int max_load;

    public Truck(){
        super();
        max_load = 0;
    }

    public Truck(String reg_num , String brand , int max_load){
        super(reg_num , brand);
        this.max_load = max_load;
    }

    public void setMaxLoad(int max_load){
        this.max_load = max_load;
    }
    public  int getMaxLoad(){
        return max_load;  
    }

    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mau xe: ");
        reg_num = sc.nextLine();
        System.out.print("Nhap ten hang xe: ");
        brand = sc.nextLine();
        System.out.print("Nhap so kg hang hoa toi da: ");
        max_load = sc.nextInt();
    }

    @Override
    public void print(){
        System.out.println("Ma xe: " + reg_num);
        System.out.println("Ten hang xe: " + brand);
        System.out.println("So kg hang hoa toi da: "+max_load);
    }
}

class Motobike extends Vehicle implements IInOut{
    private int type;


    public Motobike(){
        super();
        type = 0;
    }

    public Motobike(String reg_num , String brand , int type){
        super(reg_num , brand);
        this.type = type;
    }

    public void setType(int type){
        this.type = type;
    }
    public int getType(){
        return type;
    }



    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mau xe: ");
        reg_num = sc.nextLine();
        System.out.print("Nhap ten hang xe: ");
        brand = sc.nextLine();
        System.out.print("Nhap loai xe: ");
        type = sc.nextInt();
    }

    @Override
    public void print(){
        System.out.println("Ma xe: " + reg_num);
        System.out.println("Ten hang xe: " + brand);
        System.out.println("Loai xe: "+type);
    }
}



public class Bai1 {
    public static void main(String[] args) {
       



    }
}
