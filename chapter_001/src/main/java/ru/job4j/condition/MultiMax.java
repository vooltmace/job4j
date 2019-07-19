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

        if (first > second) {
            result = first;
        } else result = second;

        if (first > third) {
            result = first;
        } else result = third;

        if (third > first) {
            result = third;
        } else result = first;

        if (third > second) {
            result = third;
        } else result = second;

        return result;
    }
}