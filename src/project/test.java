package project;

import java.awt.*;
import java.awt.event.*;
import java.io.Console;
import java.util.jar.JarEntry;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class test implements ActionListener {
    private JPanel p1, p2;
    private JFrame fr;
    private JTextField Ce, Fa;
    private JButton Button_C_f, Button_F_C;
    private JLabel C, F;

    public void init() {

        p1 = new JPanel();
        p2 = new JPanel();
        C = new JLabel("Celsius: ");
        Ce = new JTextField("", 18);
        F = new JLabel("Fahrenheit: ");
        Fa = new JTextField("", 18);
        fr = new JFrame("Temperature Converter");

        // but
        Button_C_f = new JButton("Convert C To F");
        Button_F_C = new JButton("Convert F To C");

        Button_C_f.addActionListener(this); // 
        Button_F_C.addActionListener(this);//
        p2.setLayout(new FlowLayout());
        p1.setLayout(new FlowLayout());
        p1.add(C);
        p1.add(Ce);
        
        p1.add(F);
        p1.add(Fa);
        p2.add(Button_C_f);
        p2.add(Button_F_C);

        fr.setLayout(new BorderLayout());
        fr.setSize(400,400);
        fr.add(p1,BorderLayout.NORTH);
        fr.add(p2);
        fr.pack();
        fr.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        try {

            float price = 0;
            int Fc = 0;
            int Cf = 0;
            String T = "";
            if (e.getSource() == Button_C_f) {
                int resultF = Integer.parseInt(Ce.getText());
                if(resultF< 10){
                    T = "Ver Cold";
                }else if (resultF>= 10&& resultF<=20){
                    T = "Cold";
                }
                else if (resultF>= 21&& resultF<=29){
                    T = "Comfort";
                }else{
                    T = "Hot";
                }
                Fc = (resultF * 9 / 5) + 32;
                Fa.setText("" + Fc);
                System.out.println((resultF * 9 / 5) + 32);
                JOptionPane.showMessageDialog(null, "Celsius = " + Ce.getText() + "  Fahrenheit =" + Fc+"the Weather is "+T);
            }
            if (e.getSource() == Button_F_C) {
                int resultC = Integer.parseInt(Fa.getText());
                Cf = (resultC - 32) * 5 / 9;
                Ce.setText("" + Cf);
                if(Cf< 10){
                    T = "Ver Cold";
                }else if (Cf>= 10&& Cf<=20){
                    T = "Cold";
                }
                else if (Cf>= 21&& Cf<=29){
                    T = "Comfort";
                }else{
                    T = "Hot";
                }
                System.out.println((resultC - 32) * 5 / 9);
                JOptionPane.showMessageDialog(null, "Celsius = " + Cf + "  Fahrenheit =" + Fa.getText()+"the Weather is "+T);
            }
        }
        catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Invalid number");
        }
    }
    public static void main(String[] args) {
        test app = new test();
        app.init();
    }
}
