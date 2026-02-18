public class MyBrithDate {
    private int day;
    private String month;
    private int year;

    public void setMyBrithDate(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getMyBrithDate() {
        return "My brith date is :" + day + " " + month + " " + year;
    }

    public String getCalculate() {
        year = year + 543;
        return "My brith date is :" + day + " " + month + " " + year;
    }

    public static void main(String[] args) {
        MyBrithDate bd1 = new MyBrithDate();
        bd1.setMyBrithDate(23, "October", 2004);
        System.out.println(bd1.getMyBrithDate());
        System.out.println(bd1.getCalculate());
    }
}
