package ru.stepanov.se.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class Task {

    private static final class ThreadA extends Thread{
        ThreadA() {
            System.out.print("A");
        }
    }

    private static final class ThreadB extends Thread {
        ThreadB() {
            System.out.print("B");
        }
    }

    private static final class ThreadC extends Thread {
        ThreadC() {
            System.out.print("C");
        }
    }

    public static void main(String[] args) {
        final ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.submit(new ThreadA());
            executorService.submit(new ThreadB());
            executorService.submit(new ThreadC());
            System.out.print(" | ");
        }
        executorService.shutdown();
    }
}
