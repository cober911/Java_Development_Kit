package Homeworks.ls5;

import java.util.concurrent.CountDownLatch;

//Есть пять философов (потоки), которые могут либо обедать либо размышлять.
//Каждый философ должен пообедать три раза. Каждый прием пищи длиться 500 миллисекунд
//После каждого приема пищи философ должен размышлять
//Не должно возникнуть общей блокировки
//Философы не должны есть больше одного раза подряд
public class Main {
    private static final CountDownLatch eatTime = new CountDownLatch(1);

    private static final CountDownLatch sleep = new CountDownLatch(5);
    public static void main(String[] args) {
        Runnable philosopher = () -> {
            try {
                for (int i = 0; i < 3; i++) {
                    System.out.println(Thread.currentThread().getName() + " кушает");
                    eatTime.await();
                    Thread.sleep(500);

                    System.out.println(Thread.currentThread().getName() + " размышляет");
                    Thread.sleep(3000);

                }
                System.out.println(Thread.currentThread().getName() + " ушёл спать");
                sleep.countDown();
//                System.out.println(Thread.currentThread().getName() + " завтракает");
//                eatTime.await();
//                Thread.sleep(500);
//
//                System.out.println(Thread.currentThread().getName() + " размышляет");
//                Thread.sleep(3000);
//
//                System.out.println(Thread.currentThread().getName() + " обедает");
//                eatTime.await();
//                Thread.sleep(500);
//
//                System.out.println(Thread.currentThread().getName() + " размышляет");
//                Thread.sleep(3000);
//
//                System.out.println(Thread.currentThread().getName() + " ужинает");
//                eatTime.await();
//                Thread.sleep(500);
//
//                System.out.println(Thread.currentThread().getName() + " размышляет");
//                Thread.sleep(3000);
//
//                System.out.println(Thread.currentThread().getName() + " ушёл спать");
//                sleep.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread philosopher1 = new Thread(philosopher, "Сократ");
        Thread philosopher2 = new Thread(philosopher, "Аристотель");
        Thread philosopher3 = new Thread(philosopher, "Кант");
        Thread philosopher4 = new Thread(philosopher, "Конфуций");
        Thread philosopher5 = new Thread(philosopher, "Ницше");

        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();

        try {
            Thread.sleep(100); // Подготовка к старту
            eatTime.countDown();
            Thread.sleep(1000);
            sleep.await(); // Ожидаем завершения всех участников
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
