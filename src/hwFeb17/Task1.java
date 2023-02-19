package hwFeb17;
/*
Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimiter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.

 */
public class Task1 {
    public static void main(String[] args) {
        Circle cir=new Circle();
        Square sq=new Square();
        System.out.println("Area of Circle with radius 10.0 is "+cir.calculateArea(10.0));
        System.out.println("Perimeter of Circle with radius 10.0 is "+cir.calculatePerimiter(10.0));
        System.out.println("Area of Square with side 5.0 is "+ sq.calculateArea(5.0));
        System.out.println("Perimeter of Square with side 5.0 is "+ sq.calculatePerimiter(5.0));
    }

}

interface Shape{
    double PI=3.14; // Constant PI
    double calculateArea(double x);
    double calculatePerimiter(double x);
}

class Circle implements Shape{
    @Override
    public double calculateArea(double r) {
        return PI*(r*r);
    }

    @Override
    public double calculatePerimiter(double r) {
        return PI*(2*r);
    }
}

class Square implements Shape{
    @Override
    public double calculateArea(double a) {
        return a*a;
    }

    @Override
    public double calculatePerimiter(double a) {
        return a*4;
    }
}

