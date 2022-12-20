package ru.mirea.lab53;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        JPanel container = new JPanel();
        CardLayout cardLayout = new CardLayout();

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(container);
            }
        };

        container.setLayout(cardLayout);

        for(int counter = 1; counter <= 10; counter++)
        {
            Figure figure = new Figure(0,0,100,200);
            figure.SetNumber(counter);
            figure.SetColor(new Random().nextInt(255),new Random().nextInt(255),new Random().nextInt(255));

            JButton jButton = new JButton();
            jButton.add(figure.GetJFectangle());
            jButton.addActionListener(actionListener);
            container.add(jButton);
        }

        JFrame jFrame = new JFrame("JFrame");
        jFrame.setPreferredSize(new Dimension(800,500));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(container, BorderLayout.CENTER);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
