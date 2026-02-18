package lab6;

import java.awt.*;

public class ComplexDemo {
    private Frame fr;
    private Panel p1, p2;
    private TextField tf;
    private Button b, bn[];
    private String[] text = { "1", "2", "3", "4", "5", "6",
            "7", "8", "9", "0",
            "Start", "Stop" };
    public void init(){
        fr = new Frame ("ShowComplexDemo");
        fr.setFont(new Font("TimesRoman", Font.BOLD, 16));
        p1 = new Panel();
        p2 = new Panel();
        tf = new TextField("Time to be displayed here");
        b = new Button("Food to be placed here");
        p1.setLayout(new BorderLayout());
        p2.setLayout(new GridLayout(4, 3));

        bn = new Button[12];
        for (int i=0; i<text.length; i++){
            bn[i] = new Button(text[i]);
            p2.add(bn[i]);
        }
        p1.add(tf,BorderLayout.NORTH);
        p1.add(p2,BorderLayout.CENTER);
        fr.setLayout(new GridLayout(1,2));
        fr.add(b);
        fr.add(p1);
        fr.pack();
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        ComplexDemo obj = new ComplexDemo();
        obj.init();
    }
}
