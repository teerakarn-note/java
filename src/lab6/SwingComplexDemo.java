package lab6;
import java.awt.*;
import javax.swing.*;
public class SwingComplexDemo {
    private JFrame fr;
    private JPanel p1,p2;
    private JTextField tf;
    private JButton b,bn[];
    private String[] text = { "1", "2", "3", "4", "5", "6",
            "7", "8", "9", "0",
            "Start", "Stop" };
    public void init(){
        fr = new JFrame("ShowComplexDemo");
        Container content = fr.getContentPane();
        p1  = new JPanel();
        p2  = new JPanel();
        tf = new JTextField("Time to be displayed here");
        tf.setFont(new Font("SansSerif",Font.BOLD,20));



        Icon logo = new ImageIcon("src/lab6/React.png");
        
        b = new JButton("Food to be placed here",logo);
        b.setFont(new Font("SansSerif",Font.BOLD,20));
        b.setToolTipText("Microwave door");
        p1.setLayout(new BorderLayout());
        p2.setLayout(new GridLayout(4, 3));
        bn = new JButton[12];
        for (int i=0; i<text.length; i++){
            bn[i] = new JButton(text[i]);
            bn[i].setFont(new Font("SansSerif",Font.BOLD,20));
            p2.add(bn[i]);
        }
        p1.add(tf,BorderLayout.NORTH);
        p1.add(p2,BorderLayout.CENTER);
        content.setLayout(new GridLayout(1,2));
        content.add(b);
        content.add(p1);
        fr.pack();
        fr.setVisible(true);

    }
    public static void main(String[] args) {
        SwingComplexDemo obj = new SwingComplexDemo();
        obj.init();
    }
}
