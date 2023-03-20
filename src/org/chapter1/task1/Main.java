package org.chapter1.task1;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class Main {

    /**
     * find count of characters is already presented in a string
     * @param args
     */
    public static void main(String[] args) {

        String str = "lol";
        System.out.println(solve(str));

    }

    private static Map<Character, Integer> solve(String str) {
        Map<Character, Integer> result = new HashMap<>();

        for(int i=0; i<str.length(); i++) {

           char ch = str.charAt(i);

           if(!result.containsKey(ch)) {
               result.put(ch, 1);
           } else {
               int frequency = result.get(ch);
               result.put(ch, ++frequency);
           }

        }

        return result;
    }
}
