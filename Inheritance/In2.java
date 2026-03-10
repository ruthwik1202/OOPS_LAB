class Person {
    void showPerson() {
        System.out.println("This is a person");
    }
}

class Student extends Person {
    void showStudent() {
        System.out.println("This is a student");
    }
}

class EngineeringStudent extends Student {
    void showBranch() {
        System.out.println("Branch: Computer Science");
    }
}

public class In2 {
    public static void main(String[] args) {
        EngineeringStudent obj = new EngineeringStudent();

        obj.showPerson();
        obj.showStudent();
        obj.showBranch();
    }
}