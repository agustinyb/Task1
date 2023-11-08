package com.task.runtime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class RuntimeApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(RuntimeApplication.class, args);


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, press 1 to calculate the time of response or 0 for exit");
        int number = keyboard.nextInt();

        if (number == 1) {
            Task task = new Task();
            task.welcome();
            task.TaskRunTime();

        }

    }

}











