package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.sum(0, 10);
        assertThat(result, Matchers.is(30));
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
    }
    @Test
    public void whenSumEvenNumbersFrom1To11ThenThirty() {
        Counter counter = new Counter();
        int result = counter.sum(1, 11);
        assertThat(result, Matchers.is(30));
    }
}