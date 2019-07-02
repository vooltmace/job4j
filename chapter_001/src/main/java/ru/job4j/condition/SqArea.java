package ru.job4j.condition;

/**
 *Периметр:
 * p = 2(w+h)
 * Длина:
 * w = h*k
 * Подставляем в периметр:
 * p = 2(h*k +h)
 * Упрощаем:
 * p = 2h(k+1)
 * Выражаем высоту:
 * h = p/(2(k+1))
 * формула площади:
 * s = h*w
 */

class SqArea {
     int square(int p, int k) {
        int height = p / (2 * (k + 1));
        int width = height * k;
        return height * width;
    }
}