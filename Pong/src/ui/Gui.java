package Pong.src.ui;

import javax.swing.*;
import java.awt.*;

public class Gui {
    JFrame jf;
    public void create(){
        jf = new JFrame("Pong");
        jf.setSize(1000, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setLayout(null);
        jf.requestFocus();
        jf.getContentPane().setBackground(new Color(0, 0, 0, 0));
        jf.setVisible(true);
        jf.setUndecorated(true);

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setSize(1000,60);
        panel.setVisible(true);

    }
}
