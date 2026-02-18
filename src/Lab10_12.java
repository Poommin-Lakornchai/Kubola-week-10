/*class Rectangle {
    int length;
    int width;
    Rectangle() {
        length = 1;
        width = 1;
    }
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    int area() {
        return length * width;
    }
    int perimeter() {
        return (length*2) + (width*2);
    }
    void display() {
        System.out.println("Rectangle " + length + " x " + width);
        System.out.println("Area =  " + area());
        System.out.println("Perimeter =  " + perimeter());
    }
}
class Triangle {
    int base;
    int height;
    Triangle() {
        base = 1;
        height = 1;
    }
    Triangle(int b, int h) {
        base = b;
        height = h;
    }
    double area() {
        return 1.0 / 2 * base * height;
    }
    void display() {
        System.out.println("Triangle: ");
        System.out.println("Base: " + base + " Height: " + height);
        System.out.println("Area =  " + area());
    }
}
class Circle {
    int r;
    double pi = 3.14;

    Circle() {
        r = 1;
    }
    Circle(int r){
        this.r = r;
    }
    double area() {
        return pi*(Math.pow(r,2));
    }
    double circumference() {
        return 2*pi*r;
    }
    void display() {
        System.out.println("Circle: ");
        System.out.println("Radius: "+r);
        System.out.println("Area =  " + area());
        System.out.println("Circumference = " + circumference());
    }
}
public class Lab10_12 {
    public static void main(String[] args) {
        Triangle t1;
        Rectangle r1;
        Circle c1,c2;
        r1 = new Rectangle(3,6);
        t1 = new Triangle(2,5);
        c1 = new Circle(7);
        c2 = new Circle();
        t1.display();
        r1.display();
        c1.display();
        c2.display();
    }
}*/
