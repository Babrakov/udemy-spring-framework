package ru.infoza.udemyspringframework.enterprise.web;

import org.springframework.stereotype.Component;
import ru.infoza.udemyspringframework.enterprise.business.BusinessService;

@Component
public class MyWebController {

    private final BusinessService businessService;

    public MyWebController(BusinessService businessService) {
        this.businessService = businessService;
    }

    public int returnValueFromBusinessService() {
        return businessService.calculateSum();
    }

}