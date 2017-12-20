package chapter03.service;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public interface Condition {
    boolean matches(ConditionContext cdct, AnnotatedTypeMetadata metadata);
}
