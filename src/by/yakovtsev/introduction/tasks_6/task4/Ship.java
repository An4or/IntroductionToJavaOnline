package by.yakovtsev.introduction.tasks_6.task4;

public class Ship {
    private int count;
    private Size size;


    public Ship(Size size) {
        this.size = size;
    }

    public void add(int count) {
        this.count += count;
    }

    public boolean countCheck() {
        if (count >= size.getValue()) {
            return false;
        }
        return true;
    }

    public int getCount() {
        return count;
    }


    public Size getSize() {
        return size;
    }
}
