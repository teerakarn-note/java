package AS4;

public class Student implements PersonInfo {
    protected String name;
    protected int studentId;
    protected double gpa;
    
    public Student(String name , int studentId, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;

    }
    @Override 
    public void displayInfo(){
        System.out.println("Undergraduate Student");
        System.out.println("Name : "+name);
        System.out.println("ID : "+studentId);
        System.out.println("GPA : "+gpa);

    }
    public boolean isHonor(){
        return gpa >=3.5;
    }

}
