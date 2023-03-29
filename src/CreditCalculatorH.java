public class CreditCalculatorH implements CreditCalcilator {
    public double getOverPayment(double creditsumm, double monthlyPayment, double interestRate) {
        double overpayment = creditsumm * interestRate / 100;
        int count = 0;
        for (int i = 1; creditsumm > monthlyPayment; i++) {
            creditsumm = (creditsumm - monthlyPayment);
            count++;
            if (count % 12 == 0) {
                overpayment = (overpayment + creditsumm * interestRate / 100);
                creditsumm = (creditsumm + creditsumm * interestRate / 100);
            }
        }

        return overpayment;
    }
}
