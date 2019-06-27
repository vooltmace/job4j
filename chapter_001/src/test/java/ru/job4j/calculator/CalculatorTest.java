package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDiv2On2Then10()  {
        Calculator calc = new Calculator();
        double result = calc.div(20D, 2D);
        double expected = 10D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMui10n3Then30()  {
        Calculator calc = new Calculator();
        double result = calc.mui(10D, 3D);
        double expected = 30D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSub18n6Then12()  {
        Calculator calc = new Calculator();
        double result = calc.sub(18D, 6D);
        double expected = 12D;
        assertThat(result, is(expected));
    }
}
