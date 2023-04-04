package test2;

class RomanCalculator implements CalculateData {
    @Override
    public void getDataNum(String xIn, String arithOperator, String yIn) throws Exception {
        ConvertetToRoman convertetToRoman = new ConvertetToRoman();
        int x = convertetToRoman.romanToInt(xIn);
        int y = convertetToRoman.romanToInt(yIn);

        switch (arithOperator) {
            case "+":
                System.out.println(convertetToRoman.arabicToRoman(x + y));
                break;
            case "-":
                if (x<y)  throw new Exception();
                System.out.println(convertetToRoman.arabicToRoman(x - y));
                break;
            case "*":
                System.out.println(convertetToRoman.arabicToRoman(x * y));
                break;
            case "/":
                if (y == 0) {
                    throw new Exception();
                }
                System.out.println(convertetToRoman.arabicToRoman(x / y));
                break;
        }

    }

}
