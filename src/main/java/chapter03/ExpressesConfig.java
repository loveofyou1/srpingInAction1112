package chapter03;

import chapter02.soundsystem.service.impl.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/chapter03/app.properties")
public class ExpressesConfig {

    @Autowired
    Environment environment;

    @Bean
    public BlankDisc disc() {
        return new BlankDisc(environment.getProperty("disc.title"),
                environment.getProperty("disc.artist"));
    }
}
