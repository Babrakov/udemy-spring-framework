package ru.infoza.udemyspringframework.enterprise.data;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataService {
    public List<Integer> getData() {
        return List.of(20, 30, 40);
    }
}