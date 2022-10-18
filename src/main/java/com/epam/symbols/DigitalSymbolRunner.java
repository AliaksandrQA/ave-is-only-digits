package main.java.com.epam.symbols;

public class DigitalSymbolRunner {
    public static void main(String[] args) {
        String str = "123456789cat";
        boolean isTotallyNumeric = hasOnlyDigits(str);
        showResult(isTotallyNumeric);
    }

    private static boolean hasOnlyDigits(String str) {
        boolean isNumeric = str.chars().allMatch(x -> Character.isDigit(x));
        return isNumeric;
    }

    private static void showResult(boolean isNumeric) {
        System.out.println(isNumeric);
    }
}
