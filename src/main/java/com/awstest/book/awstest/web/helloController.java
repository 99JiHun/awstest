package com.awstest.book.awstest.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.awstest.book.awstest.web.dto.helloResponseDto;

@RestController
public class helloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public helloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new helloResponseDto(name,amount);
    }
}
