import java.util.Scanner;

// Inheritance คือ การสร้างคลาสใหม่โดยการนำคุณสมบัติและพฤติกรรม (properties and behaviors)
// จากคลาสที่มีอยู่แล้วมาใช้ซ้ำ (reuse) ในคลาสใหม่ โดยใช้คีย์เวิร์ด "extends" ตามด้วยชื่อคลาสที่ต้องการสืบทอด
public class EVCAR extends Car {
    private double batteryCapacity;
    private double electricConsump;

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getElectricConsump() {
        return electricConsump;
    }

    public void setElectricConsump(double electricConsump) {
        this.electricConsump = electricConsump;
    }

    public double calculateMaxDistance(double batteryCapacity, double electricConsump) {
        return batteryCapacity / electricConsump;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Car myCar = new Car();
        EVCAR myEVCar = new EVCAR();
        // Car Input
        System.out.print("Enter Car_ID: ");
        myCar.setCarID(sc.nextInt());
        System.out.print("Enter Car_Brand : ");
        myCar.setBrand(sc.next());
        System.out.print("Enter Car_Model : ");
        myCar.setModel(sc.next());
        System.out.print("Enter Car_PricePerkilo : ");

        double pricePerKilo = sc.nextDouble();
        System.out.print("Enter Car_distance : ");
        double distance = sc.nextDouble();

        // เรียนใช้ method calculateConsumPrice จาก class Car
        double priceMyCar = myCar.calculateConsumPrice(pricePerKilo, distance);

        // EV Car Input
        System.out.print("Enter EV_ID : ");
        myEVCar.setCarID(sc.nextInt());
        System.out.print("Enter EV_Brand : ");
        myEVCar.setBrand(sc.next());
        System.out.print("Enter EV_Model : ");
        myEVCar.setModel(sc.next());
        System.out.print("BatteryCapacity : ");
        double battery = sc.nextDouble();
        System.out.print("ElectricConsump : ");
        double electric = sc.nextDouble();

        // set ค่าให้กับ myEVCar
        myEVCar.setBatteryCapacity(battery);
        myEVCar.setElectricConsump(electric);

        // calculateConsumPrice EV Car
        System.out.print("PricePerkilo_EV : ");
        double pricePerKilo_EV = sc.nextDouble();
        System.out.print("distance_EV : ");
        double distance_EV = sc.nextDouble();
        double priceMyEV = myEVCar.calculateConsumPrice(pricePerKilo_EV, distance_EV);

        // calculate max distance
        double maxDistance = myEVCar.calculateMaxDistance(battery, electric);

        // Output
        System.out.println();
        System.out.println("MY CAR");
        System.out.println("Car ID: " + myCar.getCarID());
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Consum Price: " + priceMyCar + " THB");
        System.out.println();
        System.out.println("MY EV CAR");
        System.out.println("EV Car ID: " + myEVCar.getCarID());
        System.out.println("EV Brand: " + myEVCar.getBrand());
        System.out.println("EV Model: " + myEVCar.getModel());
        System.out.println("Max Distance: " + maxDistance + " km");
        System.out.println("Consum Price EV: " + priceMyEV + " THB");

    }
}