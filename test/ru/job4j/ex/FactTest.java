package ru.job4j.ex;

import junit.framework.TestCase;
import org.junit.Test;

public class FactTest extends TestCase {

    @Test(expected = IllegalArgumentException.class)
    public void testCalc() {
        Fact fact = new Fact();
      int rsl = fact.calc(-1);
    }
}