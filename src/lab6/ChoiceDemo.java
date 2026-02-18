package lab6;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class ChoiceDemo {
    public static void main(String[] args) {
        JFrame fr = new JFrame("Choice Demo");
        Choice c = new Choice();
        c.addItem("New Zealand ");
        c.addItem("Thailand ");
        c.addItem("USA");
        c.add("Japan");
        c.select("Thailand");
        fr.add(c);
        fr.pack();

        //เมื่อใช้ JFrame แล้วต้องการปิดโปรแกรม
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //หรือใช้ WindowListener เพื่อจัดการกับเหตุการณ์ปิดหน้าต่าง
        // นิยมใช้่กับ Frame มากกว่า JFrame เพราะ JFrame มีการจัดการปิดหน้าต่างในตัวแล้ว
        fr.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                fr.dispose();
                System.exit(0);
            }
        });
        fr.setVisible(true);
    }
}
