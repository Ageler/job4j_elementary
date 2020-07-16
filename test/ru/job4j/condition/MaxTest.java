package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

    public class MaxTest {
        @Test
        public void whenMax1To2Then2() {
            int result = Max.max(1, 2);
            assertThat(result, is(2));
        }

        @Test
        public void whenMax2To2Then2() {
            int result = Max.max(2, 2, 7);
            assertThat(result, is(7));
        }

        @Test
        public void whenMax1To2Then3() {
            int result = Max.max(2, 2, 2, 9);
            assertThat(result, is(9));
        }

    }
