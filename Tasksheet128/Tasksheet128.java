
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}


abstract class AbstractShape implements Shape {
    String color;

   
    public AbstractShape(String color) {
        this.color = color;
    }
}


class Circle extends AbstractShape {
    double radius;

    
    public Circle(String color, double radius) {
        super(color); 
        this.radius = radius;
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


class Rectangle extends AbstractShape {
    double length;
    double width;

   
    public Rectangle(String color, double length, double width) {
        super(color); 
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Tasksheet128 {
    public static void main(String[] args) {
       
        Circle circle = new Circle("Pink", 10);
        System.out.println("Circle:");
        System.out.println("Color: " + circle.color);
        System.out.printf("Area: %.2f\n", circle.calculateArea());
        System.out.printf("Perimeter: %.2f\n", circle.calculatePerimeter());

       
        Rectangle rectangle = new Rectangle("White", 12, 4);
        System.out.println("\nRectangle:");
        System.out.println("Color: " + rectangle.color);
        System.out.printf("Area: %.2f\n", rectangle.calculateArea());
        System.out.printf("Perimeter: %.2f\n", rectangle.calculatePerimeter());
    }
}
