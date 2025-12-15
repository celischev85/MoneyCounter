package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoneyCounterTest {
    @Test
    public void houldCalculateTest() {
        MoneyCounter service = new MoneyCounter();
        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateTest1() {
        MoneyCounter service = new MoneyCounter();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual);
    }
}