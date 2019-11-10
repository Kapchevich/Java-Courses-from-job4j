package ru.job4j.single;
import org.junit.Test;
import ru.job4j.tracker.Item;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleTest {
    @Test
    public void Single1() {
        TrackerSinglePrivateStaticFinalClass tracker = TrackerSinglePrivateStaticFinalClass.getInstance();
        TrackerSinglePrivateStaticFinalClass tracker1 = TrackerSinglePrivateStaticFinalClass.getInstance();
        assertThat(tracker, is(tracker1));

    }
    @Test
    public void Single2() {
        TrackerSingleStaticField tracker = TrackerSingleStaticField.getInstance();
        TrackerSingleStaticField tracker1 = TrackerSingleStaticField.getInstance();
        assertThat(tracker, is(tracker1));
    }
    @Test
    public void Single3() {
        TrackerSingleStaticFinalField tracker = TrackerSingleStaticFinalField.getInstance();
        TrackerSingleStaticFinalField tracker1 = TrackerSingleStaticFinalField.getInstance();
        assertThat(tracker, is(tracker1));
    }
    @Test
    public void Single4() {
        TrackerSingleEnum tracker = TrackerSingleEnum.INSTANCE;
        TrackerSingleEnum tracker1 = TrackerSingleEnum.INSTANCE;
        assertThat(tracker, is(tracker1));
    }



}
