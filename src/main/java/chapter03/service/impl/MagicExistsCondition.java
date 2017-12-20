package chapter03.service.impl;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements org.springframework.context.annotation.Condition {
    public boolean matches(ConditionContext cdct, AnnotatedTypeMetadata metadata) {
        Environment env = cdct.getEnvironment();
        return env.containsProperty("magic");
    }
}
