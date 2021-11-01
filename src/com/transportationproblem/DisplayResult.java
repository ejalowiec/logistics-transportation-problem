package com.transportationproblem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayResult {

    public DisplayResult() {
        JFrame frame = new JFrame("Transportation problem");
        frame.setSize(1250, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 20, 1200, 950);
        frame.add(textArea);
    }
}
