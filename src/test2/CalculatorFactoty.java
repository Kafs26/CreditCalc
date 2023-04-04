package test2;

class CalculatorFactoty {
    public CalculateData chooseCalculatorType(String typeOfData) throws Exception {
        if (typeOfData == null || typeOfData.isEmpty()) return null;
        switch (typeOfData) {
            case "ROMAN":
                return (new RomanCalculator());
            case "ARABIC":
                return (new ArabicCalculator());
            default:
                throw new Exception();
        }

    }
}
