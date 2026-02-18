package lab8;

public class SimpleThrowsDemo {

    public static void main(String[] args) {

        SimpleThrowsDemo demo = new SimpleThrowsDemo();

        try {

            demo.method1();

        } catch (ArithmeticException error) {

            System.out.println("จำได้ว่าเกิดข้อผิดพลาด" + error.getMessage());

        }

        System.out.println("โปรแกรมทำงานต่อ");

    }

    public void method1() throws ArithmeticException {

        System.out.println(10 / 0);

    }

}