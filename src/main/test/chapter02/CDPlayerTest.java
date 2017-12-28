package chapter02;

import chapter02.soundsystem.MediaPlayer;
import chapter02.soundsystem.TrackCounterConfig;
import chapter02.soundsystem.service.CompactDisc;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by sunleic on 2017/12/13.
 * Version by ${VERSION}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    //public MediaPlayer mediaPlayer;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(compactDisc);
    }

    @Test
    public void play() {
        //mediaPlayer.play();
        assertEquals("Playing:Sgt.Peppers Lonely Hearts Club Band." + " by The Beatles\n", log.getLog());
        //assertEquals("Sgt.Peppers Lonely Hearts Club Band.\n" + "The Beatles\n", log.getLog());
    }
}
