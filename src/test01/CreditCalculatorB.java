package test01;

public class CreditCalculatorB implements CreditCalcilator {
    public  void getOverPayment(double creditSumm, double monthlyPayment, double interestRate) {
        double overPayment = 0;
        int count = 0;
        for (int i = 1; creditSumm > monthlyPayment; i++) {
            creditSumm = (creditSumm - monthlyPayment);
            count++;
            if (count % 12 == 0 & count >= 12) {
                overPayment = (overPayment + creditSumm * interestRate / 100);
                creditSumm = (creditSumm + creditSumm * interestRate / 100);
            }
        }
        System.out.println(overPayment);
    }


}
