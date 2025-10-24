package ru.infoza.udemyspringframework.enterprise.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.infoza.udemyspringframework.enterprise.data.DataService;

@Component
public class BusinessService {
    @Autowired
    private DataService dataService;

    public int calculateSum() {
//        List<Integer> data = dataService.getData();
//        return data.stream().reduce(Integer::sum).get();
        return dataService.getData().stream().mapToInt(Integer::intValue).sum();
    }
}