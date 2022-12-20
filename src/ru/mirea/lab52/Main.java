package ru.mirea.lab52;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String args[])
    {
        String[] strings = new String[1];
        strings[0] = "C:\\Users\\novru\\Downloads\\Кот.gif";

        Image bgImage= Toolkit.getDefaultToolkit().getImage(strings[0]);
        JLabel jLabel = new JLabel(new ImageIcon(bgImage));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.GRAY);
        mainPanel.add(jLabel);

        JFrame frame = new JFrame("JFrame");
        frame.setPreferredSize(new Dimension(396,221));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
