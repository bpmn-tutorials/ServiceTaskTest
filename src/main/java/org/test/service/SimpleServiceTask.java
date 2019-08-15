package org.test.service;

import java.util.concurrent.TimeUnit;

public class SimpleServiceTask {

    public void sayHello(Object obj) {
        System.out.println("Hello world from the Java Service Task.");
    }

    public String sayHelloTo(Object obj) {
        sayHello(obj);
        return "Hello, " + obj;
    }

    public void waitInterval(Integer seconds) {
        System.out.println("Start waiting for " + seconds + " seconds.");
        wait(Math.max(seconds, 3));
        System.out.println("Waiting finished successfully.");
    }

    public void waitInterval(Float minutes) {
        int seconds = (int)(minutes * 60);
        waitInterval(seconds);
    }

    private void wait(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds - 3);
            for (int i = 3; i > 0; i--) {
                System.out.println("Countdown: " + i);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
