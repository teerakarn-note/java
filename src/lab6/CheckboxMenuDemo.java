package lab6;

import java.awt.*;

public class CheckboxMenuDemo {
    private Frame fr;
    private MenuBar mb;
    private Menu m1, m2, m3;
    private MenuItem mi;
    private CheckboxMenuItem cbm;

    public void init() {
        fr = new Frame("checkboxMenuItem Demo");
        mb = new MenuBar();
        m1 = new Menu("File");
        m2 = new Menu("Edit");
        m3 = new Menu("Help");
        fr.setMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        // สร้าง MenuItem ปกติ
        mi = new MenuItem("Toolbars");
        // สร้าง CheckboxMenuItem โดยตั้งค่าเริ่มต้นเป็นเลือกไว้ (true)
        cbm = new CheckboxMenuItem("Status Bar", true);
        m3.add(mi);
        m3.add(cbm);
        fr.setSize(200, 200);
        fr.setVisible(true);

    }
    public static void main(String[] args) {
        CheckboxMenuDemo ojb = new CheckboxMenuDemo();
        ojb.init();
    }
}
