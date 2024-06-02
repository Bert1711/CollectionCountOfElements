package com.zaroyan;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zaroyan
 */

public class ElementCounter<T> {

    private T[] array;

    public ElementCounter(T[] array) {
        this.array = array;
    }

    public Map<T, Integer> countElements() {
        Map<T, Integer> elementCountMap = new HashMap<>();

        for (T element : array) {
            elementCountMap.compute(element, (key, value) -> (value == null) ? 1 : value + 1);

            //  ещё такой вариант:
            //  elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
        }

        return elementCountMap;
    }
}
