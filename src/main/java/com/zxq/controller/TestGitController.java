package com.zxq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.lang.model.element.NestingKind;

@RestController
public class TestGitController {

    @GetMapping("hellogit")
    public String helloGit(){
        return "Hello Git ";
    }
}
