package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void answer1() {
        String in = "Привет, Бот.";
        String expected = "Привет, умник.";
        String out = DummyBot.answer(in);
        assertThat(out, is(expected));
    }

    @Test
    public void answer2() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String out = DummyBot.answer(in);
        assertThat(out, is(expected));
    }

    @Test
    public void answer3() {
        String in = "";
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String out = DummyBot.answer(in);
        assertThat(out, is(expected));
    }
}