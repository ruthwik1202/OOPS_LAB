class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of circle = πr²");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of rectangle = length × breadth");
    }
}

public class In3 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}