public class EncapStudent {
    private String id;
    private String name;
    private double gpa;

    public void setID(String ID) {
        id = ID;
    }

    public void setName(String n) {
        name = n;
    }

    public void setGPA(double GPA) {
        if ((GPA < 0) || (GPA > 4.00)) {
            System.out.println("\nIncorrect Format");
        } else {
            gpa = GPA;
        }
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }

    public static void main(String[] args) throws Exception {
        EncapStudent std1;
        std1 = new EncapStudent();
        std1.setID("333333333333-9");
        std1.setName("Kedkarn");
        std1.setGPA(3.90);
        System.out.println();
        System.out.println("ID = " + std1.getID() + " Name = " + std1.getName() + "GPA = " + std1.getGPA());
        System.out.println();

        EncapStudent std2;
        std2 = new EncapStudent();
        std2.setID("555555555555-9");
        std2.setName("Peter");
        std2.setGPA(3.45);
        System.out.println();
        System.out.println("ID = " + std2.getID() + " Name = " + std2.getName() + " GPA = " + std2.getGPA());
        System.out.println();
    }
}