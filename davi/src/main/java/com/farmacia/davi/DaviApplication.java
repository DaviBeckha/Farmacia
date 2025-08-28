package com.farmacia.davi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaviApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaviApplication.class, args);
	}



    @GetMapping("/Hello")
    public String hello(@RequestParam (value = "nome", defaultValue = "World") String name){
        return String.format("Hello, %s!", name);
    }
}
