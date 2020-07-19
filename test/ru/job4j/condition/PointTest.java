package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.closeTo;

public class PointTest {

    @Test
    public void distance3d() {
        Point pointA = new Point(0, 0, 0);
        Point pointB = new Point(0, 0, 1);
        double expected = 1;
        double rsl = pointA.distance3d(pointB);
        assertThat(rsl, closeTo(1, 0.001));
    }

    @Test
    public void distance3d222Point() {
        Point pointA = new Point(0, 0, 0);
        Point pointB = new Point(2, 2, 2);
        double expected = 3.4641;
        double rsl = pointA.distance3d(pointB);
        assertThat(rsl, closeTo(3.4641, 0.001));
    }

    @Test
    public void distance3d0Point() {
        Point pointA = new Point(0, 0, 0);
        Point pointB = new Point(0, 0, 0);
        double expected = 0;
        double rsl = pointA.distance3d(pointB);
        assertThat(rsl, closeTo(0, 0.001));
    }
}