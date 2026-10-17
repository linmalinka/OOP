/*public class test {

    public static void main(String[] args) {

        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);

        // Геттеры
        System.out.println("X: " + v1.getX());
        System.out.println("Y: " + v1.getY());
        System.out.println("Z: " + v1.getZ());

        // Вывод всего вектора
        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);

        // Сеттер
        Vector v3 = new Vector(7, 6, 3);
        v1.setVector(v3);
        System.out.println("v1 after set: " + v1);

        // Сложение
        Vector sum = v1.add(v2);
        System.out.println("v1 + v2: " + sum);

        // Вычитание
        Vector difference = v1.subtract(v2);
        System.out.println("v1 - v2: " + difference);

        // Скалярное произведение
        double dot = v1.dotProduct(v2);
        System.out.println("v1 * v2 (dot): " + dot);

        // Векторное произведение
        Vector cross = v1.crossProduct(v2);
        System.out.println("v1 x v2: " + cross);
    }
}*/

import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        Bubbles bubbles = new Bubbles();

        // Обычный массив
        int[] numbers = {5, 2, 8, 1, 3};
        bubbles.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // Уже отсортированный
        int[] sorted = {1, 2, 3, 4, 5};
        bubbles.sort(sorted);
        System.out.println(Arrays.toString(sorted));

        // В обратном порядке
        int[] reversed = {5, 4, 3, 2, 1};
        bubbles.sort(reversed);
        System.out.println(Arrays.toString(reversed));

        // Одинаковые элементы
        int[] same = {3, 3, 3, 3};
        bubbles.sort(same);
        System.out.println(Arrays.toString(same));

        // Один элемент
        int[] one = {42};
        bubbles.sort(one);
        System.out.println(Arrays.toString(one));

        // Отрицательные числа
        int[] negative = {-3, 5, -1, 0, -7};
        bubbles.sort(negative);
        System.out.println(Arrays.toString(negative));
    }
}