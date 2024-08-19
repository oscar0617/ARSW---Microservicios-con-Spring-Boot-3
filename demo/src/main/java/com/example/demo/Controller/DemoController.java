package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/application")
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    private String retorno1;
    private String retorno2;
    private String retorno3;

    @GetMapping("/demo")
    public String demoController(){
        try {
            String url = "http://localhost:8081/hello/world";
            retorno1 = restTemplate.getForObject(url, String.class);
            String url1 = "http://localhost:8082/hello/date";
            retorno2 = restTemplate.getForObject(url1, String.class);
            String url2 = "http://localhost:8083/hello/day";
            retorno3 = restTemplate.getForObject(url2, String.class);
            return retorno1 + " " + retorno2 + " " + retorno3;
        } catch (Exception e) {
            return "Error occurred: " + e.getMessage();
        }
    }


}
