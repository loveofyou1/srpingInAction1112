package chapter02.mianTest;

import chapter02.springidol.service.Perfomer;
import chapter02.springidol.service.PerformanceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JugglerTest {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
        Perfomer perfomer = (Perfomer) ctx.getBean("poeticDuke");
        perfomer.perform();
    }
}
