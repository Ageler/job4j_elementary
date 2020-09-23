package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        byte [] chLeftSum = left.getBytes();
        byte [] chRightSum = right.getBytes();
        int l1 = chLeftSum.length;
        int l2 = chRightSum.length;
        int minLength = Math.min(l1, l2);
        for (int i = 0; i < minLength ; i++) {
            if(chLeftSum[i] != chRightSum[i]) {
                return chLeftSum[i] - chRightSum[i];
            }
        }
        if(l1 != l2) {
            return l1 - l2;
        }
        else return 0;
    }

    public static void main(String[] args) {
        StringCompare stringCompare = new StringCompare();
        System.out.println(stringCompare.compare("one", "two"));
    }
}
