package PRTS;
import javax.swing.*;
import javax.swing.JFrame;

import javax.swing.ImageIcon;
import java.awt.*;



public class wings {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(420,420);
        frame.setTitle("Hari Airlines Application");
        frame.setResizable(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("MaaraAirLine.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.ORANGE);

    }
}
