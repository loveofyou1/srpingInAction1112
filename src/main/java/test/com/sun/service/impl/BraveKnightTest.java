package test.com.sun.service.impl;

import chapter01.com.sun.service.Quest;
import chapter01.com.sun.service.impl.BraveKnight;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * BraveKnight Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十一月 12, 2017</pre>
 */
public class BraveKnightTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: embarkOnQuest()
     */
    @Test
    public void testEmbarkOnQuest() throws Exception {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }


}
