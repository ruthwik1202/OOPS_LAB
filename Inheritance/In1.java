class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;

    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
    }
}

public class In1 {
    public static void main(String[] args) {
        Student s = new Student();
        
        s.name = "Rahul";
        s.age = 19;
        s.rollNo = 101;

        s.displayPerson();
        s.displayStudent();
    }
}