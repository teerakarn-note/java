package lab6;
import java.awt.*;
public class ListDemo {

    private Frame fr;
    private List l;
    public void init(){
        fr = new Frame("List Demo");
        l = new List(3,true);
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.select(2);
        fr.add(l);
        // .packคือการจัดขนาดหน้าต่างให้พอดีกับองค์ประกอบภายใน
        
        fr.pack();
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        ListDemo ld = new ListDemo();
        ld.init();
    }
}