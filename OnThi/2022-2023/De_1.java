import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/*
Default: Truy xuất ở bất kì đâu trong 1 package , có thể dùng để khai báo lớp
Public: Truy xuất ở bất cứ đâu cũng được , khác package cũng được , có thể dùng để khai báo lớp
Private: Truy xuất được chỉ ở trong class đó , không thể dùng để khai báo lớp
Protected: Truy xuất được trong các lớp con kế thừa lớp cha có Protected kể cả lớp con ở package khác luôn
                không thể dùng để khai báo lớp


get,set dùng để lấy,gán giá trị thuộc tính khi thuộc tính có truy xuất là private để đảm bảo tính đóng gói

1. Tính đóng gói (Encapsulation)
Đóng gói là một nguyên lý của OOP, trong đó dữ liệu (biến) và các phương thức (hàm) được nhóm lại trong một đối tượng. Điều này giúp bảo vệ dữ liệu và chỉ cho phép truy cập dữ liệu thông qua các phương thức (getter, setter), nhằm đảm bảo tính toàn vẹn và bảo mật của dữ liệu.

2. Tính kế thừa (Inheritance)
Kế thừa là cơ chế cho phép một lớp (lớp con) thừa kế các thuộc tính và phương thức của một lớp khác (lớp cha). Điều này giúp tái sử dụng mã (code reuse), dễ dàng mở rộng và duy trì phần mềm.

3. Tính đa hình (Polymorphism)
Đa hình là khả năng cho phép đối tượng của các lớp khác nhau có thể sử dụng cùng một phương thức, nhưng mỗi lớp có thể triển khai hành vi khác nhau của phương thức đó. Đa hình cho phép các đối tượng của các lớp khác nhau phản hồi với cùng một thông điệp theo các cách khác nhau.

Đa hình tĩnh (Compile-time polymorphism): Còn gọi là nạp chồng phương thức (method overloading), khi có nhiều phương thức có cùng tên nhưng khác tham số (số lượng, kiểu dữ liệu của tham số).
Đa hình động (Run-time polymorphism): Còn gọi là ghi đè phương thức (method overriding), khi lớp con ghi đè lại phương thức của lớp cha để thay đổi hành vi của phương thức đó.

ví dụ đa hình
class DongVat{
    public void keu(){
        cout<<"hihi";
    }

}

class Cho extends DongVat{
@Override
    public void keu(){
        cout<<"gau gau";
    }
}


DongVat a = new Cho();
a.keu() => xuất ra gâu gâu
nếu Cho không có kêu thì kêu hihi
a chỉ có thể dùng các hàm của lớp DongVat không thể dùng hàm khác của lớp Cho


x = y => x thể hiện theo y => dùng hàm ở y
Muốn casting thì phải có 1 biến dữ liệu đó rồi cast
chỉ được cha -> con và con->cha
chỉ dùng được các hàm ở class của x

 */



// class DongVat{
//     public void keu(){
//         System.out.println("hihi");
//     }

//     public void di(){
//         System.out.println("2 chan");
//     }
// }


// class Cho extends DongVat{
//     @Override
//     public void keu(){
//         System.out.println("Gau Gau");
//     }

//     public void noichuyen(){
//         System.out.println("E ku robber toi roi ne");
//     }
// }

class Author{
    private String name;
    private String email;
    private char gender;

    public Author(){
        name = "";
        email = "";
        gender = ' ';
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public char getGender(){
        return gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

}


class Book{
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
 
    public Book(String name,Author[] authors , double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }    

    public Book(String name,Author[] authors,double price,int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return name;
    }

    public Author[] getAuthors(){
         return authors;   
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString(){
        String authorinfo = "";
        for(int i = 0 ; i<authors.length - 1;i++){
            authorinfo = authorinfo + "[name=" + authors[i].getName() + ",email=" + authors[i].getEmail() + ",gender=" + authors[i].getGender() + "],";
        }
        authorinfo += "[name=" + authors[authors.length-1].getName() + ",email=" + authors[authors.length-1].getEmail() + ",gender=" + authors[authors.length-1].getGender() + "]";
        return "Book[name=" + name+",authors={Author" + authorinfo + "}," + "price=" + price +",qty=" + qty ;
    }

    public String getAUthorNames(){
        String authorNames = "";
        for(int i = 0 ;i<authors.length-1;i++){
            authorNames = authorNames + authors[i].getName() + ",";
        }
        authorNames += authors[authors.length-1].getName();
        return authorNames;
    }


}



//Đề này hay phết nhờ

public class De_1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Book> books = new ArrayList<>();
        System.out.print("Nhap so luong cuon sach muon dua vao mang: ");
        int n = sc.nextInt();
        sc.nextLine();
        Book book = null;
        for(int i = 1 ; i<=n;i++){
            System.out.println("Sach thu "+ i);
            System.out.print("Nhap ten cuon sach: ");
            String bookName = sc.nextLine();
            System.out.print("Nhap so luong tac gia: ");
            int numAuthors = sc.nextInt();
            sc.nextLine();
            Author [] authors = new Author[0];
            for(int j = 1 ; j <=numAuthors;j++){
               Author author = new Author();
                System.out.println("Tac gia thu "+j);
                System.out.print("Nhap ten tac gia: ");
                String authorName = sc.nextLine();
                author.setName(authorName);
                System.out.print("Nhap email tac gia: ");
                String authorEmail = sc.nextLine();
                author.setEmail(authorEmail);
                System.out.print("Nhap gioi tinh tac gia[f/m]: ");
                char authorGender = sc.nextLine().charAt(0);
                author.setGender(authorGender);
                authors = Arrays.copyOf(authors , authors.length + 1);
                authors[authors.length - 1] = author;
            }
            System.out.print("Nhap gia tien: ");
            double bookPrice = sc.nextDouble();
            sc.nextLine();
            System.out.print("Nhap so luong sach: ");
            int bookQty = sc.nextInt();
            sc.nextLine();
            book = new Book(bookName, authors, bookPrice, bookQty);
            books.add(book);
        }

        for(int i=0;i<books.size();i++){
            System.out.println(books.get(i));
        }

        int max = books.get(0).getQty();
        Book maxQtyBook = books.get(0);
        for(int i=1;i<books.size();i++){
            if(books.get(i).getQty() > max){
                max = books.get(i).getQty();
                maxQtyBook = books.get(i);
            }
        }
        System.out.println("Dau sach co so luong nhieu nhat");
        System.out.println(maxQtyBook);

    }
}