package by.yakovtsev.introduction.tasks_6.task4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* Задание 4. Многопоточность. Порт . Корабли заходят в порт для
разгрузки/загрузки контейнеров. Число контейнеров, находящихся в текущий момент
в порту и на корабле, должно быть неотрицательным и превышающим заданную
грузоподъемность судна и вместимость порта. В порту работает несколько причалов.
У одного причала может стоять один корабль. Корабль может загружаться у причала
или разгружаться.
* */
public class Main {

    public static void main(String[] args) {
        System.out.println("Available number of cores: " + Runtime.getRuntime().availableProcessors());

        Port port = new Port();

        ShipGenerator shipGenerator = new ShipGenerator(port, 10);

        PierLoader pierLoader1 = new PierLoader(port);
        PierLoader pierLoader2 = new PierLoader(port);
        PierLoader pierLoader3 = new PierLoader(port);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        service.execute(shipGenerator);
        service.execute(pierLoader1);
        service.execute(pierLoader2);
        service.execute(pierLoader3);

        service.shutdown();
    }
}
