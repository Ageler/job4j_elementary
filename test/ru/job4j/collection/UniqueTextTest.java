package ru.job4j.collection;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class UniqueTextTest extends TestCase {
        @Test
        public void testisEquals() {
            String origin = "My cat eats a mouse and milk";
            String text = "My cat eats milk and a mouse";
            assertThat(UniqueText.isEquals(origin, text), is(true));
        }

        @Test
        public void testisNotEquals() {
            String origin = "My cat eats a mouse";
            String text = "A mouse is eaten by a cat";
            assertThat(UniqueText.isEquals(origin, text), is(false));
        }
    }
