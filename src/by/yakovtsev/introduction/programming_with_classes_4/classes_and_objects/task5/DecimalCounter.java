package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task5;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
public class DecimalCounter {

    private int countStat;
    private int countCycle;

   public DecimalCounter(){
    }

    public DecimalCounter(int startPosition){
        get(startPosition);
    }

    public static void main(String[] args){
        DecimalCounter counter = new DecimalCounter(15);
        counter.printConsole();
        counter.increase(7);
        counter.printConsole();
        counter.decrease(7);
        counter.printConsole();
    }

    private void get(int startPosition){
        if(startPosition >= 0 && startPosition < 10 ) {
            countStat = startPosition;
            countCycle = 0;

        }else if(startPosition >= 10){
            countStat = startPosition % 10;
            countCycle = startPosition / 10;
        }
    }

    public void printConsole(){
        System.out.println(getCountCycle() + " " + getCountStat());
    }

    public int getCountStat(){
        return countStat;
    }

    public int getCountCycle(){
        return countCycle;
    }



    public int increase(int step){
        for(int i = 0; i < step; i++) {
            if (countStat < 10) {
                countStat++;
            } else {
                countCycle++;
                countStat = 0;
            }
        }
        return countStat;
    }

    public int decrease(int step){
        for(int i = 0; i < step; i++){
            if(countStat >= 0){
                countStat--;
            }else{
                countCycle--;
                countStat = 9;
            }
        }
        return countStat;
    }

}