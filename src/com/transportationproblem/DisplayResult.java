package com.transportationproblem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayResult {

    public static final int WIDTH = 950;

    public DisplayResult() {

        // init frame

        JFrame frame = new JFrame("Transportation problem");
        frame.setSize(WIDTH + 60, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel unitProfitMatrix = new JLabel();
        unitProfitMatrix.setBounds(20,20,WIDTH,30);

        JTextArea unitProfitArea = new JTextArea();
        unitProfitArea.setBounds(20, 50, WIDTH, 150);

        JLabel optimalTransport = new JLabel();
        optimalTransport.setBounds(20,280,WIDTH,30);

        JTextArea optimalTransportArea = new JTextArea();
        optimalTransportArea.setBounds(20, 320, WIDTH, 200);

        JLabel kosztCalk = new JLabel();
        kosztCalk.setBounds(20,600,WIDTH,30);

        JLabel przychodCalk = new JLabel();
        przychodCalk.setBounds(20,650,WIDTH,30);

        JLabel zyskPosr = new JLabel();
        zyskPosr.setBounds(20,700,WIDTH,30);


        // display results
        unitProfitMatrix.setText("Tabela zysków jednostkowych:");
        unitProfitMatrix.setFont(new Font("Calibri", Font.BOLD, 24));
        unitProfitArea.setText(Logic.getMacierzZyskowJednostkowych());
        unitProfitArea.setFont(new Font("Calibri", Font.BOLD, 24));
        optimalTransport.setText("Tabela optymalnych przewozów:");
        optimalTransport.setFont(new Font("Calibri", Font.BOLD, 24));
        optimalTransportArea.setText(Logic.getmacierzOptymalnychPrzewozow());
        optimalTransportArea.setFont(new Font("Calibri", Font.BOLD, 24));
        kosztCalk.setText("Koszt całkowity: " + Double.toString(Logic.getKosztCalk()));
        kosztCalk.setFont(new Font("Calibri", Font.BOLD, 24));
        przychodCalk.setText("Przychód całkowity: " + Double.toString(Logic.getPrzychodCalk()));
        przychodCalk.setFont(new Font("Calibri", Font.BOLD, 24));
        zyskPosr.setText("Zysk pośrednika: " + Double.toString(Logic.getZyskPosr()));
        zyskPosr.setFont(new Font("Calibri", Font.BOLD, 24));

        frame.add(unitProfitMatrix);
        frame.add(unitProfitArea);
        frame.add(optimalTransport);
        frame.add(optimalTransportArea);
        frame.add(kosztCalk);
        frame.add(przychodCalk);
        frame.add(zyskPosr);
    }
}
