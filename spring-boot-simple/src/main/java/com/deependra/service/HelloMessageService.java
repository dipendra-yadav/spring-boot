package com.deependra.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


//A service to return a message.
@Service
public class HelloMessageService {

    @Value("${name:unknown}")
    private String name;

    public String getMessage() {
        return getMessage(name);
    }

    public String getMessage(String name) {
        return "Hello " + name;
    }

}
