

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


 interface Ixuat{
    void xuat();
};


 class TaiLieu implements Ixuat{
     private String ten;
    String getDungluong;
     
     public TaiLieu(String ten){
         this.ten = ten;
     }
     
     public String getTen(){
         return ten;
     }
     public void setTen(String ten){
         this.ten = ten;
     }
     
     public void xuat(){
         System.out.println("Ten cua tai lieu: "+ten);
     }  
 };





class Sach extends TaiLieu implements Ixuat{
    private String tacgia;
    private int sotrang;
    
    public Sach(String ten , String tacgia , int sotrang){
        super(ten);
        this.tacgia = tacgia;
        this.sotrang = sotrang;
    }
    
    public void xuat(){
        super.xuat();
        System.out.println("Ten tac gia cua sach: "+tacgia);
        System.out.println("So trang cua sach: "+sotrang);
    }
            
    public String getTacgia(){
        return tacgia;
    }
    public void setTacgia(String tacgia){
        this.tacgia = tacgia;
    }
    
    public int getSotrang(){
        return sotrang;
    }
    public void setSotrang(int sotrang){
        this.sotrang = sotrang;
    }
};


class Dia extends TaiLieu implements Ixuat{
    private int dungluong;
    
    public Dia(String ten , int dungluong){
        super(ten);
        this.dungluong = dungluong;
    }
    
    public void xuat(){
        super.xuat();
        System.out.println("Dung luong cua dia: "+dungluong);
    }
    
    public int getDungluong(){
        return dungluong;
    }
    
    public void setDungluong(int dungluong){
        this.dungluong = dungluong;
    }
    
};

class DSTaiLieu{
    private ArrayList<TaiLieu> dstl;
    
    public DSTaiLieu(){
        dstl = new ArrayList<>();
    }
    
    public DSTaiLieu(ArrayList<TaiLieu> dstl){
        this.dstl = dstl;
    }
    
    public ArrayList<TaiLieu> getList(){
        return dstl;
    }
    
    
    public void them(){
        Scanner sc = new Scanner(System.in);
        int co;
do{
        co = 0;
        System.out.println("Lua chon them");
        System.out.println("1. Sach");
        System.out.println("2. Dia");
        System.out.print("Lua chon cua ban: ");
        int chon = sc.nextInt();
        sc.nextLine();
        String ten , tacgia;
        int sotrang , dungluong ;
        switch(chon){
            case(1):
                System.out.print("Nhap ten tai lieu: ");
                 ten = sc.nextLine();
                System.out.print("Nhap ten tac gia: ");
                 tacgia = sc.nextLine();
                System.out.print("Nhap so trang: ");
                 sotrang = sc.nextInt();
                Sach sach = new Sach(ten,tacgia,sotrang);
                dstl.add(sach);
                break;
             case(2):
                System.out.print("Nhap ten tai lieu: ");
                 ten = sc.nextLine();
                System.out.print("Nhap dung luong: ");
                 dungluong = sc.nextInt();
                Dia dia = new Dia(ten , dungluong);
                dstl.add(dia);
                break;
             default:
                 co = 1;
        }
       
    }while(co == 1);
    
                    }
    
    
    public void sua(String ten){
        int co;
        String tenmoi , tacgiamoi;
        int sotrangmoi , dungluongmoi;
    do{
        co = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lua chon sua");
        System.out.println("1. Ten");
        System.out.println("2. Tac gia");
        System.out.println("3. So trang");
        System.out.println("4. Dung luong");
        System.out.print("Lua chon cua ban: ");
        int chon = sc.nextInt();
        sc.nextLine();
        switch(chon){
            case(1):
                for(int i=0;i<dstl.size();i++)
                    if(dstl.get(i).getTen().equals(ten)){
                        System.out.print("Nhap ten moi: ");
                        tenmoi = sc.nextLine();
                        dstl.get(i).setTen(tenmoi);
                    }
                break;
            case(2):
                for(int i=0;i<dstl.size();i++)
                    if(dstl.get(i).getTen().equals(ten)){
                        if(dstl.get(i) instanceof Sach){
                            System.out.println("Nhap ten tac gia moi: ");
                            tacgiamoi = sc.nextLine();
                            dstl.get(i).setTacgia(tacgiamoi);
                        }else{
                            System.out.println("Loi hien thi");
                            co=1;
                        }
                    }
                break;
            case(3):
                for(int i=0;i<dstl.size();i++)
                    if(dstl.get(i).getTen().equals(ten)){
                        if(dstl.get(i) instanceof Sach){
                            System.out.println("Nhap so trang moi: ");
                            sotrangmoi = sc.nextInt();
                            dstl.get(i).setSotrang(sotrangmoi);
                        }else{
                            System.out.println("Loi hien thi");
                            co=1;
                        }
                    }
                break;
            case(4):
                for(int i=0;i<dstl.size();i++)
                    if(dstl.get(i).getTen().equals(ten)){
                        if(dstl.get(i) instanceof Dia){
                            System.out.println("Nhap dung luong moi: ");
                            dungluongmoi = sc.nextInt();
                            dstl.get(i).setDungluong(dungluongmoi);
                        }else{
                            System.out.println("Loi hien thi");
                            co=1;
                        }
                    }
                break;
            
        }
        
    }while(co == 1);
    }
    
