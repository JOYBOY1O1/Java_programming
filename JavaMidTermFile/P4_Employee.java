/*4. Create class Employee with following attributes and methods
ID, name, department and salary.
The setDetails() method sets the values of ID, name, department and salary.
And showDetails() method shows the value of each field.
(i) Values must be entered through Scanner class.
(ii) Use proper constructor
(iii) Use “this” reference variable to avoid ambiguity.*/

import java.util.Scanner;

class P4_Employee {
    private int ID, Salary;
    private String Name, Department;

    void setDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        this.ID = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Name: ");
        this.Name = sc.nextLine();
        System.out.print("Enter Department: ");
        this.Department = sc.nextLine();
        System.out.print("Enter Salary: ");
        this.Salary = sc.nextInt();

        sc.close();

    }

    void showDetails() {
        System.out.println("\nEmployee's ID: " + ID);
        System.out.println("Employee's Name: " + Name);
        System.out.println("Employee's Department: " + Department);
        System.out.println("Employee's Salary: " + Salary);

    }

    public static void main(String[] args) {
        P4_Employee obj = new P4_Employee();

        obj.setDetails();
        obj.showDetails();
    }
}