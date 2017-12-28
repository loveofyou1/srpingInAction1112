package chapter02.soundsystem;

import chapter02.soundsystem.service.CompactDisc;
import chapter02.soundsystem.service.impl.BlankDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义为bean，使用aspectj
 */
@Configuration
@EnableAspectJAutoProxy
/**启用AspectJ自动代理*/
public class TrackCounterConfig {
    @Bean
    public CompactDisc sgtPapers() {
        BlankDisc blankDisc = new BlankDisc();
        blankDisc.setTitle("Sgt.Peppers Lonely Hearts Club Band.");
        blankDisc.setArtlist("The Beatles");
        List<String> tracks = new ArrayList<String>();
        tracks.add("Sgt. Pepper' s Lonely Hearts Club Band");
        tracks.add("With a Little Help from My Friends");
        tracks.add("Lucy in the Sky with Diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a hole");
        blankDisc.setTracks(tracks);
        return blankDisc;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
