package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int rsl =  Factorial.calc(5);
        int exp = 120;
        assertThat(rsl, is(exp)); /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl =  Factorial.calc(0);
        int exp = 1;
        assertThat(rsl, is(exp)); /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
    }
}