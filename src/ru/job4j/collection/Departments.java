package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
              tmp.add(start + "/" + el);  // tmp.add start + "/" + el
            }
        }
        List<String> rsl = new ArrayList<>();
        return rsl;
    }

    public void sortAsc(List<String> orgs) {
        Collections.sort(orgs, Collections.reverseOrder());
    }

    public void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}
