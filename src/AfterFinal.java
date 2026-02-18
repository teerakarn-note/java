import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AfterFinal {
    private JFrame fr;
    private JButton bt1,bt2;
    private JPanel p1,p2;
    public void init() {
        fr = new JFrame("teerakarn hasuk");
        fr.setLayout(new BorderLayout());
        fr.setSize(1000, 1000);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        bt1 = new JButton("b1");
        bt2 = new JButton("b2");
        JButton bt3 = new JButton("b3");
        JButton bt4 = new JButton("b4");
        p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.LEFT ,15,15));
        Font font = new Font("Tahoma",Font.BOLD,18);
        bt1.setFont(font);
        bt2.setFont(font);
        p1.add(bt1);
        p1.add(bt2);
        p1.setBackground(new Color(52  ,73,94));
        bt1.addActionListener(new CloseApp());
        p2 = new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.LEFT ,15,15));
        p2.add(bt3);
        p2.add(bt4);
        fr.add(p1,BorderLayout.NORTH);
        fr.add(p2,BorderLayout.SOUTH);
        
        fr.setVisible(true);


    }
    public class CloseApp implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        }
    public static void main(String[] args) {
        AfterFinal app = new AfterFinal();
        app.init();
    }
}
