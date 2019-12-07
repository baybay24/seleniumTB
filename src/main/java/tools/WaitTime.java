package tools;

import java.util.concurrent.TimeUnit;

public class WaitTime {
    public static void waitingMinutes(int count) {
        try {
            TimeUnit.MINUTES.sleep(count);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitingSeconds(int count) {
        try {
            TimeUnit.SECONDS.sleep(count);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitingMilliseconds(int count) {
        try {
            TimeUnit.MILLISECONDS.sleep(count);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
