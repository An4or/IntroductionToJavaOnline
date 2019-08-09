package by.yakovtsev.introduction.basics_oop_5.task1;

import java.io.IOException;

//Задача 1.
//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить.
public class Main {
    public static void main(String[] args) throws IOException {
        Directoire directoire = new Directoire("src/resources/text/text2");
        File file = new File(directoire, "text2.txt");

        TextFile textFile = new TextFile(directoire, file);

//        TextFile textFile = new TextFile();
//        textFile.create("src/resources/text/text2");
//        textFile.create("src/resources/text/text2/text2.txt");
        textFile.printConsole();
        textFile.addText("TEXT ADDED");
        textFile.printConsole();
        textFile.deleted();
        textFile.create(directoire.getPath());
        textFile.create(directoire.getPath() +"/" + file.getName());
        textFile.rename("text3.txt");





    }
}
