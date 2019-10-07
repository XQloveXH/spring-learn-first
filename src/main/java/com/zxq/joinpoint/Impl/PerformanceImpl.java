package com.zxq.joinpoint.Impl;

import com.zxq.joinpoint.Performance;
import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance {
    @Override
    public void performance() {
        System.out.println("我们正在表演中");
        try{
            Integer i = 1;
        }catch (Exception e){
            System.out.println("十分抱歉 我们表演失败了!!!!");
            throw new RuntimeException("十分抱歉 我们表演失败了");
        }
        System.out.println("表演完美结束");
    }

    @Override
    public Boolean ticket() {
        System.out.println("核实该客户网上预约的信息");
        if(1==1){
            return false;
        }
        return true;
    }
}
