
package lab8;

public class FinallyDemo {

    public static void main(String[] args) {

        String str[] = { "Computer", "Eng" };

        try {

            System.out.println(str[2]);

            System.out.println("Hello");

        } catch (ArrayIndexOutOfBoundsException error) {

            System.out.println("There is no third argument");

        } finally {

            System.out.println("Finish running the program");

        }

    }

}
