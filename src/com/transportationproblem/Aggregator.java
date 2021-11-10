package com.transportationproblem;

public class Aggregator {
    // properties
    // top section
    private static int D1supply;
    private static double D1buyingPrice;
    private static int D2supply;
    private static double D2buyingPrice;
    // center section
    private static int O1demand;
    private static double O1sellingPrice;
    private static int O2demand;
    private static double O2sellingPrice;
    private static int O3demand;
    private static double O3sellingPrice;
    // bottom section
    private static double D1O1transportationCost;
    private static double D1O2transportationCost;
    private static double D1O3transportationCost;
    private static double D2O1transportationCost;
    private static double D2O2transportationCost;
    private static double D2O3transportationCost;


    // methods
    public int getD1supply() {
//        System.out.println(D1supply);
        return D1supply;
    }

    public void setD1supply(int d1supply) {
        D1supply = d1supply;
    }

    public double getD1buyingPrice() {
        return D1buyingPrice;
    }

    public void setD1buyingPrice(double d1buyingPrice) {
        D1buyingPrice = d1buyingPrice;
    }

    public int getD2supply() {
        return D2supply;
    }

    public void setD2supply(int d2supply) {
        D2supply = d2supply;
    }

    public double getD2buyingPrice() {
        return D2buyingPrice;
    }

    public void setD2buyingPrice(double d2buyingPrice) {
        D2buyingPrice = d2buyingPrice;
    }

    public int getO1demand() {
        return O1demand;
    }

    public void setO1demand(int o1demand) {
        O1demand = o1demand;
    }

    public double getO1sellingPrice() {
        return O1sellingPrice;
    }

    public void setO1sellingPrice(double o1sellingPrice) {
        O1sellingPrice = o1sellingPrice;
    }

    public int getO2demand() {
        return O2demand;
    }

    public void setO2demand(int o2demand) {
        O2demand = o2demand;
    }

    public double getO2sellingPrice() {
        return O2sellingPrice;
    }

    public void setO2sellingPrice(int o2sellingPrice) {
        O2sellingPrice = o2sellingPrice;
    }

    public int getO3demand() {
        return O3demand;
    }

    public void setO3demand(int o3demand) {
        O3demand = o3demand;
    }

    public double getO3sellingPrice() {
        return O3sellingPrice;
    }

    public void setO3sellingPrice(int o3sellingPrice) {
        O3sellingPrice = o3sellingPrice;
    }

    public double getD1O1transportationCost() {
        return D1O1transportationCost;
    }

    public void setD1O1transportationCost(int d1O1transportationCost) {
        D1O1transportationCost = d1O1transportationCost;
    }

    public double getD1O2transportationCost() {
        return D1O2transportationCost;
    }

    public void setD1O2transportationCost(int d1O2transportationCost) {
        D1O2transportationCost = d1O2transportationCost;
    }

    public double getD1O3transportationCost() {
        return D1O3transportationCost;
    }

    public void setD1O3transportationCost(int d1O3transportationCost) {
        D1O3transportationCost = d1O3transportationCost;
    }

    public double getD2O1transportationCost() {
        return D2O1transportationCost;
    }

    public void setD2O1transportationCost(int d2O1transportationCost) {
        D2O1transportationCost = d2O1transportationCost;
    }

    public double getD2O2transportationCost() {
        return D2O2transportationCost;
    }

    public void setD2O2transportationCost(int d2O2transportationCost) {
        D2O2transportationCost = d2O2transportationCost;
    }

    public double getD2O3transportationCost() {
        return D2O3transportationCost;
    }

    public void setD2O3transportationCost(int d2O3transportationCost) {
        D2O3transportationCost = d2O3transportationCost;
    }
}
