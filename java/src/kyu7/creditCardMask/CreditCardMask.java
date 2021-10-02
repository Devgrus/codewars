package kyu7.creditCardMask;

import java.util.stream.IntStream;

public class CreditCardMask {
    public static void main(String[] args) {
        System.out.println(maskify("4545454545345345"));
    }

    public static String maskify(String str) {
        int len = str.length();
        int noMaskLength = 4;
        if(len <= noMaskLength) return str;
        StringBuilder res = new StringBuilder(len);

        IntStream.range(0, len-noMaskLength).forEach(i->res.append('#'));
        res.append(str.substring(len-noMaskLength));
        return res.toString();
    }
}
