class Parent {
    protected int x = 20;
}

class Child extends Parent {
    void display() {
        System.out.println("x = " + x);
    }
}

public class Protected {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
