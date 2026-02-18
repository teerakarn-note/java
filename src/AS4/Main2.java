package AS4;

public class Main2 {
    public static void main(String[] args) {
        Student St1 = new Student("John", 1001, 3.4);
        GraduateStudent St2 = new GraduateStudent("Alice", 2001, 3.8, "AI in Healthcare", "Dr. Smith");
        St1.displayInfo();
        if (St1.gpa >= 3.5) {
            System.out.println("Honor : Yes");
        } else {
            System.out.println("Honor : No");
        }
        System.out.println("");

        St2.displayInfo();
        if(St2.gpa >=3.75){
            System.out.println("Honor : Yes");
        }
        else{
            System.out.println("Honor : No");
        }
    }
}
