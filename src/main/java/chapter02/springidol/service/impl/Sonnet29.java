package chapter02.springidol.service.impl;

import chapter02.springidol.service.Poem;

public class Sonnet29 implements Poem {

    private static String[] LINES = {
            "When in disgrace with fortune and men's eyes,",
            "I all alone beweep my outcast state",
            "And trouble deaf heaven with my bootless cries"
    };

    public Sonnet29() {
    }

    public void recite() {
        for (int i = 0; i < LINES.length; i++) {
            System.out.println(LINES[i]);
        }
    }
}
