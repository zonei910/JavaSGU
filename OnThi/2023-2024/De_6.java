import java.util.ArrayList;
import java.util.Scanner;

//Câu 3
interface ICapNhat {
    void setDTB();
}

// =>interface
//

// Câu 1
class SinhVien implements ICapNhat {
    private String ma;
    private String hoTen;
    private String ngaySinh;
    private String nganh;
    private double diemTB;

    public SinhVien() {
        ma = "";
        hoTen = "";
        ngaySinh = "";
        nganh = "";
        diemTB = 0;
    }

    public SinhVien(String ma, String hoTen, String ngaySinh, String nganh, double diemTB) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.nganh = nganh;
        this.diemTB = diemTB;
    }

    public String getMa() {
        return ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getNganh() {
        return nganh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDTB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem trung binh moi: ");
        double newDTB = sc.nextDouble();
        this.diemTB = newDTB;
    }

    public void xuat() {
        System.out.println("Ma sinh vien: " + ma);
        System.out.println("Ho ten sinh vien: " + hoTen);
        System.out.println("Ngay thang nam sinh: " + ngaySinh);
        System.out.println("Nganh: " + nganh);
        System.out.println("Diem trung binh: " + diemTB);
    }

}

class DSSinhVien {
    private ArrayList<SinhVien> dssv;

    public DSSinhVien() {
        dssv = new ArrayList<SinhVien>(0);
    }

    public DSSinhVien(ArrayList<SinhVien> a) {
        dssv = a;
    }

    public ArrayList<SinhVien> getDSSinhVien() {
        return dssv;
    }

    public void themSV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        String ma = sc.nextLine();
        System.out.print("Nhap ho ten sinh vien: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap ngay thang nam sinh cua sinh vien: ");
        String ngaySinh = sc.nextLine();
        System.out.print("Nhap nganh cua sinh vien: ");
        String nganh = sc.nextLine();
        System.out.print("Nhap diem trung binh cua sinh vien: ");
        double diemTB = sc.nextDouble();
        SinhVien a = new SinhVien(ma, hoTen, ngaySinh, nganh, diemTB);
        dssv.add(a);
    }

    public void timSV() {
        Scanner sc = new Scanner(System.in);
        int co = 0;
        do {
            System.out.print("Nhap ten sinh vien can tim: ");
            String ten = sc.nextLine();
            for (int i = 0; i < dssv.size(); i++)
                if (dssv.get(i).getHoTen().equals(ten)) {
                    co = 1;
                    dssv.get(i).xuat();
                }
            if (co == 0) {
                System.out.println("Khong co sinh vien duoc tim thay,ban co muon tim lai khong [1/0]");
                co = sc.nextInt();
            }

            if (co == 1)
                co = 1;
            else
                co = 0;

        } while (co == 0);

    }

    public void xuatDSSinhVien() {
        for (int i = 0; i < dssv.size(); i++) {
            dssv.get(i).xuat();
            System.out.println("");
        }
    }

}
// Kiểm tra kiến thức dùng mảng thôi , equals() so sánh chuỗi
// Kết thúc câu 1

// Câu 2
class LopHoc {
    private String maLop;
    private DSSinhVien dssv;

    public LopHoc() {
        maLop = "";
        dssv = new DSSinhVien();
    }

    public LopHoc(String maLop, DSSinhVien dssv) {
        this.maLop = maLop;
        this.dssv = dssv;
    }

    public String getMaLop() {
        return maLop;
    }

    public DSSinhVien getDSSinhVien() {
        return dssv;
    }

}

class DSLopHoc {
    private ArrayList<LopHoc> dslp;

    public DSLopHoc() {
        dslp = new ArrayList<LopHoc>(0);
    }

    public DSLopHoc(ArrayList<LopHoc> dslp) {
        this.dslp = dslp;
    }

    public ArrayList<LopHoc> getDSLopHoc() {
        return dslp;
    }

    public void themLH() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma lop: ");
        String malop = sc.nextLine();
        DSSinhVien dssv = new DSSinhVien();
        System.out.print("Nhap so luong sinh vien muon them: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            dssv.themSV();
        }

        LopHoc lop = new LopHoc(malop, dssv);
        dslp.add(lop);
    }

    public void xuatDSLopHoc() {
        for (int i = 0; i < dslp.size(); i++) {
            System.out.println("Ma lop: " + dslp.get(i).getMaLop());
            dslp.get(i).getDSSinhVien().xuatDSSinhVien();
            System.out.println("----------");
        }
    }

}
// => kiểm tra khả năng dùng has-a
// Xong câu 2

public class De_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSSinhVien khoa = new DSSinhVien();

        for (int i = 0; i < 5; i++)
            khoa.themSV();

        khoa.xuatDSSinhVien();

        int m = khoa.getDSSinhVien().size()/2;

        DSSinhVien dsSinhVienLop1 = new DSSinhVien();
        DSSinhVien dsSinhVienLop2 = new DSSinhVien();

        for (int i = 0; i < m; i++)
        dsSinhVienLop1.getDSSinhVien().add(khoa.getDSSinhVien().get(i));

        for (int i = m ; i < khoa.getDSSinhVien().size(); i++)
        dsSinhVienLop2.getDSSinhVien().add(khoa.getDSSinhVien().get(i));

        System.out.print("Nhap ma lop 1: ");
        String maLop1 = sc.nextLine();
        LopHoc lop1 = new LopHoc(maLop1,dsSinhVienLop1);
        System.out.print("Nhap ma lop 2: ");
        String maLop2 = sc.nextLine();
        LopHoc lop2 = new LopHoc(maLop2,dsSinhVienLop2);

        DSLopHoc dsLopHoc = new DSLopHoc();
        dsLopHoc.getDSLopHoc().add(lop1);
        dsLopHoc.getDSLopHoc().add(lop2);

        dsLopHoc.xuatDSLopHoc();

        for(int i =0 ; i<khoa.getDSSinhVien().size();i++)
            if(khoa.getDSSinhVien().get(i).getHoTen().equals("1"))
                khoa.getDSSinhVien().get(i).setDTB();
        dsLopHoc.xuatDSLopHoc();
    }
}

//=> tác động đến đối tượng đó thì tất cả đối tượng ở lớp khác đều bị tác động lun omg!!!