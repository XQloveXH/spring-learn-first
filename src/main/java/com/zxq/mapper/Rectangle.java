package com.zxq.mapper;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("rec")
public class Rectangle implements Shape {
    @Override
    public String sayMyShape() {
        return "我是一个长方形 修改";
    }
}
