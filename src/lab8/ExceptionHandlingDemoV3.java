package lab8;

public class ExceptionHandlingDemoV3 {

    public static void main(String[] args) {

        try {

            String value = "0";

            int i = Integer.parseInt(value);

            System.out.println("Result of 4/i : " + 4 / i);

            String[] data = { "A", "B" };

            System.out.println("Third element : " + data[2]);

        }

        catch (NumberFormatException error) {

            System.out.println("Invalid numeric format : " + error.getMessage());

        }

        catch (ArithmeticException error) {

            System.out.println("Division by zero is not allowed");

        }

        catch (ArrayIndexOutOfBoundsException error) {

            System.out.println("There is no third element in the array");

        }

        System.out.println("Program Continues..");

    }

}