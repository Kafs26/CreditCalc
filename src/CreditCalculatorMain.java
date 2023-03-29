public class CreditCalculatorMain {
    public static void main(String[] args) throws Exception {
        ChekCreditData testOne = new ChekCreditData();
        testOne.chekData();
        CreditCalculatorFactory fin = new  CreditCalculatorFactory();
        System.out.println(fin.chooseCreditCalculator(testOne));
    }
}
