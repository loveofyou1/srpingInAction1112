package chapter04.service;


import org.aspectj.lang.annotation.*;

/**
 * 增加切入点方法，承载前置和后置方法
 */
@Aspect
public class Audience1 {
    @Pointcut("execution(* chapter04.service.Performance.performance(..))")
    public void performance() {

    }

    @Before("performance()")
    public void silenceCellPhone() {
        System.out.println("silence cellphone");
    }

    @Before("performance()")
    public void testSuides() {
        System.out.println("Taking Seats");
    }

    @AfterReturning("performance()")
    public void applaud() {
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding Refund!");
    }
}
