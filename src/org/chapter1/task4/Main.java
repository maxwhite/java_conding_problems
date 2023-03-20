package org.chapter1.task4;

public class Main {
    public static void main(String[] args) {

        String str = "123423423423";

        System.out.println(stringContainsOnlyDigits(str));
        System.out.println(stringContainsOnlyDigitsRegexp(str));

    }

    private static boolean stringContainsOnlyDigits(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean stringContainsOnlyDigitsRegexp(String str) {
        return str.matches("[0-9]+");
    }

}
