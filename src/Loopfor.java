import java.util.Scanner;
public class Loopfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        for(int i = 1; i<=number; i++){
            System.out.println(i+"> Teerakarn Hasuk");
        }
    }
}