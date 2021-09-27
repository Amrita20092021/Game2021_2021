package ex2;

import javax.swing.*;
import java.awt.*;

public class Test1 extends JFrame {
    Test1() {
        super ("Title");
        setSize(400,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton jButton1 = new JButton("Hello");
        setLayout(new FlowLayout());
        add(jButton1);
        add(new JPasswordField("Введите пароль"), BorderLayout.SOUTH);
        add(new JOptionPane("111"));




        setVisible(true);

    }
        public static void main(String[] args) {
    new Test1();
    }
}