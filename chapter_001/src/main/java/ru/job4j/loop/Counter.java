package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int result = 0;

        for (int index = start; index <= finish; index += 2) {
            result = result + index;
        }
        return result;
    }
}