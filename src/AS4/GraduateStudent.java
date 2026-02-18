package AS4;

public class GraduateStudent extends Student {
    private String thesisTitle;
    private String advisor;
    public GraduateStudent(String name , int studentId, double gpa, String thesisTitle, String advisor){
        super(name, studentId, gpa);
        this.thesisTitle =thesisTitle;
        this.advisor = advisor;

    }
    @Override
    public void displayInfo(){
        System.out.println( "Graduate Student");
        System.out.println("Name : " + name);
        System.out.println("ID : "+ studentId);
        System.out.println("GPA : "+ gpa);
        System.out.println("Thesis : "+ thesisTitle);
        System.out.println("Advistor : "+ advisor);

        
    }
    @Override
    public boolean isHonor(){
        return gpa >= 3.75;
    }
    public String getAdvisor(){
        return advisor;
    }
}
