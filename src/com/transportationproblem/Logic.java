package com.transportationproblem;

public class Logic {

    private static double kosztCalk = 0;
    private static double przychodCalk = 0;
    private static double zyskPosr;

    public static double getKosztCalk() {
        return kosztCalk;
    }

    public static double getPrzychodCalk() {
        return przychodCalk;
    }

    public static double getZyskPosr() {
        return zyskPosr;
    }

    public static String getMacierzOptymalnychPrzewozow() {
        return macierzOptymalnychPrzewozow;
    }

    private static String macierzZyskowJednostkowych = "";

    public static String getMacierzZyskowJednostkowych() {
        return macierzZyskowJednostkowych;
    }

    private static String macierzOptymalnychPrzewozow = "";

    public static String getmacierzOptymalnychPrzewozow() {
        return macierzOptymalnychPrzewozow;
    }

    public Logic() {

        Dostawca[] D = new Dostawca[3];
        Odbiorca[] O = new Odbiorca[4];
        Transport[][] T = new Transport[3][4];

        Aggregator aggregator = new Aggregator();

        D[0] = new Dostawca(aggregator.getD1supply(), aggregator.getD1buyingPrice());
        D[1] = new Dostawca(aggregator.getD2supply(), aggregator.getD2buyingPrice());
//        D[0] = new Dostawca(20, 10.);
//        D[1] = new Dostawca(30, 12.);

        D[2] = new Dostawca(0, 0.);

        O[0] = new Odbiorca(aggregator.getO1demand(), aggregator.getO1sellingPrice());
        O[1] = new Odbiorca(aggregator.getO2demand(), aggregator.getO2sellingPrice());
        O[2] = new Odbiorca(aggregator.getO3demand(), aggregator.getO3sellingPrice());

//        O[0] = new Odbiorca(10, 30.);
//        O[1] = new Odbiorca(28, 25.);
//        O[2] = new Odbiorca(27, 30.);

        O[3] = new Odbiorca(D[0].podaz + D[1].podaz, 0.);

        D[2].podaz = O[0].popyt + O[1].popyt + O[2].popyt;

        T[0][0] = new Transport(aggregator.getD1O1transportationCost());
        T[0][1] = new Transport(aggregator.getD1O2transportationCost());
        T[0][2] = new Transport(aggregator.getD1O3transportationCost());
        T[0][3] = new Transport(0.);

//        T[0][0] = new Transport(8.);
//        T[0][1] = new Transport(14.);
//        T[0][2] = new Transport(17.);
//        T[0][3] = new Transport(0.);

        T[1][0] = new Transport(aggregator.getD2O1transportationCost());
        T[1][1] = new Transport(aggregator.getD2O2transportationCost());
        T[1][2] = new Transport(aggregator.getD2O3transportationCost());

//        T[1][0] = new Transport(12.);
//        T[1][1] = new Transport(9.);
//        T[1][2] = new Transport(19.);
        T[1][3] = new Transport(0.);

        T[2][0] = new Transport(0.);
        T[2][1] = new Transport(0.);
        T[2][2] = new Transport(0.);
        T[2][3] = new Transport(0.);

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 4; ++j) {
                if (i == 2 || j == 3)
                    T[i][j].zyskJednostkowy = 0.;
                else
                    T[i][j].zyskJednostkowy = O[j].cenaSprzedazy - D[i].kosztZakupu - T[i][j].kosztTransportu;
                T[i][j].ilosc = 0;
            }
        }
        System.out.println("Tabela zysków jednostkowych:");
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(T[i][j].zyskJednostkowy + " ");
                this.macierzZyskowJednostkowych += T[i][j].zyskJednostkowy + " ";
            }
            System.out.println();
            this.macierzZyskowJednostkowych += "\n";
        }

        System.out.println();

        Double[][] temp = new Double[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                temp[i][j] = T[i][j].zyskJednostkowy;
            }
        }


        for (int k = 0; k < 6; k++) {

            Double max = -1e100;

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    if (temp[i][j] > max) {
                        max = temp[i][j];
                    }
                }
            }

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    if (max == T[i][j].zyskJednostkowy) {
                        while (D[i].podaz > 0 && O[j].popyt > 0) {
                            D[i].podaz--;
                            O[j].popyt--;
                            T[i][j].ilosc++;
                        }
                        temp[i][j] = -1e100;
                    }
                }
            }

        }

        for (int i = 0; i < 3; i++) {
            if (D[i].podaz > 0) {
                for (int j = 0; j < 4; j++) {
                    if (O[j].popyt > 0) {
                        while (D[i].podaz > 0 && O[j].popyt > 0) {
                            D[i].podaz--;
                            O[j].popyt--;
                            T[i][j].ilosc++;
                        }
                    }
                }
            }
        }

