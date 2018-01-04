package learning;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class TestLomHok {

    @Getter(AccessLevel.PROTECTED)
    @Setter
    private String id;
    @Getter
    @Setter
    private String name;

    @NoArgsConstructor
    class Test {
        @Synchronized
        public void helloWorld() {
            System.out.println("hello world!");
        }
    }

    private String age;
}
