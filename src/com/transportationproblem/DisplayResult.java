package com.transportationproblem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayResult {

    public DisplayResult() {

        // init frame

        JFrame frame = new JFrame("Transportation problem");
        frame.setSize(1250, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel unitProfitMatrix = new JLabel();
        unitProfitMatrix.setBounds(20,20,1200,30);

        JTextArea unitProfitArea = new JTextArea();
        unitProfitArea.setBounds(20, 50, 1200, 75);

        JLabel optimalTransport = new JLabel();
        optimalTransport.setBounds(20,130,1200,30);

        JTextArea optimalTransportArea = new JTextArea();
        optimalTransportArea.setBounds(20, 160, 1200, 100);

        JLabel kosztCalk = new JLabel();
        kosztCalk.setBounds(20,280,1200,30);

        JLabel przychodCalk = new JLabel();
        przychodCalk.setBounds(20,320,1200,30);

        JLabel zyskPosr = new JLabel();
        zyskPosr.setBounds(20,360,1200,30);


        // display results
        unitProfitMatrix.setText("Tabela zysków jednostkowych:");
        unitProfitMatrix.setFont(new Font("Calibri", Font.BOLD, 24));
        unitProfitArea.setText(Logic.getMacierzZyskowJednostkowych());
        unitProfitArea.setFont(new Font("Calibri", Font.BOLD, 24));
        optimalTransport.setText("Tabela optymalnych przewozów:");
        optimalTransportArea.setText(Logic.getmacierzOptymalnychPrzewozow());
        kosztCalk.setText("Koszt całkowity: " + Double.toString(Logic.getKosztCalk()));
        przychodCalk.setText("Przychód całkowity: " + Double.toString(Logic.getPrzychodCalk()));
        zyskPosr.setText("Zysk pośrednika: " + Double.toString(Logic.getZyskPosr()));

        frame.add(unitProfitMatrix);
        frame.add(unitProfitArea);
        frame.add(optimalTransport);
        frame.add(optimalTransportArea);
        frame.add(kosztCalk);
        frame.add(przychodCalk);
        frame.add(zyskPosr);
    }
}
