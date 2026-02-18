import java.util.Scanner;

public class StudentRMUTI1 {
    // Attributes
    private String name;
    private int studentID;
    private int age;
    private double gpa;

    public String getName() {
        return "Student Name: " + name;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    // Method Overloading คือ การมี Method ที่มีชื่อเดียวกัน แต่มี Type หรือ จำนวน Parameter ที่แตกต่างกัน
    public void graduateStatus(double gpa) {
        if (gpa >= 2.0) {
            System.out.println("Gradute in Bachelor Degree");
        } else {
            System.out.println("Not Graduate in Bachelor Degree");
        }
    }

    public void graduateStatus(double gpa, String thesisStatus) {
        if (gpa >= 3.0) {
            System.out.println("Graduate in Master Degree");
            System.out.println("Thesis Status: " + thesisStatus);
        } else {
            System.out.println("Not Graduate in Master Degree");
            System.out.println("Thesis Status: " + thesisStatus);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentRMUTI1 student = new StudentRMUTI1();
        StudentRMUTI1 student2 = new StudentRMUTI1();
        String thesisStatus;
        System.out.println("******Enter details of the student:1******");
        System.out.print("Enter Name: ");
        student.setName(sc.nextLine());

        System.out.print("Enter Student ID: ");
        student.setStudentID(sc.nextInt());

        System.out.print("Enter Age: ");
        student.setAge(sc.nextInt());

        System.out.print("Enter GPA: ");
        student.setGpa(sc.nextDouble());

        // sc.nextLine() คือการอ่านและละทิ้งตัวอักษร newline ที่เหลืออยู่ใน buffer (bufferคือพื้นที่เก็บข้อมูลชั่วคราว)
        sc.nextLine(); // Consume the newline character

        System.out.println("******Enter details of the student:2******");

        System.out.print("Enter Name: ");
        student2.setName(sc.nextLine());

        System.out.print("Enter Student ID: ");
        student2.setStudentID(sc.nextInt());
        System.out.print("Enter Age: ");
        student2.setAge(sc.nextInt());
        System.out.print("Enter GPA: ");
        student2.setGpa(sc.nextDouble());
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter Thesis Status: ");
        thesisStatus = sc.nextLine();
        student2.graduateStatus(student2.getGpa(), thesisStatus);
        System.out.println("\n*******Detail of Student 1*******");
        System.out.println(student.getName());
        System.out.println("ID: " + student.getStudentID());
        System.out.println("Age: " + student.getAge());
        System.out.println("GPA: " + student.getGpa());
        student.graduateStatus(student.getGpa());
        System.out.println("\n*******Detail of Student 2*******");
        System.out.println(student2.getName());
        System.out.println("ID: " + student2.getStudentID());
        System.out.println("Age: " + student2.getAge());
        System.out.println("GPA: " + student2.getGpa());
        


    }
} 
