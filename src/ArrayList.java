import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List fruit = new LinkedList();
        for (int i = 1; i <= 5; i++) {
            System.out.print("Please enter fruit name " + i + " : ");
            fruit.add(scanner.nextLine());
        }
        // show fruit
        System.out.println("All fruit name :  " + fruit);

        // search fruit
        System.out.print("Search fruit Name: ");
        String fruitName = scanner.nextLine();
        if (fruit.contains(fruitName)) {
            System.out.println("Found : " + fruitName);
        } else {
            System.out.println("Not found : " + fruitName);
        }

    }
}