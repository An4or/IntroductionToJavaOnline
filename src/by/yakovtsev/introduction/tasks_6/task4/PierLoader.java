package by.yakovtsev.introduction.tasks_6.task4;

public class PierLoader implements Runnable {
    private Port port;

    public PierLoader(Port port) {
        this.port = port;

    }

    @Override
    public void run() {

        while (true) {
            try {

                //Time to load the goods
                Thread.sleep(500);
                Ship ship = port.get();
                if(ship!=null)
                    while (ship.countCheck()){
                        Thread.sleep(100);
                        ship.add(10);
                        System.out.println(ship.getCount() + " Loaded ship. " + Thread.currentThread().getName());
                    }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
