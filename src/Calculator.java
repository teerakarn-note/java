public class Calculator {
    private String calType;
    private int height;
    private int width;
    private String brand;


    //  public void setCalType(String calType){
    //     calType = calType;
    //         ถ้าใช้ชื่อตัวแปรเหมือนกันจะเกิดปัญหา ค่าจะไม่ถูกเก็บ ให้ใส่ this.หน้าตัวแปรเพื่ออ้างถึงพร็อพเพอตี้ของคลาส
    //             เช่น this.calType = calType;
    //  }

    
    public void setCalType(String CalType){
        calType = CalType;
    }
    public void setHeight(int Height){
        height = Height;
    }
    public void setWidth(int Widht){
        width = Widht;
    }
    public void setBrand(String Brand){
        brand = Brand;
    }
    public String getCalType(){
        return calType;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public String getBrand(){
        return brand;
    }
    public int adddition(int x, int y){
        return x+y;
    }
    public int subtract(int x, int y){
        return x-y;
    }
    public int multiply(int x, int y){
        return x*y;
    }
    public float divide(int x, int y){
        return x/y;
    }
    public static void main(String[] args) {
        // ชื่อคลาส - object = new ชืีอคลาส (สร้างobject)
        Calculator cal1 = new Calculator();
        int x = 50;
        int y = 10;
        // object.methodที่สร้าง("value")
        cal1.setCalType("Basic");
        cal1.setHeight(20);
        cal1.setWidth(30);
        cal1.setBrand("Casio");


        System.out.println("Type of Calculator is " + cal1.getCalType() +" Height = " + cal1.getHeight()+" Width = "+ cal1.getWidth()+" Brand is "+cal1.getBrand());
        System.out.println("Additon result of 50 and 10 = "+ cal1.adddition(x, y));
        System.out.println("Subtract result of 50 and 10 = "+ cal1.subtract(x, y));
        System.out.println("Multiply result of 50 and 10 = "+ cal1.multiply(x, y));
        System.out.println("Divide result of 50 and 10 = "+ cal1.divide(x, y));
        



    }


}



