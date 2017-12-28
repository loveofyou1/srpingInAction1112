package chapter02.soundsystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试参数话的通知来记录播放
 */
@Aspect
public class TrackCounter {
    public Map<Integer, Integer> trackCounter = new HashMap<Integer, Integer>();

    @Pointcut("execution(* chapter02.soundsystem.service.CompactDisc.playTrack(int))" + "&& args(trackNumber)")
    public void playTrack(int trackNumber) {
    }

    @Before("playTrack(tractNumber)")
    public void counterTrack(int tractNumber) {
        int counterCount = getPlayCount(tractNumber);
        trackCounter.put(tractNumber, counterCount + 1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounter.containsKey(trackNumber) ? trackCounter.get(trackNumber) : 0;
    }
}
