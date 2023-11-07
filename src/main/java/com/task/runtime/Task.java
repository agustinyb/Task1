package com.task.runtime;


public class Task  {

    public void TaskRunTime() {
        System.out.println("Agustin");
        Long timeStart = System.nanoTime();
        Long timeEnd = System.nanoTime();
        Long time = timeEnd - timeStart;
        System.out.println("time taken in nanoseconds " + time);
    }
}
   // @Override
    //public boolean matches(Method method) {
        //return new MethodMatcher {
       // }
    //}


