package ui;

import javax.swing.*;
import java.awt.*;

public class Gui {
    JFrame jf;
    public void create(){
        jf = new JFrame("Pong");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.darkGray);
    }
}
