package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result;
        // if ....
        if (second > first) {
            result = second;
        } else result = first;
        if (second > third) {
            result = second;
        } else result = third;

        return result;
    }
}