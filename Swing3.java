import java.awt.*;
import javax.swing.*;

class Swing3{
        JFrame f1;
        JLabel l1,l2,l3,l4,l5,l6,l7;
        JButton b1,b2;
        JTextField t1;
        JTextArea ta1;
        JPasswordField p1;
        JCheckBox c1,c2,c3;
        JRadioButton r1,r2;
        JComboBox jc1;
        Swing3() {
            f1 = new JFrame("Login Details");
            //Labels
            l1 = new JLabel("Full Name");
            l2 = new JLabel("Address");
            l3 = new JLabel("Password");
            l4 = new JLabel("Select Language");
            l5 = new JLabel("Gender");
            l6 = new JLabel("Select city");
            l7 = new JLabel(" ");
            //TextField
            t1 = new JTextField(20);
            //TextArea
            ta1 = new JTextArea(5,20);
            //JPasswordField
            p1 = new JPasswordField();
            //Checkboxes
            c1 = new JCheckBox("Java");
            c2 = new JCheckBox("Asp");
            c3 = new JCheckBox("PHP");
            //Radio buttons
            r1 = new JRadioButton("Male");
            r2 = new JRadioButton("Female");
            ButtonGroup bg = new ButtonGroup();
            bg.add(r1);bg.add(r2);
            // Combo Box
            jc1 = new JComboBox();
            jc1.addItem("Udaipur");
            jc1.addItem("Jaipur");
            jc1.addItem("Ahemedabad");
            //Button
            b1 = new JButton("Reset");
            b2 = new JButton("Submit");

            f1.setSize(300,400);

            f1.setLayout(new GridLayout(9,2));

            f1.add(l1); f1.add(t1);
            f1.add(l2); f1.add(ta1);
            f1.add(l3); f1.add(p1);
            f1.add(l4); f1.add(c1);
            f1.add(c2); f1.add(c3);
            f1.add(l5); f1.add(l7);
            f1.add(r1); f1.add(r2);
            f1.add(l6); f1.add(jc1);
            f1.add(b1); f1.add(b2);
            f1.setVisible(true);
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        }
    public static void main(String arg[]) {
        Swing3 s = new Swing3();
    }

}