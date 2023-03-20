package org.chapter1.task3;

public class Main {
    public static void main(String[] args) {
        String str = "deliberately";
        System.out.println(reverseString(str));
        String str1 = "hello how are you doing";
        System.out.println(reverseLine(str1));
    }

    private static String reverseString(String str) {
        StringBuilder builder = new StringBuilder();
        for(int i = str.length() - 1; i >=0; i--) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }

    private static String reverseLine(String str) {
        String [] words = str.split(" ");
        StringBuilder builder = new StringBuilder();
        String reversedString;
        for(int i = words.length -1; i >= 0; i--) {
            reversedString = reverseString(words[i]);
            builder.append(reversedString + " ");
        }
        return builder.toString().trim();
    }

}
