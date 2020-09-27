package ru.job4j.collection;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ConvertMatrix2ListTest extends TestCase {

    public void testToList() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expect = List.of(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
}