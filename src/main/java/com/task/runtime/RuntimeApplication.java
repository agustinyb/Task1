package com.task.runtime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class RuntimeApplication {

    public static void main(String[] args) throws NoSuchMethodException {
        SpringApplication.run(RuntimeApplication.class, args);

        Task task = new Task();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, press 1 to calculate the time of response or 0 for exit");
        int number = keyboard.nextInt();

        if (number == 1) {
            task.TaskRunTime();
        }

        //ByteBuddy byteBuddy = new ByteBuddy();

        //Task task = new Task();
        //task.TaskRunTime();

        //ByteBuddy byteBuddy = new ByteBuddy();

        //Method method = Task.class.getMethod("TaskRunTime");

        //MethodDelegation methodDelegation = MethodDelegation.to(method);

        //byteBuddy.redefine(Task.class).method("TaskRunTime").intercept(methodDelegation).make();

        //task.TaskRunTime();


    }
}










