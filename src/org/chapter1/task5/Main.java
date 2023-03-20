package org.chapter1.task5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String text = "hello, world";
        int[] result = countOfVowelsAndConsonantsLetters(text);
        System.out.println("count of vowels " + result[0]);
        System.out.println("count of consonant " + result[1]);

    }

    private static int[] countOfVowelsAndConsonantsLetters(String str) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Set<Character> consonant = new HashSet<>(Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y' ,'z'));
        int vowelsCount = 0;
        int consonantsCount = 0;
        int [] result = new int[2];
        for(int i = 0; i < str.length(); i++) {
            if( vowels.contains(str.charAt(i)) ) {
                vowelsCount++;
            }
            if(consonant.contains(str.charAt(i))) {
                consonantsCount++;
            }
        }
        result[0] = vowelsCount;
        result[1] = consonantsCount;
        return result;
    }

}
