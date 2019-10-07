package com.zxq.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {
    @Pointcut("execution(* com.zxq.joinpoint.Performance.performance(..))")
    public  void performance(){ }

    @Before("performance()")
    public void silenceCellPhones(JoinPoint joinPoint){
        String name = joinPoint.getThis().getClass().getName();
        System.out.println("代理类的名称是 ："+name);
        Signature signature = joinPoint.getSignature();
        System.out.println("signature :"+signature);
        String kind = joinPoint.getKind();
        System.out.println("kind :" + kind);
        System.out.println("观众正在自觉将手机调成静音模式或关机");
    }
    @AfterReturning("performance()")
    public void applause(){
        System.out.println(" 观众开始拍掌鼓励  啪啪啪  ···" );
    }
    @AfterThrowing("performance()")
    public void damandRefund(){
        System.out.println("观众们不满意这次失败的表演");
    }

    @Around("execution(* com.zxq.joinpoint.Performance.ticket(..))")
    public void checkTicket(ProceedingJoinPoint joinPoint){
        System.out.println("客户提交网上预约信息");
        Boolean result = null;
        try {
            result = (Boolean)joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        if(result.equals(true)){
            System.out.println("客户拿到预约门票");
        }else{
            System.out.println("客户信息有错 无法获得门票");
        }

    }
}
