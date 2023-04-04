package test2;

import java.util.Scanner;

class CalculatorMain {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();

     /*   static String Calc (String input1) {


        }
        */
        String[] arithOperator = {"+", "-", "/", "*"}; // список арифметических операций
        int arithOperatorIndex = -1;
        ConvertetToRoman convertetToRoman = new ConvertetToRoman();
        // проверка наличия в строке операции из списка
        for (int i = 0; i < arithOperator.length; i++) {
            if (input1.contains(arithOperator[i])) {
                arithOperatorIndex = i;
                break;
            }
        }
        if (arithOperatorIndex == -1) throw new Exception();


        CalculatorFactoty getNewCalculator = new CalculatorFactoty();
        String[] split = input1.split(" ");


        if (convertetToRoman.isRoman(split[0]) == convertetToRoman.isRoman(split[2])) {
            if (convertetToRoman.isRoman(split[0])) {
                getNewCalculator.chooseCalculatorType("ROMAN").getDataNum(split[0], split[1], split[2]);
            } else
                getNewCalculator.chooseCalculatorType("ARABIC").getDataNum(split[0], split[1], split[2]);
        } else throw new Exception();
    }

}
