package university;

public class Student {
    protected String name;
    protected int studentId;
    public Student(String name, int studentId){
        this.name = name;
        this.studentId = studentId;

    }
    protected void displayInfo(){
        System.out.println("Name : " + name);        
        System.out.println("StudetnId  : " + studentId);        
    }
}
