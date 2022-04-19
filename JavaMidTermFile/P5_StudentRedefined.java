/*5. Re-write program 1 with better memory management approach.
Note: use of static keyword*/
public class P5_StudentRedefined {

    private String ID, Name, Branch;
    private static String University = "GEHU";

    public void setDetails(String ID, String Name, String Branch) {
        this.ID = ID;
        this.Name = Name;
        this.Branch = Branch;
    }

    public void showDetails() {
        System.out.println("\nStudent's ID: " + ID);
        System.out.println("Student's Name: " + Name);
        System.out.println("Student's Branch: " + Branch);
        System.out.println("Student's University: " + University);
    }

    public static void main(String[] args) {
        P5_StudentRedefined obj = new P5_StudentRedefined();
        obj.setDetails("20011463", "Joy Khulbe", "Computer Science Engineering");
        obj.showDetails();
    }
}
