package org.example.L01_maven;

import javax.swing.*;
import java.awt.*;

public class MyApp {
    public static void main(String[] args) {
        String text = "Hi";
        JFrame app = new JFrame("App");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Kataryna!");
        panel.setLayout(new GridLayout());
        panel.add(label);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 140, 10, 30));
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 100);
        app.setVisible(true);
    }
}
