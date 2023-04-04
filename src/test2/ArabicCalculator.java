package test2;

class ArabicCalculator implements CalculateData {

    @Override
    public void getDataNum(String xInput, String arithOperator, String yInput) throws Exception {
        int x = Integer.parseInt(xInput);
        int y = Integer.parseInt(yInput);
               switch (arithOperator) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                if (y == 0) {
                    throw new Exception();
                }
                System.out.println(x / y);
                break;
        }

    }
}
