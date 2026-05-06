package com.example.Stream;

public class ThreadclassLambda {
	public static void main(String[] args) {
//Runnable interface
        Runnable task = () -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        };

        for (int i = 1; i <= 5; i++) {
            new Thread(task).start();
        }
      //Thread Class  
        for (int i = 1; i <= 5; i++) {
            int threadNumber = i;   // effectively final

            Thread t = new Thread(() -> {
                System.out.println("Thread " + threadNumber + " is running");
            });

            t.start();
        }
    }
}
