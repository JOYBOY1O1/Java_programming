/*1.Create a class “Student” having following instance variables and methods.
Instance variables: ID, Name, Branch and university
Method: setDetails() and showDetails().
The setDetails() method sets the values of ID, Name, Branch and University.
And showDetails() method shows the value of each field.*/

class P1_Student {
    int ID;
    String Name, Branch, University;

    public void setDetails(int ID, String Name, String Branch, String University) {
        this.ID = ID;
        this.Name = Name;
        this.Branch = Branch;
        this.University = University;
    }

    public void showDetails() {
        System.out.println("\nStudent's ID: " + ID);
        System.out.println("Student's Name: " + Name);
        System.out.println("Student's Branch: " + Branch);
        System.out.println("Student's University: " + University);
    }

    public static void main(String[] args) {
        P1_Student obj = new P1_Student();
        obj.setDetails(20011463, "Joy Khulbe", "Computer Science Engineering", "GEHU");
        obj.showDetails();
    }
}