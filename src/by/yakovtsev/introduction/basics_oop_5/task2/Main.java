package by.yakovtsev.introduction.basics_oop_5.task2;

public class Main {

    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.addProduct("product1", 1.2);
        payment.addProduct("product2", 1.2);
        payment.addProduct("product3", 4);

        payment.showProducts();
    }


}
