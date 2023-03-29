package test01;

import java.util.ArrayList;
import java.util.Scanner;

public class CreditData {
    double creditsum, monthlyPayment, interestRate;
    String typeOfClient;
    Scanner in = new Scanner(System.in);

    String first = in.nextLine();
    String[] first_buf = first.split(" ");

    void getData() throws Exception {
        ArrayList<Double> ar = new ArrayList<>();
        for (int i = 0; i < first_buf.length - 1; i++) {
            ar.add(Double.parseDouble(first_buf[i]));
        }
        if (ar.get(0) < 0 || ar.get(1) < 0 || ar.get(2) < 0) {
            throw new Exception();
        } else if (ar.get(0) * ar.get(2) / 100 > ar.get(1) * 12) {
            throw new Exception();
        }
        creditsum = ar.get(0);
        monthlyPayment = ar.get(1);
        interestRate = ar.get(2);
        typeOfClient = first_buf[3];
    }

}
