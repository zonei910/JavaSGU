
abstract class Shape{
    public abstract double getPerimeter();
    public abstract double getArea();
}
interface Resizable{
    public void resize(int percent);
}


class Circle extends Shape{
    protected double radius = 1.0F;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getPerimeter(){
        return (double)2*3.14*radius;
    }

    public double getArea(){
        return (double)3.14*radius*radius;
    }

}

class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius){
        super(radius);
    }
    public void resize(int percent){
        switch(percent){
            case 100:
            System.out.println("Chu vi hinh tron: "+getPerimeter());
            System.out.println("Dien tich hinh tron: "+getArea());
                break;
            case 50:
                System.out.println("Chu vi hinh tron khi giam 50%: "+(double)(getPerimeter() / 2));
                System.out.println("Dien tich hinh tron khi giam 50%: "+(double)(getArea() / 2));
                break;
            case 150:
                System.out.println("Chu vi hinh tron khi tang 50%: "+(double)(getPerimeter() + getPerimeter()/2));
                System.out.println("Dien tich hinh tron khi tang 50%: "+ (double)(getArea() + getArea()/2));
                break;
            default:
                System.out.println("Nhap sai");
                break;
        }
    }
}

class Square  extends Shape{
    protected double side = 1.0F;

    public Square(double side){
        this.side = side;
    }


    
public double getPerimeter(){
        return (double)side*4;
    }

    public double getArea(){
        return (double)side*side;
    }
}

class ResizableSquare extends Square implements Resizable{
    public ResizableSquare(double side){
        super(side);
    }

    public void resize(int percent){
        switch(percent){
            case 100:
            System.out.println("Chu vi hinh vuong: "+getPerimeter());
            System.out.println("Dien tich hinh vuong: "+getArea());
                break;
            case 50:
                System.out.println("Chu vi hinh vuong khi giam 50%: "+(double)(getPerimeter() / 2));
                System.out.println("Dien tich hinh vuong khi giam 50%: "+(double)(getArea() / 2));
                break;
            case 150:
                System.out.println("Chu vi hinh vuong khi tang 50%: "+(double)(getPerimeter() + getPerimeter()/2));
                System.out.println("Dien tich hinh vuong khi tang 50%: "+ (double)(getArea() + getArea()/2));
                break;
            default:
                System.out.println("Nhap sai");
                break;
        }
    }


}








public class Bai2 {
    public static void main(String [] args){
        ResizableSquare a = new ResizableSquare(1.0F);
        a.resize(150);
    }
}
