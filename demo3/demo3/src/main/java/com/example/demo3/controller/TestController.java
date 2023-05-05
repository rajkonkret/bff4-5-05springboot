package com.example.demo3.controller;

import com.example.demo3.controller.domain.TestClass;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "Radek";
    }

    @GetMapping("/test")
    public ResponseEntity<String> test2() {
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }

//    localhost:4040/test/10
    @GetMapping("/test/{id}")
    public String test3(@PathVariable String id){
        return id;
    }


//    localhost:4040/test/param?name=Radek
    @GetMapping("test/param")
    public String test4(@RequestParam String name){
        return name;
    }
    @PostMapping("users")
    public String users(@Valid @RequestBody TestClass req) {
        System.out.println(req.getName());
        System.out.println(req.toString());
        return "OK";
    }
}
