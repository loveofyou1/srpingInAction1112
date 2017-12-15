package chapter02.soundsystem;

import chapter02.soundsystem.service.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sunleic on 2017/12/15.
 * Version by ${VERSION}
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    @Autowired
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        this.compactDisc.play();
    }
}
