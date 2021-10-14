package Pong.src.ui;

import javax.swing.*;
import java.awt.*;

public class Gui {
    JFrame jf;
    public void create(){
        jf = new JFrame("Pong");
        jf.setSize(200, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setLayout(null);
        jf.requestFocus();
        jf.getContentPane().setBackground(Color.darkGray);
        jf.setVisible(true);

    }
}
