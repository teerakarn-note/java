import java.util.Scanner;

public class SwitchCaseGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        char Grade = scanner.next().charAt(0);
        switch (Grade) {
            case 'A','a':
                System.out.println("Excellent");
                System.out.println("Your grade is A");
                break;
            case 'B','b':
                System.out.println("Very Good");
                System.out.println("Your grade is B");
                break;
            case 'C','c':
                System.out.println("Well done");
                System.out.println("Your grade is C");
                break;
            case 'D','d':
                System.out.println("You passed");
                System.out.println("Your grade is D");
                break;
            case 'F','f':
                System.out.println("Better try again");
                System.out.println("Your grade is F");
            default:
                System.out.println("Invalid grade");
                System.out.println("Your grade is G");
                break;
        }
    }
}