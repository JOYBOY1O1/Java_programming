import java.util.*;

public class Rough {
    public static void main(String[] args) {
        student obj[] = new student[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            char section = sc.next().charAt(0);
            int percentage = sc.nextInt();

            obj[i] = new student(name, age, section, percentage);
        }
		sc.close();
        for (int i = 0; i < 6; i++) {
            obj[i].display();
        }
    }
}

class student {
    String name;
    int age;
    char section;
    int percentage;

    student(String n, int a, char s, int p) {
        name = n;
        age = a;
        section = s;
        percentage = p;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(section);
        System.out.println(percentage);
    }
}