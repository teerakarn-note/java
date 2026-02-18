import java.util.Scanner;
import java.util.Arrays;

public class ArrayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumNumber = 0;
        int y = 1;
        int Number[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Please Enter Number " + y + " : ");
            Number[i] = scanner.nextInt();
            sumNumber += Number[i];
            y++;
        }
        Arrays.sort(Number);
        System.out.println("All Value in Array " + Arrays.toString(Number));
        System.out.println("Sum :" + sumNumber);
        System.out.println("Max :" + Number[4]);
        System.out.println("Min :" + Number[0]);

    }
}