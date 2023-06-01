package com.example.demo.controller;

import com.example.demo.model.TestModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class TestController {
    @GetMapping

    public ResponseEntity<TestModel> get(){
        TestModel testModel = new TestModel();
        testModel.setModel("test");
        ResponseEntity<TestModel> testModelResponseEntity = new ResponseEntity<>(testModel, HttpStatus.OK);
        return testModelResponseEntity;
    }
}
