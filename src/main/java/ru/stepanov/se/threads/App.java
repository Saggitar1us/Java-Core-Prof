package ru.stepanov.se.threads;

import java.util.concurrent.CountDownLatch;

/**
 * @author Aleksei Stepanov
 */


public class App {

    private static final int CARS_COUNT = 4;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        final Race race = new Race(CARS_COUNT, new Road(60), new Tunnel(), new Road(40));
        final Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }

        CountDownLatch countDownLatch = race.getCountdown();

        countDownLatch.await();

        synchronized (race) {
            race.notifyAll();
        }

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");

        race.resetCountdown();

        countDownLatch = race.getCountdown();

        countDownLatch.await();

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }

}
