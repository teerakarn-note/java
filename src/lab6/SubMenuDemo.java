package lab6;
import java.awt.*;

public class SubMenuDemo {
    private Frame fr;
    private MenuBar mb;
    private Menu m1, m2, m3, ms1;
    private MenuItem mi2, mi3, mi4, msi1, msi2;

    public void init(){
        fr = new Frame("SubmenuItem Demo");
        mb = new MenuBar();
        m1 = new Menu("File");
        m2 = new Menu("Edit");
        m3 = new Menu("View");
        fr.setMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        // สร้าง Submenu
        ms1 = new Menu("New");
        mi2 = new MenuItem("Open");
        mi3 = new MenuItem("Save");
        mi4 = new MenuItem("Exit");

        m1.add(ms1);
        m1.add(mi2);
        //.addSeparator() คือการเพิ่มเส้นคั่นระหว่างเมนูไอเท็ม
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);

        msi1 = new MenuItem("Window");
        msi2 = new MenuItem("Message");
        ms1.add(msi1);
        ms1.addSeparator();
        ms1.add(msi2);
        fr.setSize(200, 200);
        fr.setVisible(true);

    }
    public static void main(String[] args) {
        SubMenuDemo obj = new SubMenuDemo();
        obj.init();
    }
}
