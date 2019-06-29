package ru.job4j.converter;

/**
 * Корвертор валюты.
 * Romanov Pavel (vooltmace@gmail.com)
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */

    public int rubleToEuro(int value) {
        return 70/value;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return 60/value;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли
     */
    public int dollarToRuble(int value) {
        return 60*value;
    }
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */

    public int euroToRuble(int value) {
        return 70*value;
    }
}