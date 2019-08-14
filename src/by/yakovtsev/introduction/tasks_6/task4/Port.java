package by.yakovtsev.introduction.tasks_6.task4;

import java.util.ArrayList;
import java.util.List;

public class Port {

    private List<Ship> store;
    private static final int maxShipsInTunel = 5;
    private static final int minShipsInTunel = 0;
    private int shipsCounter = 0;

    public Port() {
        store = new ArrayList<>();
    }

    public synchronized boolean add(Ship element) {

        try {
            if (shipsCounter < maxShipsInTunel) {
                notifyAll();
                store.add(element);
                String info = String.format("%s + The ship arrived in the port: %s %s", store.size(), element.getSize(), Thread.currentThread().getName());
                System.out.println(info);
                shipsCounter++;

            } else {
                System.out.println(store.size() + "> There is no place for a ship in the port: " + Thread.currentThread().getName());
                wait();
                return false;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    public synchronized Ship get() {

        try {
            if (shipsCounter > minShipsInTunel) {
                notifyAll();
                for (Ship ship : store) {
                        shipsCounter--;
                        System.out.println(store.size() + "- The ship is taken from the port: " + Thread.currentThread().getName());
                        store.remove(ship);
                        return ship;
                }
            }
            System.out.println("0 < There are no ships in the port");
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
