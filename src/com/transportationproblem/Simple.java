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
        centerPanel.setLayout(null);

        // bottom panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBounds(0, 560, 1250, 340);
        bottomPanel.setBackground(Color.magenta);
        bottomPanel.setLayout(null);

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
        JLabel buyingPriceLabel = new JLabel( "Koszt zakupu:");
        buyingPriceLabel.setBounds(815,40,180,30);
        buyingPriceLabel.setFont(new Font("Calibri", Font.PLAIN, 22));
        topPanel.add(buyingPriceLabel);

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
        // supplier 1 label
        JTextField D1supply = new JTextField();
        D1supply.setBounds(540,100,150,30);
        topPanel.add(D1supply);

        // supplier 2 label
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

        // labels in center panel
        // demand label
        JLabel demandLabel = new JLabel( "Popyt:");
        demandLabel.setBounds(580,30,80,30);
        demandLabel.setFont(new Font("Calibri", Font.PLAIN, 22));
        centerPanel.add(demandLabel);

        // selling price label
        JLabel sellingPriceLabel = new JLabel( "Cena sprzedaży:");
        sellingPriceLabel.setBounds(800,30,170,30);
        sellingPriceLabel.setFont(new Font("Calibri", Font.PLAIN, 22));
        centerPanel.add(sellingPriceLabel);

        // receiver labels
        // receiver 1 label
        JLabel receiver1 = new JLabel( "Odbiorca 1:");
        receiver1.setBounds(320,90,170,30);
        receiver1.setFont(new Font("Calibri", Font.PLAIN, 22));
        centerPanel.add(receiver1);

        // receiver 2 label
        JLabel receiver2 = new JLabel( "Odbiorca 2:");
        receiver2.setBounds(320,150,170,30);
        receiver2.setFont(new Font("Calibri", Font.PLAIN, 22));
        centerPanel.add(receiver2);

        // receiver 3 label
        JLabel receiver3 = new JLabel( "Odbiorca 3:");
        receiver3.setBounds(320,210,170,30);
        receiver3.setFont(new Font("Calibri", Font.PLAIN, 22));
        centerPanel.add(receiver3);

        // text fields in top panel
        // supplier 1 demand
        JTextField O1demand = new JTextField();
        O1demand.setBounds(540,90,150,30);
        centerPanel.add(O1demand);

        // supplier 2 demand
        JTextField O2demand = new JTextField();
        O2demand.setBounds(540,150,150,30);
        centerPanel.add(O2demand);

        // supplier 3 demand
        JTextField O3demand = new JTextField();
        O3demand.setBounds(540,210,150,30);
        centerPanel.add(O3demand);

        // supplier 1 selling price
        JTextField O1sellingPrice = new JTextField();
        O1sellingPrice.setBounds(800,90,150,30);
        centerPanel.add(O1sellingPrice);

        // supplier 2 selling price
        JTextField O2sellingPrice = new JTextField();
        O2sellingPrice.setBounds(800,150,150,30);
        centerPanel.add(O2sellingPrice);

        // supplier 3 selling price
        JTextField O3sellingPrice = new JTextField();
        O3sellingPrice.setBounds(800,210,150,30);
        centerPanel.add(O3sellingPrice);


        // labels in bottom panel
        // receiver 1 label
        JLabel supplier1transportationCost = new JLabel( "Dostawca 1:");
        supplier1transportationCost.setBounds(220,150,170,30);
        supplier1transportationCost.setFont(new Font("Calibri", Font.PLAIN, 22));
        bottomPanel.add(supplier1transportationCost);

        // receiver 2 label
        JLabel supplier2transportationCost = new JLabel( "Dostawca 2:");
        supplier2transportationCost.setBounds(220,230,170,30);
        supplier2transportationCost.setFont(new Font("Calibri", Font.PLAIN, 22));
        bottomPanel.add(supplier2transportationCost);

        // receiver 1 label
        JLabel receiver1transportationCost = new JLabel( "Odbiorca 1:");
        receiver1transportationCost.setBounds(440,90,170,30);
        receiver1transportationCost.setFont(new Font("Calibri", Font.PLAIN, 22));
        bottomPanel.add(receiver1transportationCost);

        // receiver 2 label
        JLabel receiver2transportationCost = new JLabel( "Odbiorca 2:");
        receiver2transportationCost.setBounds(660,90,170,30);
        receiver2transportationCost.setFont(new Font("Calibri", Font.PLAIN, 22));
        bottomPanel.add(receiver2transportationCost);

        // receiver 2 label
        JLabel receiver3transportationCost = new JLabel( "Odbiorca 3:");
        receiver3transportationCost.setBounds(880,90,170,30);
        receiver3transportationCost.setFont(new Font("Calibri", Font.PLAIN, 22));
        bottomPanel.add(receiver3transportationCost);

        // text fields in top panel
        // supplier 1 receiver 1 transportation cost
        JTextField D1O1transportationCost = new JTextField();
        D1O1transportationCost.setBounds(420,145,150,30);
        bottomPanel.add(D1O1transportationCost);

        // supplier 1 receiver 2 transportation cost
        JTextField D1O2transportationCost = new JTextField();
        D1O2transportationCost.setBounds(640,145,150,30);
        bottomPanel.add(D1O2transportationCost);

        // supplier 1 receiver 3 transportation cost
        JTextField D1O3transportationCost = new JTextField();
        D1O3transportationCost.setBounds(860,145,150,30);
        bottomPanel.add(D1O3transportationCost);

        // supplier 2 receiver 1 transportation cost
        JTextField D2O1transportationCost = new JTextField();
        D2O1transportationCost.setBounds(420,225,150,30);
        bottomPanel.add(D2O1transportationCost);

        // supplier 2 receiver 2 transportation cost
        JTextField D2O2transportationCost = new JTextField();
        D2O2transportationCost.setBounds(640,225,150,30);
        bottomPanel.add(D2O2transportationCost);

        // supplier 2 receiver 3 transportation cost
        JTextField D2O3transportationCost = new JTextField();
        D2O3transportationCost.setBounds(860,225,150,30);
        bottomPanel.add(D2O3transportationCost);

//         submit button
//        JButton submitButton = new JButton("Done");
//        submitButton.setBounds(565, 90, 80, 40);
//        submitButton.setBackground(Color.green);


//        footagePanel.add(submitButton);
        add(topPanel);
        add(centerPanel);
        add(bottomPanel);
        add(footagePanel);

    }
}