package ru.example.filter;

import java.util.List;

public class FilterApplication {
    public static void main(String[] args) {
        filter(List.of(1, 2, 3, 4, 5).toArray(),new FilterUtil());
    }

    private static void filter(Object[] array, Filter filter) {
        for (Object o : array) {
            System.out.println(filter.apply(o));
        }
    }
}

