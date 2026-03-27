abstract class Person {
    Person() {
        System.out.println("Constructor of Person");
    }

    abstract void work();
}

class Student extends Person {
    void work() {
        System.out.println("Student studies");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.work();
    }
}