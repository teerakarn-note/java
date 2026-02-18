import java.util.Scanner;
public class LoopDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scanner.nextInt();
        int i = 1;
        do{
            System.out.println(i+">Teerakarn hasuk");
            i++;
        }while(i <= number);
    }
}