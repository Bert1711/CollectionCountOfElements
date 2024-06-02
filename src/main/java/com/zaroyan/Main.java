package com.zaroyan;

import java.util.Map;

/**
 * @author Zaroyan
 */
public class Main {
    public static void main(String[] args) {
        // Пример использования с массивом строк
        String[] stringArray = {"Дима", "Таня", "Дима", "Оля", "Таня", "Дима"};
        ElementCounter<String> stringCounter = new ElementCounter<>(stringArray);
        Map<String, Integer> stringCountMap = stringCounter.countElements();
        System.out.println(stringCountMap);

        // Пример использования с массивом чисел
        Integer[] intArray = {1, 2, 2, 3, 1, 4, 2};
        ElementCounter<Integer> intCounter = new ElementCounter<>(intArray);
        Map<Integer, Integer> intCountMap = intCounter.countElements();
        System.out.println(intCountMap);
    }
}
