public class Car extends Vehicle {
    private int numSeats;
    private String transmission;
    private double horsepower;

    public void Car(String brand, String model, int year, String fuleType,int numSeats, String transmission, double horsepower){
        setBrand(brand);
        setModel(model);
        setYear(year);
        setFuelType(fuleType);
        setNumSeats(numSeats);
        this.numSeats = numSeats;
        this.transmission = transmission;
        this.horsepower = horsepower;
    }
    
    public int getNumseats(){
        return numSeats;
    }
    public void setNumSeats(int numSeats){
        this.numSeats = numSeats;
    }
    public String getTransmission(){
        return transmission;
    }
    public void setTransmission(String transmission){
        this.transmission = transmission;
    }
    public double getHorsepower(){
        return horsepower;
    }
    public void setHorsepower(double horsepower){
        this.horsepower = horsepower;
    }
    public int calculateFuelEffciency(){
        if (getFuelType() == "Gasoline"){
           return 10;
        }
        else if(getFuelType() == "Diesel"){
            return 15;
        }
        else{
            return 20;
        }
    }
    public String calculateHorsepower(){
        if(horsepower < 100){
            return "Low Power";
        }
        else if (horsepower <= 200){
            return "Medium Power";
        }
        else{
            return "Hight Power";
        }

    }
    public static void main(String[] args) {
        Car car = new Car();

        
        // Car and Vehicle
        // car.Vehicle("Tesla", "Dmax", 2015, "Gasoline");
        // car.Car("Toyota", "Dmax", 2015, "Gasoline", 4, "Automatic", 150);


        car.setBrand("Toyota");
        car.setModel("Corolla");
        car.setYear(2015);
        car.setFuelType("Gasoline");
        car.setNumSeats(5);
        car.setTransmission("Automatic");
        car.setHorsepower(150.0);

        System.out.println("Car Brand : "+car.getBrand());
        System.out.println("Model: "+car.getMOdel());
        System.out.println("Year: "+car.getYear());
        System.out.println("fule : "+ car.getFuelType());
        System.out.println("Seats : " +car.getNumseats());
        System.out.println("Transmission : " +car.getTransmission());
        System.out.println("Horse Power : " + car.getHorsepower());
        System.out.println("Service Stutus : " + car.checkServicesStatus());
        System.out.println("Fuel Efficeency : " + car.calculateFuelEffciency() + " km/l");
        System.out.println("Horsepower Category : "+ car.calculateHorsepower());
    }

}
