package java;
// generate a Java program that removes all vowels from a given string

import java.util.regex.Pattern;
public class Troll {
    public static String disemvowel (String str) {
        return Pattern.compile("[aeiouAEIOU]").matcher(str).replaceAll("");
    }
}