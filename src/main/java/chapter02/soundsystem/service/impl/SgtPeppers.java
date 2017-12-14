package chapter02.soundsystem.service.impl;

import chapter02.soundsystem.service.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Created by sunleic on 2017/12/13.
 * Version by ${VERSION}
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt.Peppers Lonely Hearts Club Band.";
    private String artlist = "The Beatles";

    public void play() {
        System.out.println("Playing:" + title + " by " + artlist);
    }
}
