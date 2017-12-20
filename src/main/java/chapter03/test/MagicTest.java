package chapter03.test;

import chapter03.MagicBean;
import chapter03.service.impl.MagicExistsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

public class MagicTest {

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean getMagicBean() {
        return new MagicBean();
    }
}