    public void xoa(String ten){
        dstl.remove(ten);    
    }
    
    
    public void timkiem(String ten){
        for(int i=0;i<dstl.size();i++)
            if(dstl.get(i).getTen().equals(ten))
                dstl.get(i).xuat();
    }
    
    
    public void xuatdanhsach(){
        for(int i=0;i<dstl.size();i++){
            dstl.get(i).xuat();
            System.out.println("");
        }
            
       
    }
    
    public void them(String [] argv){
        if(argv[0].equals("Sach")){
            Sach sach = new Sach( argv[1] , argv[2],Integer.parseInt(argv[3]));
            dstl.add(sach);
        }
        if(argv[0].equals("Dia")){
            Dia dia = new Dia(argv[1], Integer.parseInt(argv[2]));
            dstl.add(dia);
        }        
    }
    
    
    
    
};

class QuanLyTL{
    DSTaiLieu menuds = new DSTaiLieu();
  
    public void menu() throws IOException{
        Scanner sc = new Scanner(System.in);
        int co;
        String ten;
        do{
            co = 0;
            System.out.println("Lua chon chuc nang");
            System.out.println("1. Them");
            System.out.println("2. Sua");
            System.out.println("3. Xoa");
            System.out.println("4. Tim kiem");
            System.out.println("5. Xuat danh sach");
            System.out.println("6. Ghi du lieu vao danh sach");
            System.out.println("7. Ghi du lieu vao file text");
            System.out.println("8.Thoat");
            System.out.print("Lua chon cua ban: ");
            int chon = sc.nextInt();
            sc.nextLine();
          switch(chon){
              case(1):
                  menuds.them();
                  break;
              case(2):
                  System.out.print("Nhap ten muon sua: ");
                   ten = sc.nextLine();
                  menuds.sua(ten);
                  break;
               case(3):
                   System.out.print("Nhap ten muon xoa: ");
                  ten = sc.nextLine();
                  menuds.xoa(ten);
                  break;
                case(4):
                    System.out.print("Nhap ten muon tim: ");
                  ten = sc.nextLine();
                  menuds.timkiem(ten);
                  break;
                case(5):
                    menuds.xuatdanhsach();
                    break;
                case(6):    
                    File file = new File("\\C:\\Users\\14038\\Desktop\\input.txt\\");
                    Scanner fr = new Scanner(file);
                    while(fr.hasNext()){
                        String line = fr.nextLine();
                        String[] argv = line.split(",");   
                       menuds.them(argv);
                    }
                    
                    
                    fr.close();
                    break;
                
                 case(7):
                     FileWriter fw = new FileWriter("\\C:\\Users\\14038\\Desktop\\output.txt\\");
                     for(int i = 0 ; i<menuds.getList().size();i++){
                         if(menuds.getList().get(i) instanceof Sach){
                             Sach sach = (Sach)menuds.getList().get(i);
                             fw.write("Ten tai lieu: " + sach.getTen()+"\n");
                             fw.write("Ten tac gia: " + sach.getTacgia()+"\n");
                              fw.write("So trang: " + sach.getSotrang()+"\n");
                         }
                         if(menuds.getList().get(i) instanceof Dia){
                             Dia dia = (Dia)menuds.getList().get(i);
                             fw.write("Ten tai lieu: " +dia.getTen()+"\n");
                             fw.write("Dung luong: " + dia.getDungluong()+"\n");
                         }
                       
                     } 
                     fw.close();
                     break;
                                      
                case(8):
                    return;
                default: co = 1; 
                  
          }
            
            System.out.print("Ban co muon chon tiep: [1/0]");
            co = sc.nextInt();
        }while(co == 1);
    }
    
    
}





public class Bai1 {
    public static void main(String[] args) throws IOException {
        QuanLyTL a = new QuanLyTL();
        
        a.menu();
        a.menuds.xuatdanhsach();
        
   
        
        
    }
}

