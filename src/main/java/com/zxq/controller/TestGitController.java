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
    @GetMapping("test2")
    public String test2(){
        return "test2 git   啊啊啊啊啊啊啊啊啊";
    }
    @GetMapping("test3")
    public String test3(){
        return "test3 git";
    }
}
