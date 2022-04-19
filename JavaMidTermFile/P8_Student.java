import java.util.jar.Attributes.Name;

/*8. Create a class “Student” having following instance variables and methods.
Instance variables: ID, Name, Branch, city and university
While creating constructors with one, two, three, four and five arguments reuse the constructors by construction chaining */
public class P8_Student {

    private String ID, Name, Branch, City, University;

    P8_Student(String ID) {
        this.ID = ID;
    }

    P8_Student(String ID, String Name) {
        this(ID);
        this.Name = Name;
    }

    P8_Student(String ID, String Name, String Branch) {
        this(ID, Name);
        this.Branch = Branch;
    }

    P8_Student(String ID, String Name, String Branch, String City) {
        this(ID, Name, Branch);
        this.City = City;
    }

    P8_Student(String ID, String Name, String Branch,String City, String University) {
        this(ID, Name, Branch, City);
        this.University = University;
    }

    void showDetails() {
        System.out.println("ID = " + ID);
        System.out.println("Name = " + Name);
        System.out.println("Branch = " + Branch);
        System.out.println("City = " + City);
        System.out.println("University = " + University);
    }

    public static void main(String[] args) {
        P8_Student obj = new P8_Student("20011463", "Joy Khulbe", "Computer Science Engineering", "Dehradun", "GEHU");
        obj.showDetails();
    }
}
