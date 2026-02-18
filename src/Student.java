public class Student {
    private String name;
    private int studentID;
    private int age;
    private double gpa;
    public String getName(){
        return "Student Name: "+name;
    }
    public int getStudentID(){
        return studentID;
    }
    public int getAge(){
        return age;
    }
    public double getGPA(){
        return gpa;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;

    }
    public void setAge(int age){
        this.age  = age;
    }
    public void setGPA(double gpa){
        this.gpa = gpa;
    }
    public static void main(String[ ] args) {
        Student student1 = new Student();
        student1.setName("Teerakarn hasuk");
        student1.setAge(10);
        student1.setGPA(2.0);
        
    }
}
