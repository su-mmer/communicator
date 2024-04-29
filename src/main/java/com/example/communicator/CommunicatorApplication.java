package com.example.communicator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@SpringBootApplication
public class CommunicatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunicatorApplication.class, args);
    }

    @GetMapping(value = "/")
    public String doGetHelloWorld() {
        return "Hello Communicator";
    }

}
