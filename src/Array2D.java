import java.util.Scanner;


import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // [row][column]
        int Number[][] = new int[3][3];
        // [row]
        for (int i = 0; i < 3; i++) {
            // [column]
            for (int j = 0; j < 3; j++) {
                System.out.print("Please Enter Array Number [" + i + "] [" + j + "] : ");
                Number[i][j] = scanner.nextInt();
            }
        }
        // Show array value 2D
        System.out.println("All Value in Array : ");
        for (int z = 0; z < 3; z++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(" " + Number[z][x] + " ");
            }
            System.out.println();
        }

        // Sum row
        int u = 1;
        for (int a = 0; a < 3; a++) {
            int sumNumber = 0;
            for (int b = 0; b < 3; b++) {
                sumNumber += Number[a][b];
            }
            System.out.println("Row sum  " + u + " : " + sumNumber);
            u++;
        }

    }
}