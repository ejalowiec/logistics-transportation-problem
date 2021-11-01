package com.transportationproblem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterData {

    public EnterData() {
        JFrame frame = new JFrame("Transportation problem");
        frame.setSize(1250, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

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
        footagePanel.setLayout(null);

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
        JLabel transportationCosts = new JLabel( "Koszty transportu:");
        transportationCosts.setBounds(520,30,260,30);
        transportationCosts.setFont(new Font("Calibri", Font.BOLD, 27));
        bottomPanel.add(transportationCosts);

        // supplier 1 label
        JLabel supplier1transportationCost = new JLabel( "Dostawca 1:");
        supplier1transportationCost.setBounds(220,150,170,30);
        supplier1transportationCost.setFont(new Font("Calibri", Font.PLAIN, 22));
        bottomPanel.add(supplier1transportationCost);

        // supplier 2 label
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

        // submit button
        JButton submitButton = new JButton("Done");
        submitButton.setBounds(555, 0, 100, 40);
        submitButton.setBackground(Color.green);
        footagePanel.add(submitButton);

        // button listener
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // disable window with data
                frame.dispose();

                // integrate frontend data with backend
                Aggregator aggregator = new Aggregator();
                // top section
                aggregator.setD1supply(Integer.parseInt(D1supply.getText()));
                aggregator.setD1buyingPrice(Integer.parseInt(D1buyingPrice.getText()));
                aggregator.setD2supply(Integer.parseInt(D2supply.getText()));
                aggregator.setD2buyingPrice(Integer.parseInt(D2buyingPrice.getText()));
                // center section
                aggregator.setO1demand(Integer.parseInt(O1demand.getText()));
                aggregator.setO1sellingPrice(Integer.parseInt(O1sellingPrice.getText()));
                aggregator.setO2demand(Integer.parseInt(O2demand.getText()));
                aggregator.setO2sellingPrice(Integer.parseInt(O2sellingPrice.getText()));
                aggregator.setO3demand(Integer.parseInt(O3demand.getText()));
                aggregator.setO3sellingPrice(Integer.parseInt(O3sellingPrice.getText()));
                // bottom section
                aggregator.setD1O1transportationCost(Integer.parseInt(D1O1transportationCost.getText()));
                aggregator.setD1O2transportationCost(Integer.parseInt(D1O2transportationCost.getText()));
                aggregator.setD1O3transportationCost(Integer.parseInt(D1O3transportationCost.getText()));
                aggregator.setD2O1transportationCost(Integer.parseInt(D2O1transportationCost.getText()));
                aggregator.setD2O2transportationCost(Integer.parseInt(D2O2transportationCost.getText()));
                aggregator.setD2O3transportationCost(Integer.parseInt(D2O3transportationCost.getText()));

                // test print
//                System.out.println(aggregator.getD1supply()); // prints 1
//                System.out.println(aggregator.getD1buyingPrice()); // prints 2
//                System.out.println(aggregator.getD2supply()); // prints 3
//                System.out.println(aggregator.getD2buyingPrice()); // prints 4
//
//                System.out.println(aggregator.getO1demand()); // prints 5
//                System.out.println(aggregator.getO1sellingPrice()); // prints 6
//                System.out.println(aggregator.getO2demand()); // prints 7
//                System.out.println(aggregator.getO2sellingPrice()); // prints 8
//                System.out.println(aggregator.getO3demand()); // prints 9
//                System.out.println(aggregator.getO3sellingPrice()); // prints 10
//
//                System.out.println(aggregator.getD1O1transportationCost()); // prints 11
//                System.out.println(aggregator.getD1O2transportationCost()); // prints 12
//                System.out.println(aggregator.getD1O3transportationCost()); // prints 13
//                System.out.println(aggregator.getD2O1transportationCost()); // prints 14
//                System.out.println(aggregator.getD2O2transportationCost()); // prints 15
//                System.out.println(aggregator.getD2O3transportationCost()); // prints 16

                // start calculations
//                new TransportationProblemLogic()

                // show result on the screen
                new DisplayResult();
            }
        });


        frame.add(topPanel);
        frame.add(centerPanel);
        frame.add(bottomPanel);
        frame.add(footagePanel);
    }
}