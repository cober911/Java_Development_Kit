package Seminar5.DZ;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Philosopher extends Thread {
    private final int NUMBER_OF_MEALS = 3;
    private String name;
    private int leftFork;
    private int rightFork;
    private int countEat = 0;
    private final Random random;
    private final Table table;

    public Philosopher(String name, Table table, int leftFork, int rightFork) {
        this.table = table;
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        random = new Random();
    }


    private void eating() throws InterruptedException {
        if (table.raiseTheForks(leftFork, rightFork)) {
            System.out.println(name + " кушает левой: " + (leftFork + 1) + " и правой: " + (rightFork + 1) + " вилкой");
            long randomDelay = ThreadLocalRandom.current().nextLong(3000, 6001);
            Thread.sleep(randomDelay);
            
            table.putTheForks(leftFork, rightFork);
            System.out.println(name + " вкусил: " + ++countEat + " прием пищи");
        }

    }

    private void thinking() throws InterruptedException {
        long randomDelay = ThreadLocalRandom.current().nextLong(100, 2000);
        Thread.sleep(randomDelay);
    }
    
    @Override
    public void run() {
        while (countEat < NUMBER_OF_MEALS) {
            try {
                thinking();
                eating();
            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }
        }

        System.out.println(name + " наелся до отвала");
    }
}