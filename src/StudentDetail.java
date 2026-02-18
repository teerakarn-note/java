public class StudentDetail {
    private String firstName;
    private String lastName;
    private int age;
    private String telephoneNumber;
    private double gpa;
    private String gender;
    final String university = "Rajamangala University of Technology Isan";
    public void setStudentDetail(String firstName, String lastName, int age, String telephoneNumber, double gpa,
            String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
        this.gpa = gpa;
        this.gender = gender;
    }
    public String getFirstNameAndLastName() {
        return "My name is "+firstName+" "+lastName;
    }
    public String getAge() {
        return "I'm "+age+" years old";
    }

    public String getTelephoneNumber() {
        return "My telephone number is "+telephoneNumber;
    }

    public String getGPA() {
        return "My GPA is "+gpa;
    }

    public String getGender() {
        return "My gender is "+gender;
    }
    public String getUniversity(){
        return "Now I'm student of "+university;
    }
    public static void main(String[] args) {
        StudentDetail Student1 = new StudentDetail();
        Student1.setStudentDetail("Teerakarn", "Hasuk", 18, "0991989999", 4.00, "M");
        System.out.println(Student1.getFirstNameAndLastName());
        System.out.println(Student1.getAge());
        System.out.println(Student1.getTelephoneNumber());
        System.out.println(Student1.getGender());
        System.out.println(Student1.getUniversity());
    }
}
