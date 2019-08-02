package by.yakovtsev.introduction.basics_oop_5.task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    List<Product> productList = new ArrayList<>();

    public Payment(){}

    public void showProducts(){
        productList.forEach(System.out::println);
    }


    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(String name, double price) {
        productList.add(new Product(name, price));
    }

    private class Product{
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }



        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
