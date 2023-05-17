package net.javamicro.employeeservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope    // this annotation will force this spring bean to reload the configuration, it will trigger the refresh event to reload the configuration for this MessageController Spring bean
public class MessageController {

    @Value("${spring.boot.message}")  //we use this annotation to retrieve a value for this property from the configuration
    private String message;

    @GetMapping("/users/message")
    public String message(){
        return message;
    }
}
