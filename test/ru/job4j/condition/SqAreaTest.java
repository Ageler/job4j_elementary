package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        int inP = 4;
        int inK = 1;
        double expected = 1.0;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square1() {
        int inP = 6;
        int inK = 2;
        double expected = 2.0;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }

}