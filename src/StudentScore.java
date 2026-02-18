import java.util.*;
import java.util.Scanner;
public class StudentScore {
    public static void main(String[] args) {
        Map studentScores = new HashMap();
        for (int i = 1; i <= 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter student name " + i + " : ");
            String name = scanner.nextLine();
            System.out.print("Please enter score " + name + " : ");
            int score = scanner.nextInt();
            studentScores.put(name, score);
        }
        //show all student key and value
        System.out.println("All student scores: ");
        System.out.println(studentScores.keySet());
        System.out.println(studentScores.entrySet());

        //search student score by name
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Student search : ");
        String searchName = scanner.nextLine();
        if (studentScores.containsKey(searchName)) {
            System.out.println("Result " + searchName + " has Score " + studentScores.get(searchName));
        } else {
            System.out.println("Not found " + searchName);
        }

    }
}