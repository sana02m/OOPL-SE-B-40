import java.util.*;

class Student {
    private int id;
    private String name;
    private int[] marks = new int[5];

    public Student(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum;
    }

    public double getPercentage() {
        return getTotal() / 5.0;
    }

    public String getGrade() {
        double per = getPercentage();
        if (per >= 75) return "A";
        else if (per >= 60) return "B";
        else if (per >= 50) return "C";
        else if (per >= 40) return "D";
        else return "Fail";
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("NAME: " + name);
        System.out.println("TOTAL MARKS: " + getTotal());
        System.out.println("PERCENTAGE: " + getPercentage());
        System.out.println("GRADE: " + getGrade());
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
}

class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayAll() {
        for (Student s : students) {
            s.display();
        }
    }

    public void searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.display();
                return;
            }
        }
        System.out.println("STUDENT NOT FOUND!");
    }
}

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();

        while (true) {
            System.out.println("\n*-*-*-*-*STUDENT RESULT MANAGEMENT SYSTEM*-*-*-*-*");
            System.out.println("1. ADD STUDENT");
            System.out.println("2. DISPLAY ALL STUDENTS");
            System.out.println("3. SEARCH STUDENT BY ID");
            System.out.println("4. EXIT");
            System.out.print("ENTER CHOICE: ");
            int choice = sc.nextInt();
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

            switch (choice) {
                case 1:
                    System.out.print("ENTER ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("ENTER NAME: ");
                    String name = sc.nextLine();

                    int[] marks = new int[5];
                    System.out.println("ENTER MARKS OF 5 SUBJECT:");
                    for (int i = 0; i < 5; i++) {
                        marks[i] = sc.nextInt();
                    }

                    Student s = new Student(id, name, marks);
                    sm.addStudent(s);
                    System.out.println("STUDENT ADDED SUCCESSFULLY!");
                    break;

                case 2:
                    sm.displayAll();
                    break;

                case 3:
                    System.out.print("ENTER ID TO SEARCH : ");
                    int searchId = sc.nextInt();
                    sm.searchStudent(searchId);
                    break;

                case 4:
                    System.out.println("EXITING.........");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
