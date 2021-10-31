package com.transportationproblem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class Simple {
//    JFrame f;
//
//    Simple() {
//        f = new JFrame();//creating instance of JFrame
//
//        JButton b = new JButton("click");//creating instance of JButton
//        b.setBounds(130, 100, 100, 40);
//
//        f.add(b);//adding button in JFrame
//
//        f.setSize(400, 500);//400 width and 500 height
//        f.setLayout(null);//using no layout managers
//        f.setVisible(true);//making the frame visible
//    }

//    public class Simple extends JFrame{//inheriting JFrame
//        JFrame f;
//        Simple(){
//            JButton b=new JButton("click");//create button
//            b.setBounds(130,100,100, 40);
//
//            add(b);//adding button on frame
//            setSize(400,500);
//            setLayout(null);
//            setVisible(true);
//        }
//    }


public class Simple extends JFrame {

    public Simple() {
        super("Transportation problem");
        setSize(1250, 1000);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // top panel
        JPanel topPanel = new JPanel();
        topPanel.setBounds(0, 0, 1250, 280);
        topPanel.setBackground(Color.gray);
        topPanel.setLayout(null);

        // center panel
        JPanel centerPanel = new JPanel();
        centerPanel.setBounds(0, 280, 1250, 280);
        centerPanel.setBackground(Color.green);

        // bottom panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBounds(0, 560, 1250, 340);
        bottomPanel.setBackground(Color.magenta);

        // footage panel
        JPanel footagePanel = new JPanel();
        footagePanel.setBounds(0, 900, 1250, 250);
        footagePanel.setBackground(Color.blue);
//        footagePanel.setLayout(null);

        // labels in top panel
        // supply label
        JLabel supplyLabel = new JLabel( "Podaż:");
        supplyLabel.setBounds(580,40,80,30);
        supplyLabel.setFont(new Font("Calibri", Font.PLAIN, 22));
        topPanel.add(supplyLabel);

        // buying price label
        JLabel buyingPrice = new JLabel( "Koszt zakupu:");
        buyingPrice.setBounds(815,40,180,30);
        buyingPrice.setFont(new Font("Calibri", Font.PLAIN, 22));
        topPanel.add(buyingPrice);

        // supplier 1 label
        JLabel supplier1 = new JLabel( "Dostawca 1:");
        supplier1.setBounds(320,100,150,30);
        supplier1.setFont(new Font("Calibri", Font.PLAIN, 22));
        topPanel.add(supplier1);

        // supplier 2 label
        JLabel supplier2 = new JLabel( "Dostawca 2:");
        supplier2.setBounds(320,180,150,30);
        supplier2.setFont(new Font("Calibri", Font.PLAIN, 22));
        topPanel.add(supplier2);

        // text fields in top panel
        // supplier 1 supply
        JTextField D1supply = new JTextField();
        D1supply.setBounds(540,100,150,30);
        topPanel.add(D1supply);

        // supplier 2 supply
        JTextField D2supply = new JTextField();
        D2supply.setBounds(540,180,150,30);
        topPanel.add(D2supply);

        // supplier 1 buying price
        JTextField D1buyingPrice = new JTextField();
        D1buyingPrice.setBounds(800,100,150,30);
        topPanel.add(D1buyingPrice);

        // supplier 2 buying price
        JTextField D2buyingPrice = new JTextField();
        D2buyingPrice.setBounds(800,180,150,30);
        topPanel.add(D2buyingPrice);

//         submit button
//        JButton submitButton = new JButton("Done");
//        submitButton.setBounds(565, 90, 80, 40);
//        submitButton.setBackground(Color.green);

        // text fields
        JTextField d1supply = new JTextField();
        JTextField d2supply = new JTextField();

//        footagePanel.add(submitButton);
        add(topPanel);
        add(centerPanel);
        add(bottomPanel);
        add(footagePanel);

    }
}