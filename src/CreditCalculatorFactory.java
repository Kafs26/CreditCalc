public class CreditCalculatorFactory {
    public double chooseCreditCalculator (ChekCreditData data) throws Exception{
        if (data.typeOfClient.equals("human"))
            return (new CreditCalculatorH().getOverPayment(data.creditsum, data.monthlyPayment, data.interestRate));
        else if (data.typeOfClient.equals("business"))
            return (new CreditCalculatorB().getOverPayment(data.creditsum, data.monthlyPayment, data.interestRate));
        else throw new Exception();

    }
}
