package kyu6.convertStringToCamelCase;

//Complete the method/function so that it converts dash/underscore delimited words into camel casing.
// The first word within the output should be capitalized only if the original word was capitalized
// (known as Upper Camel Case, also often referred to as Pascal case).
//
//        Examples
//        "the-stealth-warrior" gets converted to "theStealthWarrior"
//        "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

import java.util.stream.IntStream;

public class ConvertStringToCamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCase(""));
    }

    public static String toCamelCase(String s) {
        String[] sa = s.split("_|-");
        if(sa.length < 2) return s;
        StringBuilder sb = new StringBuilder(s.length()-sa.length-1).append(sa[0]);
        IntStream.range(1, sa.length).forEach(i->sb.append(sa[i].substring(0,1).toUpperCase()+sa[i].substring(1,sa[i].length())));

        return sb.toString();
    }
}
