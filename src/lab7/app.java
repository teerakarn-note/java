package lab7;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class app implements ActionListener {
    private JFrame fr;
    private JCheckBox cb1, cb2, cb3, cb4, cb5;
    private JButton btnOrder, btnExit;
    private JTextField tf1, tf2, tf3, tf4, tf5;
    private Choice drinkChoice;
    public void header() {
        fr = new JFrame();
        JPanel header = new JPanel();
        header.setBackground(new Color(52, 73, 94));
        header.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 20));
        JLabel title = new JLabel("My-CPE-Cafe");
        title.setFont(new Font("Arial", Font.BOLD, 30));

        // set font color to white
        title.setForeground(Color.white);
        header.add(title);

        fr.add(header, BorderLayout.NORTH);
        fr.setSize(400, 200);
        fr.setVisible(true);

    }

    public void footer() {
        JPanel footer = new JPanel();
        footer.setBackground(new Color(52, 73, 94));
        footer.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 20));
        JLabel Lfooter = new JLabel("My_Teerakran_Hasuk_CPE-68231");
        Lfooter.setFont(new Font("Arial", Font.BOLD, 26));
        Lfooter.setForeground(Color.white);
        footer.add(Lfooter);
        fr.add(footer, BorderLayout.SOUTH);
    }

    public void Choice() {
        // 1. ตั้งค่าฟอนต์
        Font fHead = new Font("Tahoma", Font.BOLD, 20);
        Font fText = new Font("Tahoma", Font.PLAIN, 18);

        JPanel main = new JPanel(new GridBagLayout());

        main.setBorder(new javax.swing.border.EmptyBorder(20, 40, 20, 40));

        GridBagConstraints gbc = new GridBagConstraints();
        //
        gbc.fill = GridBagConstraints.HORIZONTAL;
        // new Insets(top, left, bottom, right)
        gbc.insets = new Insets(10, 10, 10, 10);

        // --- แถว 0: ส่วนหัว Choice ---
        drinkChoice = new Choice();
        drinkChoice.setFont(fHead);
        drinkChoice.add("Drink in Cafe");
        drinkChoice.add("Take Away");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        main.add(drinkChoice, gbc);

        // --- แถว 1: หัวข้อ Amount ---
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        JLabel lblAmt = new JLabel("Amount", SwingConstants.CENTER);
        lblAmt.setFont(fHead);
        main.add(lblAmt, gbc);

        // --- แถว 2: Matcha ---
        gbc.gridy = 2;
        gbc.gridx = 0;
        cb1 = new JCheckBox("Matcha (80 Baht)");
        cb1.setFont(fText);
        cb1.setSelected(true);
        main.add(cb1, gbc);
        gbc.gridx = 1;
        tf1 = new JTextField("1", 5);
        main.add(tf1, gbc);

        // --- แถว 3: Americano ---
        gbc.gridy = 3;
        gbc.gridx = 0;
        cb2 = new JCheckBox("Americano (65 Baht)");
        cb2.setFont(fText);
        cb2.setSelected(true);
        main.add(cb2, gbc);
        gbc.gridx = 1;
        tf2 = new JTextField("1", 5);
        main.add(tf2, gbc);

        // --- แถว 4: Greentea ---
        gbc.gridy = 4;
        gbc.gridx = 0;
        cb3 = new JCheckBox("Greentea (75 Baht)");
        cb3.setFont(fText);
        cb3.setSelected(true);
        main.add(cb3, gbc);
        gbc.gridx = 1;
        tf3 = new JTextField("1", 5);
        main.add(tf3, gbc);

        // --- แถว 5: Espresso ---
        gbc.gridy = 5;
        gbc.gridx = 0;
        cb4 = new JCheckBox("Espresso (70 Baht)");
        cb4.setFont(fText);
        cb4.setSelected(true);
        main.add(cb4, gbc);
        gbc.gridx = 1;
        tf4 = new JTextField("1", 5);
        main.add(tf4, gbc);

        // --- แถว 6: Fresh Milk ---
        gbc.gridy = 6;
        gbc.gridx = 0;
        cb5 = new JCheckBox("Fresh Milk (60 Baht)");
        cb5.setFont(fText);
        cb5.setSelected(true);
        main.add(cb5, gbc);
        gbc.gridx = 1;
        tf5 = new JTextField("1", 5);
        main.add(tf5, gbc);

        // --- แถว 7: ปุ่มกด ---
        gbc.gridy = 7;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        JPanel btnGroup = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        btnOrder = new JButton("Order");
        btnExit = new JButton("Exit");

        btnOrder.setFont(fHead);
        btnExit.setFont(fHead);
        btnExit.addActionListener(this); // กดแล้วปิด
        btnOrder.addActionListener(this);//

        btnGroup.add(btnOrder);
        btnGroup.add(btnExit);
        main.add(btnGroup, gbc);

        fr.add(main, BorderLayout.CENTER);
        fr.pack();
        fr.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        float price = 0;
        String message = drinkChoice.getSelectedItem()+ "\n----------------------\n";
        if (cb1.isSelected()){
            int amount1 = Integer.parseInt(tf1.getText());
            price += 80 * amount1;
            message += "Matcha: "+amount1+"\n";
        }
        if (cb2.isSelected()){
            int amount2 = Integer.parseInt(tf2.getText());
            price += 65 * amount2;
            message += "Americano: "+amount2+"\n";
        }
        if (cb3.isSelected()){
            int amount3 = Integer.parseInt(tf3.getText());
            price += 75 * amount3;
            message += "Greentea: "+amount3+"\n";
        }
        if (cb4.isSelected()){
            int amount4 = Integer.parseInt(tf4.getText());
            price += 70 * amount4;
            message += "Espresso: "+amount4+"\n";
        }
        if (cb5.isSelected()){
            int amount5 = Integer.parseInt(tf5.getText());
            price += 60*amount5;
            message += "Fresh Milk: "+amount5+"\n";
        }
        if (e.getSource() == btnExit) {
            System.exit(0);
        }
        if(e.getSource() == btnOrder){
        message +="----------------------\n";
        JOptionPane.showMessageDialog(null, message + "Total Price: " + price + " Baht\n");}
        
    }

    public static void main(String[] args) {
        app app = new app();
        app.header();
        app.footer();
        app.Choice();
    }
}
