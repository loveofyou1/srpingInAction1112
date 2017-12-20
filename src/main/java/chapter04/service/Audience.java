package chapter04.service;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {

    @Before("execution(** service.Performance.performance(..))")
    public void silenceCellPhone() {
        System.out.println("silence cellphone");
    }

    @Before("execution(** chapter04.service.Performance.performance(..))")
    public void testSuides() {
        System.out.println("Taking Seats");
    }

    @AfterReturning("execution(** service.Performance.performance(..))")
    public void applaud() {
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("execution(** service.Performance.performance(..))")
    public void demandRefund() {
        System.out.println("Demanding Refund!");
    }
}
