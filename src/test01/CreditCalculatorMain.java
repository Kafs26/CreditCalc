package test01;

public class CreditCalculatorMain {
    public static void main(String[] args) throws Exception {
        CreditData data = new CreditData();
        data.getData();
        CreditCalculatorFactory factory = new  CreditCalculatorFactory();
        CreditCalcilator creditCalcilator = factory.chooseCreditCalculator(data.typeOfClient);
        creditCalcilator.getOverPayment(data.creditsum, data.monthlyPayment, data.interestRate);
    }
}
