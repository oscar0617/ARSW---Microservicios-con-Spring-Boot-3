package com.microservicehello.hello.Controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DateController {

    @GetMapping("/date")
    public LocalDate date(){
        return LocalDate.now();
    }
}
