package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task8;

//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
public class Main {
    public static void main(String[] args) {


        Shop shop = new Shop(
                new Costomer("Pupkin", "Bob", "Bobovich", "Moscow"),
                new Costomer("Aupkin", "Bob", "Aobovich", "Vilnus"),
                new Costomer("Zupkin", "Bil", "Bibovich", "Grodno"),
                new Costomer("Nupkin", "Ril", "Bibovich", "Gomel"),
                new Costomer("Agukin", "Alex", "Alexovich", "Minsk")
        );

        System.out.println("Sort by name: ");
        shop.sortCostomer(shop.getCostomers());

        System.out.println("Filter by credit number card: ");
        shop.filterCardNumber(100, 300);

    }
}
