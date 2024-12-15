/*
Tính kế thừa trong lập trình huống đối tượng là : 
-Lớp con sỡ hữu toàn bộ các thuộc tính và phương thức của lớp cha.
-Ngoài ra lớp con còn có thể thêm các thuộc tính và phương thức mới.


Trong Java lớp con có thể kế thừa các thành phần private và constructor của lớp cha nhưng không thể gọi trực tiếp được:
-Muốn gọi các thành phần private của lớp cha thì phải sử dụng phương thức getter và setter của lớp cha.
-Muốn gọi constructor của lớp cha ta dùng từ khóa super()


Kỹ thuật overriding là kỹ thuật ghi đè , dùng trong khả năng đa hình của Java. Khi ta muốn một phương thức trong lớp con có cùng tên và tham số với phương thức của lớp cha nhưng thực hiện một chức năng khác nhau thì ta sử dụng kỹ thuật overriding.
Nếu 1 đối tượng được tạo ra ở lớp con nó sẽ ưu tiên sử dụng phương thức của lớp con nếu có phương thức trùng tên với lớp cha. Nếu lớp con không có phương thức trùng tên thì nó sẽ sử dụng phương thức của lớp cha.
Ví dụ: class DongVat{
    public void keu(){
        System.out.println("ihihi");
    }
}

    class Cho extends DongVat{
    @Override
        public void keu(){
        System.out.println("Gau Gau");
    }
    }
Thì lúc này nếu ta tạo Cho a = new Cho() thì a.keu() sẽ xuất ra Gau Gau mà không phải là ihihi

class DongVat{
    public void keu(){
        System.out.println("ihihi");
    }
}

    class Cho extends DongVat{
    
    }
Thì lúc này khi ta tao Cho a = new Cho() thì a.keu() sẽ xuất ra ihihi vì không có phương thức keu() trong lớp Cho.


 */

// Câu 2
// class Base{
//     public void Print(){
//         System.out.println("Base");
//     }
// }

// class Derived extends Base{
//     @Override
//     public void Print(){
//         System.out.println("Derived");
//     }
// }

/*Đa hình (Polymorphism): Khi bạn gọi DoPrint(z), z là một đối tượng của lớp Derived. Mặc dù z được truyền vào phương thức DoPrint với kiểu tham chiếu là Base, nhưng khi phương thức Print() được gọi, Java sẽ tìm phương thức Print() trong lớp Derived (nếu nó đã được ghi đè) thay vì trong lớp Base.

=> Tạo ban đầu là cái nào thì xài cái đó luôn (new làm cha)
 */

// Kết thúc câu 2

//Câu 3
// class Base{
//     public void show(){
//         System.out.println("Base: show() called");
//     }
// }

// class Derived extends Base{
//     public void show(){
//         System.out.println("Derived: show() called");
//     }
// }

// Kết quả: Derived: show() called vì đa hình , đã nói ở câu 2

//Kết thúc câu 3

//Câu 4
class Address{
    public String soNha;
    public String duong;
    public String quan;
    public String thanhPho;
}

class FullName{
    public String ho;
    public String tenDem;
    public String ten;
}

class Student{
    private String maSV;
    private FullName hoTen;
    private Address diaChi;

    public Student(String maSV , String ho , String tenDem , String ten , String soNha ,String duong, String quan, String thanhPho ){
        this.maSV = maSV;
        this.hoTen = new FullName();
        this.hoTen.ho = ho;
        this.hoTen.tenDem = tenDem;
        this.hoTen.ten = ten;
        
        this.diaChi = new Address();
        this.diaChi.soNha = soNha;
        this.diaChi.duong = duong;
        this.diaChi.quan = quan;
        this.diaChi.thanhPho = thanhPho;

    }

    public void setStudentID(String maSV){
        this.maSV = maSV;
    }

    public void setFName(String ho , String tenDem , String ten){
        this.hoTen.ho = ho;
        this.hoTen.tenDem = tenDem;
        this.hoTen.ten = ten;
    }
    
    public void setAddress(String soNha ,String duong, String quan, String thanhPho){
        this.diaChi.soNha = soNha;
        this.diaChi.duong = duong;
        this.diaChi.quan = quan;
        this.diaChi.thanhPho = thanhPho;
    }

    public String getStudentID(){
        return this.maSV;
    }

    public FullName getFName(){
        return this.hoTen;
    }

    public Address getAddress(){
        return this.diaChi;
    }

    public void printStudent(){
        System.out.println("Ma sinh vien: " + this.maSV);
        System.out.println("Ho ten: " + this.hoTen.ho +" "+ this.hoTen.tenDem +" "+this.hoTen.ten);
        System.out.println("Dia chi: "+this.diaChi.soNha+"/"+this.diaChi.duong +"/Quan "+this.diaChi.quan + "/Thanh Pho " + this.diaChi.thanhPho);
    }

}

/*
    có thể đổi các tham số dài thành 1 đối tượng , tùy dev thui tại đề không rõ ràng
    Dùng public cho address và fullname vì không có get set
    dùng private cho student vì có get set => ý nghĩa việc dùng get set và đặt các kiểu truy xuất


 */

// Kết thúc câu 4


public class index {
    // public static void DoPrint(Base o){
    //     o.Print(); //  => Base z
    // }
    public static void main(String[] args) {
        // Base x = new Base();
        // Base y = new Derived();
        // Derived z = new Derived();
        // DoPrint(x);
        // DoPrint(y);
        // DoPrint(z); //WOW
        // Base a = z;
        // DoPrint(a);

        // Base b = new Derived();
        // b.show();

       Student a = new Student("123" , "Duong" , "Tan Minh" , "Phuong" ,"1" , "An Duong Vuong" , "5" , "Ho Chi Minh");
       a.setAddress(a.getAddress().soNha, a.getAddress().duong, "7", a.getAddress().thanhPho); 
       
       a.printStudent();

    }
}
