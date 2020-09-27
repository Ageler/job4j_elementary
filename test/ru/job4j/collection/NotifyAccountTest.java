package ru.job4j.collection;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NotifyAccountTest extends TestCase {

    public void testSent() {
        List<Account> accounts = List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));

    }

    public void testNotSent() {
        List<Account> accounts = List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("123", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("123", "Petr Arsentev", "eDer3432f")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));

    }
}