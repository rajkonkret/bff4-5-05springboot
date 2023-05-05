package com.example.testH2.controller;

import com.example.testH2.MyEntityService;
import com.example.testH2.model.MyEntityResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private final MyEntityService myEntityService;

    public MyController(MyEntityService myEntityService) {
        this.myEntityService = myEntityService;
    }


    public String test() {
        return "test";
    }

    @GetMapping("/enities")
    @ResponseBody
    public ResponseEntity<List<MyEntityResponse>> getEntity(){

        return ResponseEntity.ok(myEntityService.getAll());
    }
}
