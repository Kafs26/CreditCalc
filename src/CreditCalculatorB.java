public class CreditCalculatorB implements CreditCalcilator {
    public double getOverPayment(double creditsumm, double monthlyPayment, double interestRate) {
        double overPayment = 0;
        int count = 0;
        for (int i = 1; creditsumm > monthlyPayment; i++) {
            creditsumm = (creditsumm - monthlyPayment);
            count++;
            if (count % 12 == 0 & count >= 12) {
                overPayment = (overPayment + creditsumm * interestRate / 100);
                creditsumm = (creditsumm + creditsumm * interestRate / 100);
            }
        }
        return overPayment;
    }


}
