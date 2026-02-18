package faculty;
import university.Student;

public class GraduateStudent extends Student {
    private String thesisTitle;
    public GraduateStudent(String name, int studentId, String thesisTitle){
        super(name,studentId);
        this.thesisTitle = thesisTitle;
    }
    public void showDetails(){
        //เข้าถึงฟิล์ และเมดธอด protected จาก superclass
        System.out.println("GraduateStudent: ");
        System.out.println("Name : "+name);
        System.out.println("ID : "+studentId);
        System.out.println("Thesistitle : " + thesisTitle);
        displayInfo();
    }
    
}
