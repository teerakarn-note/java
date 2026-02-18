public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private String fuleType;

    public void Vehicle(String brand,String model, int year,String fuleType ){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuleType = fuleType;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;

    }
    public String getMOdel(){
        return  model;

    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getFuelType(){
        return fuleType;
    }
    public void setFuelType(String fuleType){
        this.fuleType = fuleType;
    }
    public String checkServicesStatus(){
        if(year < 2010){
            return "Requuired immediate servicing";
        }
        else if(year >=2010 && year <= 2020){
            return "Service soon";
        }
        else{
            return "No service needed";
        }
    }

}
