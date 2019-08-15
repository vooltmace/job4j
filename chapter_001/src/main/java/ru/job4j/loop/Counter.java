package ru.job4j.loop;

public class Counter {
    public static void main(String[] args) {
        int result = 0;
        for (int index = 0; index <= 10; index += 2) {
            result = result + index; }
        System.out.println(result + ".line");

    }
}
