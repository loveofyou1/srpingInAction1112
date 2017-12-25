package chapter04.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 使用"环绕注解"来增加前后置动作，定义切面方式
 */
@Aspect
public class Audience2 {
    @Pointcut("execution(* chapter04.service.Performance.performance(..))")
    public void performance() {
    }

    @Around("performance()")
    public void wactchPerformances(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("silence cellphone");
            System.out.println("Taking Seats");
            joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP");
        } catch (Throwable throwable) {
            System.out.println("Demanding Refund!");
            throwable.printStackTrace();
        }
    }
}
