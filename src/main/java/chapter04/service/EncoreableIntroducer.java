package chapter04.service;

import chapter04.service.impl.DefaultEncoreable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "chapter04.service.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
