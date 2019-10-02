package com.zxq.controller;


import com.zxq.mapper.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeController {
    @Autowired
    @Qualifier("rec")
    private  Shape shape;
    @GetMapping("shape")
    public String whatShape(){
            return shape.sayMyShape();
    }

}
