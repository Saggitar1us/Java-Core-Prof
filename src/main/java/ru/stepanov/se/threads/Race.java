package ru.stepanov.se.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/**
 * @author Aleksei Stepanov
 */

public class Race {

    private final ArrayList<Stage> stages;

    private final Integer permissions;

    private CountDownLatch countdown;

    private boolean isEnd = false;

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public CountDownLatch getCountdown() {
        return countdown;
    }

    public void resetCountdown() {
        countdown = new CountDownLatch(permissions);
    }

    public boolean isRaceEnd() {
        if (isEnd) {
            isEnd = true;
        }
        return false;
    }

    public Race(final Integer participants, final Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
        this.countdown = new CountDownLatch(participants);
        this.permissions = participants;
    }
}
