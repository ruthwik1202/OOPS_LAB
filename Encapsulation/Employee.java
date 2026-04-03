class Employee {
    private int empId;
    private double salary;

    public void setEmpId(int id) {
        empId = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmpId(201);
        e.setSalary(25000);

        System.out.println("Employee ID: " + e.getEmpId());
        System.out.println("Salary: " + e.getSalary());
    }
}