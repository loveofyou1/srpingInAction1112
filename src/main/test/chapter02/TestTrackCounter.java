package chapter02;

import chapter02.soundsystem.TrackCounter;
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

/**
 * 测试TrackCounter类中的切面
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TestTrackCounter {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private TrackCounter trackCounter;

    @Test
    public void testTrackCounter() {
        compactDisc.playTrack(1);
        compactDisc.playTrack(2);
        compactDisc.playTrack(3);
        compactDisc.playTrack(3);
        compactDisc.playTrack(3);
        compactDisc.playTrack(3);
        compactDisc.playTrack(7);
        compactDisc.playTrack(7);

        assertEquals(1, trackCounter.getPlayCount(1));
        assertEquals(1, trackCounter.getPlayCount(2));
        assertEquals(4, trackCounter.getPlayCount(3));
        assertEquals(0, trackCounter.getPlayCount(4));

        assertEquals(0, trackCounter.getPlayCount(5));
        assertEquals(0, trackCounter.getPlayCount(6));
        assertEquals(2, trackCounter.getPlayCount(7));

    }
}
