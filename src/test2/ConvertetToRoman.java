package test2;

import java.util.TreeMap;

class ConvertetToRoman {
    TreeMap<Character, Integer> romanNumber = new TreeMap<>();
    TreeMap<Integer, String> arabianNumber = new TreeMap<>();

    public ConvertetToRoman() {
        romanNumber.put('I', 1);
        romanNumber.put('V', 5);
        romanNumber.put('X', 10);

        arabianNumber.put(1, "I");
        arabianNumber.put(5, "V");
        arabianNumber.put(10, "X");
    }

    public boolean isRoman(String number) {
        return romanNumber.containsKey(number.charAt(0));
    }

    public String arabicToRoman(int number) {
        String roman = "";
        int arabKey;
        do {
            arabKey = arabianNumber.floorKey(number);
            roman += arabianNumber.get(arabKey);
            number -= arabKey;
        } while (number != 0);
        return roman;
    }

    public int romanToInt(String s) {
        int end = s.length() - 1;
        char[] arr = s.toCharArray();
        int arabian;
        int result = romanNumber.get(arr[end]);
        for (int i = end - 1; i >= 0; i--) {
            arabian = romanNumber.get(arr[i]);

            if (arabian < romanNumber.get(arr[i + 1])) {
                result -= arabian;
            } else {
                result += arabian;
            }

        }
        return result;

    }

}
