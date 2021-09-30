package kyu6.arrayDiff;

import java.util.function.*;
import java.util.stream.*;

/*
 Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}

If a value is present in b, all of its occurrences must be removed from the other:

Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */

public class ArrayDiff {
    public static void main(String[] args) {
        int[] res = arrayDiff(new int[] {1,2,2,2,3}, new int[] {2});

        for(int a: res) System.out.println(a);
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        IntPredicate remove= (i) -> {
            for(int x:b) if(i==x) return false;
            return true;
        };

        return IntStream.of(a).filter(remove).toArray();
    }
}
