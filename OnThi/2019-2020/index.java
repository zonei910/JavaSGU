


//Câu 1
// class Point{
//     private int x;
//     private int y; 

//     public Point(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }

//     public int getX(){
//         return this.x;
//     }

//     public int getY(){
//         return this.y;
//     }

//     //Bí vụ này rầu hic ;((
//     //Auto thêm không nói nhiều
// }


// class Line{
//     private Point begin;
//     private Point end;

//     public Line(int x1 , int y1 , int x2 , int y2){
//         this.begin = new Point(x1,y1);
//         this.end = new Point(x2,y2);
//         //SKILL mới dùng Hàm tạo để gán cho class khác => hay
//     }

//     public Line(Point begin , Point end){
//         setBegin(begin);
//         setEnd(end);
//     }

//     public Point getBegin(){
//         return this.begin;
//     }

//     public void setBegin(Point begin){
//         this.begin = begin;
//     }

//     public Point getEnd(){
//         return this.end;
//     }

//     public void setEnd(Point end){
//         this.end = end;
//     }

//     public String toString(){
//         return "Line [begin=" + this.begin.getX() + ","+this.begin.getY() + ", end=" + this.end.getX() + ","+this.end.getY() + "]";
//     }

//     public double getLength(){
//         return (double) Math.sqrt((double)Math.pow((this.end.getX() - this.begin.getX()),2) + (double)Math.pow((this.end.getY() - this.begin.getY()),2));
//     }

//     public void phuongTrinhDT(){
//         //b = y - ax
//         double a = (double) (this.end.getY() - this.begin.getY()) / (this.end.getX() - this.begin.getX());
//         double b = this.begin.getY() - a * this.begin.getX();
//         System.out.println("y = " + a +"x" + " + " +  b);
//         //Hình như phải giải phương trình tìm b luôn á chứ
//     }

//     public boolean inline(Point p){
//         double a = (double) (this.end.getY() - this.begin.getY()) / (this.end.getX() - this.begin.getX());
//         double b = this.begin.getY() - a * this.begin.getX();

//         if((a*p.getX() + b) == p.getY())
//             return true;
//         else return false;
//     }

//     public Point interaction2Line(Line l){
//         // ax + b = cx + d
//         // x(a-c) = d-b
//         //x = (d-b)/(a-c)
//         double a = (double) (this.end.getY() - this.begin.getY()) / (this.end.getX() - this.begin.getX());
//         double b = this.begin.getY() - a * this.begin.getX();


//         double c = (double) (l.getEnd().getY() - l.getBegin().getY()) / (l.getEnd().getX() - l.getBegin().getX());
//         double d = l.getBegin().getY() - c * l.getBegin().getX();

//         double resultx = (double)(d-b)/(a-c);
//         System.out.println(resultx);


//         double resulty = a*resultx + b;
//         resultx = Math.round(resultx);
//         resulty = Math.round(resulty);

//         if(a == c && b != d){
//             Point ketqua = new Point(-100, -1000);
//             return ketqua;
//         }

//         Point ketqua = new Point((int)resultx , (int)resulty);
//         return ketqua;
//     }




// }


//Câu 2





/*
 * 
 * import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Point point = new Point(1, 2);
        
        // Sử dụng phản chiếu để lấy giá trị của x
        Field fieldX = Point.class.getDeclaredField("x");
        fieldX.setAccessible(true); // Cho phép truy cập vào thuộc tính private
        int xValue = (int) fieldX.get(point);
        
        System.out.println("Value of x: " + xValue);
    }
}

=> Phản chiếu để lấy x
 */






public class index{
    public static void main(String[] args) {
        Line a = new Line(1,2,3,4);
        Line b = new Line(5,6,7,9);
        a.phuongTrinhDT();
        b.phuongTrinhDT();
        a.interaction2Line(b);
        System.out.println(a.interaction2Line(b).getX());
    }
}