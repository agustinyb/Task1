package com.task.runtime;


public class Task {


    public boolean startTime = false;
    public boolean endTime = false;

    public void welcome() throws InterruptedException {

        startTime = true;
        System.out.println("Hi agustin");
        endTime = true;
    }

    private static void GetSecond() throws InterruptedException {
        Thread.sleep(1);
    }

    public void TaskRunTime() throws InterruptedException {

        String time = "";
        String lastTime = "";
        int milliSeconds = 0;
        int seconds = 0;
        int minutes = 0;
        int hour = 0;

        if (startTime == true) {

            outerloop:
            for (hour = 0; hour < 60; hour++) {

                for (minutes = 0; minutes < 60; minutes++) {

                    for (seconds = 0; seconds < 60; seconds++) {
                        GetSecond();

                        for (milliSeconds = 0; milliSeconds < 100; milliSeconds++) {

                            time = (hour + ":" + minutes + ":" + seconds + ":" + milliSeconds);
                            lastTime = time;

                        }
                        if (endTime == true) {
                            break outerloop;
                        }
                    }

                }

            }
        }
        System.out.println(lastTime);
    }

}








