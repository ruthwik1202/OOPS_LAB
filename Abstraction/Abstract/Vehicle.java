abstract class Vehicle {
    abstract void start();

    void fuel() {
        System.out.println("Uses fuel");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.fuel();
    }
}