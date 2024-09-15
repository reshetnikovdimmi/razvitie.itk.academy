package ru.example.collectionCount;

import java.util.HashMap;
import java.util.Map;

public class CountApplication {
    public static void main(String[] args) {
              System.out.println(arrayToMap(new Object[]{ "two", "three", "four", "five", "one", "two", "three", 1,2,2,3}));
    }
    public static Map<Object, Integer> arrayToMap(Object[] array) {
        Map<Object, Integer> result = new HashMap<>();
        for (Object o : array) {
            result.put(o, result.getOrDefault(o, 0) + 1);
        }
        return result;
    }
}
