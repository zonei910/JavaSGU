



package BaiTapChuong3;

class SinhVien{
    private String MaSV;
    private String HoTen;
    private String Lop;
    private float Diemmon1;
    private float Diemmon2;
    private float Diemmon3;
    public SinhVien(){
        this.MaSV = "";
        this.HoTen = "";
        this.Lop = "";
        this.Diemmon1 = 0;
        this.Diemmon2 = 0;
        this.Diemmon3 = 0;    
    }
    
    
    
     public SinhVien(String ma , String ten , String lop , float diem1 , float diem2, float diem3){
        this.MaSV = ma;
        this.HoTen = ten;
        this.Lop = lop;
        this.Diemmon1 = diem1;
        this.Diemmon2 = diem2;
        this.Diemmon3 = diem3;    
    }
     
     public SinhVien(SinhVien mm){
        this.MaSV = mm.MaSV;
        this.HoTen = mm.HoTen;
        this.Lop = mm.Lop;
        this.Diemmon1 = mm.Diemmon1;
        this.Diemmon2 = mm.Diemmon2;
        this.Diemmon3 = mm.Diemmon3;    
    }
    
    public void setSinhVien(String ma , String ten , String lop , float diem1 , float diem2, float diem3){
        this.MaSV = ma;
        this.HoTen = ten;
        this.Lop = lop;
        this.Diemmon1 = diem1;
        this.Diemmon2 = diem2;
        this.Diemmon3 = diem3;    
    }
    
    
    public String getMaSV(){
        return this.MaSV;
    }
    
    public String getHoTen(){
        return this.HoTen;
    }
    
    public String getLop(){
        return this.Lop;
    }
    
    public float getDiem1(){
        return this.Diemmon1;
    }
    
     public float getDiem2(){
        return this.Diemmon2;
    }
      public float getDiem3(){
        return this.Diemmon3;
    }
    
    public float DiemTrungBinh(){
        return (float)(this.Diemmon1 + this.Diemmon2 + this.Diemmon3)/3;
    }
    
    @Override
    public String toString(){
       return (this.HoTen +" " + this.MaSV +" " + this.Lop + " " +this.Diemmon1 +" "+this.Diemmon2 +" "+this.Diemmon3);
        
    }
    
    
    public void XepLoai(){
        float s = DiemTrungBinh();
        
        if(s>=8) System.out.println("Gioi");
        else if(s>=7) System.out.println("Kha");
        else if(s>=5) System.out.println("Trung Binh");
        else System.out.println("Yeu");
        
    }
    
    
    
    
    
    
}


public class Bai4 {
    public static void main(String[] args) {
        SinhVien a = new SinhVien("123" , "Hao" , "DCT" , 1 , 1 , 1);
        
        System.out.println(a);
    }
}