//        for (int i = 0; i < 3; ++i) {
//            for (int j = 0; j < 4; ++j) {
//                System.out.print(T[i][j].zyskJednostkowy+"("+T[i][j].ilosc + ") ");
//            }
//            System.out.println();
//        }

        hereWeGoAgain:
        {
            Double[] alfa = {0., 0., 0.};
            Double[] beta = {0., 0., 0., 0.};

            for (int k = 2; k >= 0; k--) {
                for (int i = 2; i >= 0; i--) {
                    if (T[i][k + 1].ilosc > 0)
                        alfa[i] = T[i][k + 1].zyskJednostkowy - beta[k + 1];
                }

                for (int j = 3; j >= 0; j--) {
                    if (T[k][j].ilosc > 0)
                        beta[j] = T[k][j].zyskJednostkowy - alfa[k];
                }
            }

//            System.out.println();
//
//            for (int i = 0; i < 3; i++) {
//                System.out.print(alfa[i] + " ");
//            }
//
//            System.out.println();
//
//            for (int j = 0; j < 4; j++) {
//                System.out.print(beta[j] + " ");
//            }

            Double[][] delta = new Double[3][4];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    if (T[i][j].ilosc == 0)
                        delta[i][j] = T[i][j].zyskJednostkowy - alfa[i] - beta[j];
                    else
                        delta[i][j] = 0.;
                }
            }

//            System.out.println();
//            System.out.println();
//
//            for (int i = 0; i < 3; i++) {
//                for (int j = 0; j < 4; j++) {
//                    System.out.print(delta[i][j] + " ");
//                }
//                System.out.println();
//            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    int k = 0;
                    int l = 0;
                    if (delta[i][j] > 0.) {
                        if (i == 0) {
                            if (T[1][j].ilosc > 0)
                                k = 1;
                            if (T[2][j].ilosc > 0)
                                k = 2;
                        }

                        if (i == 1) {
                            if (T[0][j].ilosc > 0)
                                k = 0;
                            if (T[2][j].ilosc > 0)
                                k = 2;
                        }

                        if (i == 2) {
                            if (T[0][j].ilosc > 0)
                                k = 0;
                            if (T[1][j].ilosc > 0)
                                k = 1;
                        }

                        if (j == 0) {
                            if (T[i][1].ilosc > 0)
                                l = 1;
                            if (T[i][2].ilosc > 0)
                                l = 2;
                            if (T[i][3].ilosc > 0)
                                l = 3;
                        }

                        if (j == 1) {
                            if (T[i][0].ilosc > 0)
                                l = 0;
                            if (T[i][2].ilosc > 0)
                                l = 2;
                            if (T[i][3].ilosc > 0)
                                l = 3;
                        }

                        if (j == 2) {
                            if (T[i][0].ilosc > 0)
                                l = 0;
                            if (T[i][1].ilosc > 0)
                                l = 1;
                            if (T[i][3].ilosc > 0)
                                l = 3;
                        }

                        if (j == 3) {
                            if (T[i][0].ilosc > 0)
                                l = 0;
                            if (T[i][1].ilosc > 0)
                                l = 1;
                            if (T[i][2].ilosc > 0)
                                l = 2;
                        }

                        if (T[k][l].ilosc > 0) {
                            int min = 1000000;
                            if (T[k][j].ilosc < min)
                                min = T[k][j].ilosc;
                            if (T[i][l].ilosc < min)
                                min = T[i][l].ilosc;
                            if (T[k][l].ilosc < min)
                                min = T[k][l].ilosc;
                            T[i][j].ilosc += min;
                            T[i][l].ilosc -= min;
                            T[k][j].ilosc -= min;
                            T[k][l].ilosc += min;
                            break hereWeGoAgain;
                        }
                    }
                }
            }
        }

        System.out.println("Tabela optymalnych przewozów:");
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 4; ++j) {
                System.out.print(T[i][j].zyskJednostkowy + "(" + T[i][j].ilosc + ") ");
                macierzOptymalnychPrzewozow += (T[i][j].zyskJednostkowy + "(" + T[i][j].ilosc + ") ");
            }
            System.out.println();
            macierzOptymalnychPrzewozow += "\n";
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                kosztCalk += T[i][j].ilosc * (D[i].kosztZakupu + T[i][j].kosztTransportu);
                przychodCalk += T[i][j].ilosc * O[j].cenaSprzedazy;
            }
        }

        zyskPosr = przychodCalk - kosztCalk;

        System.out.println();
        System.out.println("Koszt całkowity: " + kosztCalk);
        System.out.println("Przychód całkowity: " + przychodCalk);
        System.out.println("Zysk pośrednika: " + zyskPosr);
    }

}
