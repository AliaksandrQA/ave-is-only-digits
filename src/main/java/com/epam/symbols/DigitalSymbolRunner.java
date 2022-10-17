package main.java.com.epam.symbols;

public class DigitalSymbolRunner {
    public static void main(String[] args) {
        String str = "123456789cat";
        isDigital(str);
    }

    private static void isDigital(String str) {
        boolean isNumeric = str.chars().allMatch(x -> Character.isDigit(x));
        System.out.println(isNumeric);
    }
}
