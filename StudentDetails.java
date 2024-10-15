import java.util.*;
class Details {
    private String name = "";
    private String dept = "";
    private int rollNo;
    private int age;
    public void setDetails() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name: ");
        this.name = s.nextLine();
        System.out.print("Enter the dept: ");
        this.dept = s.nextLine();
        System.out.print("Enter the roll number: ");
        this.rollNo = s.nextInt();
        System.out.print("Enter age: ");
        this.age = s.nextInt();
    }
    public void display() {
        System.out.print("\nName: " + name);
        System.out.print("\nDepartment: " + dept);
        System.out.print("\nROLL NUMBER: " + rollNo);
        System.out.print("\nAge: " + age);
    }
    public int getRollNo() {
        return rollNo;
    }
}
public class StudentDetails {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Details dt[] = new Details[5];
        System.out.println("Enter 5 students details:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student "+(i+1)+" details:\n");
            dt[i] = new Details();
            dt[i].setDetails();
        }
        System.out.println("Enter rollNo of the student to display the details:");
        int rn = s.nextInt();
        for (int i = 0; i < 5; i++) {
            if (rn == dt[i].getRollNo()) {
                dt[i].display();
            }
        }
    }
}
