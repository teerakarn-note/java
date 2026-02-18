import java.util.Scanner;
import java.text.DecimalFormat;

public class BMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Enter amount of people : ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print("Enter ID : ");
            int Id = scanner.nextInt();
            System.out.print("Enter weight : ");
            Double weight = scanner.nextDouble();
            System.out.print("Enter weight : ");
            Double height = scanner.nextDouble();
            Double BMI = weight/(height*height);
            
            if(BMI < 18.5 ){
                
                System.out.println("BMI : "+df.format(BMI)+" THIN");
            }
            else if(BMI >= 18.5 && BMI <=24.9 ){
                System.out.println(df.format(BMI)+" Normal");
            }
            else if(BMI >= 25 && BMI <= 29.9){
                System.out.println("BMI : "+df.format(BMI)+" Fat");
            }
            else{
                System.out.println("BMI : "+df.format(BMI)+" Very Fat");
            }
            System.err.println();
        }

    }
}