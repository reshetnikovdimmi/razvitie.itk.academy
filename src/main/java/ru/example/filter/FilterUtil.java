package ru.example.filter;

import java.util.List;

public class FilterUtil implements Filter{
    @Override
    public Object apply(Object o) {
        return List.of(o);
    }
}

