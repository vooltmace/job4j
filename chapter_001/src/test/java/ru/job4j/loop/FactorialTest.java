package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result, Matchers.is(120)); //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
    }


    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        assertThat(result, Matchers.is(1)); //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
    }
}