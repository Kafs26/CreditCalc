package test01;

public class CreditCalculatorH implements CreditCalcilator {
    public  void getOverPayment(double creditSumm, double monthlyPayment, double interestRate) {
        double overPayment = creditSumm * interestRate / 100;
        int count = 0;
        for (int i = 1; creditSumm > monthlyPayment; i++) {
            creditSumm = (creditSumm - monthlyPayment);
            count++;
            if (count % 12 == 0) {
                overPayment = (overPayment + creditSumm * interestRate / 100);
                creditSumm = (creditSumm + creditSumm * interestRate / 100);
            }
        }

        System.out.println(overPayment);
    }
}
