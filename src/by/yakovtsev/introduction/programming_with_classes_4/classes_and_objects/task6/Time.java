package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task6;

import java.time.DateTimeException;
import java.time.LocalTime;

//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд.
public class Time {
    private LocalTime time;
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        try {
           time = LocalTime.of(hour, minute, second);
        } catch (DateTimeException e) {
            time = LocalTime.of(0, 0, 0);
            setHour(hour);
            setMinute(minute);
            setSecond(second);
        }
    }

    public static void main(String[] args) {
        Time time1 = new Time(10, 67, 30);
        System.out.println(time1.toString());
        time1.setHour(25);
        time1.setMinute(48);
        time1.setSecond(50);
        System.out.println(time1.toString());
    }

    public void setTime(LocalTime time) {
        try {
            this.time = time;
        } catch (DateTimeException e) {
            this.time = LocalTime.of(0, 0, 0);
        }

    }

    public void setHour(int hour) {
        try {
            time = LocalTime.of(hour, minute, second);
            this.hour = hour;
        } catch (DateTimeException e) {
            this.time = LocalTime.of(0, minute, second);
            this.hour = 0;
        }

    }

    public void setMinute(int minute) {
        try {
            time = LocalTime.of(hour, minute, second);
            this.minute = minute;
        } catch (DateTimeException e) {
            this.time = LocalTime.of(hour, 0, second);
            this.minute = 0;
        }
    }

    public void setSecond(int second) {
        try {
            time = LocalTime.of(hour, minute, second);
            this.second = second;
        } catch (DateTimeException e) {
            this.time = LocalTime.of(hour, minute, 0);
            this.second = 0;
        }
    }

    public LocalTime getTime() {
        return time;
    }

    public int getHour() {
        return time.getMinute();
    }

    public int getMinute() {
        return time.getMinute();
    }

    public int getSecond() {
        return time.getSecond();
    }

    @Override
    public String toString() {
        return "Time{" +
                "time=" + time +
                '}';
    }
}
