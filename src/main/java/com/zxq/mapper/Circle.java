package com.zxq.mapper;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("cir")
public class Circle implements  Shape {
    @Override
    public String sayMyShape() {
        return "我是一个大大的圆";
    }
}
