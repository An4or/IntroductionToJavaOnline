package by.yakovtsev.introduction.tasks_6.task4;

import java.util.Random;

public class ShipGenerator implements Runnable {

    private Port port;
    private int shipCount;

    public ShipGenerator(Port port, int shipCount) {
        this.port = port;
        this.shipCount = shipCount;
    }

    @Override
    public void run() {
        int count = 0;
        while (count < shipCount) {
            Thread.currentThread().setName(" Generator ship");
            count++;
            port.add(new Ship(getRandomSize()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private Size getRandomSize() {
        Random random = new Random();
        return Size.values()[random.nextInt(Size.values().length)];
    }
}
