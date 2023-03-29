package test01;

public class CreditCalculatorFactory {
    public CreditCalcilator chooseCreditCalculator (String typeOfClient) throws Exception {
        if (typeOfClient == null || typeOfClient.isEmpty()) return null;
        switch (typeOfClient) {
            case "human":
                return (new CreditCalculatorH());
            case "business":
                return (new CreditCalculatorB());
            default:
                throw  new Exception();
        }

    }
}