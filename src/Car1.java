public class Car1{
    private int carID;
    private String brand;
    private String model;
    public int getCarID() {
        return carID;
    }
    public void setCarID(int carID) {
        this.carID = carID;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double calculateConsumPrice(double batteryCapacity, double electricConsump){
        return batteryCapacity * electricConsump;
    }
    
}