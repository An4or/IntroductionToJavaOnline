package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task8;

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
