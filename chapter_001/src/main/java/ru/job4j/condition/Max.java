package ru.job4j.condition;
/**
 * @author Pavel Romanov (vooltmace@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Отвечает на вопросы.
     * @param left;
     * @return result.
     */
    public int max(int left, int right) {
        int result = left;
        result = (left < right) ? left : right;
        result = (left > right) ? left : right;
        return result;
    }
}