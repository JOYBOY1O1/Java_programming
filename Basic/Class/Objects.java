package Class;

class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class Objects {
    public static void main(String[] args) {
        Employee joy = new Employee(); // Instantiating a new Employee Object
        Employee boy = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Joy
        joy.id = 6;
        joy.salary = 69;
        joy.name = "JoY";

        // Setting Attributes for Boy
        boy.id = 9;
        boy.salary = 96;
        boy.name = "BoY";

        joy.printDetails();
        boy.printDetails();
        int salary1 = joy.getSalary();
        System.out.println("Salary1: "+salary1);
        int salary2 = boy.getSalary();
        System.out.println("Salary2: "+salary2);

        // System.out.println(joy.id);
        // System.out.println(joy.name);
    }
}
