package by.yakovtsev.introduction.tasks_6.task2;

import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;

public class Date implements Serializable {
    private LocalDate localDate;
    private int day;
    private int month;
    private int year;

    public Date(){
        localDate = LocalDate.now();
    }
    public Date(String date){
        setLocalDate(date);
    }

    public Date(int day, int month, int year) {
        setLocalDate(day, month, year);
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(int day, int month, int year) throws DateTimeException{
        try {
            this.localDate = LocalDate.of(year, month, day);
        }catch (DateTimeException e){
            System.out.println("Error when entering the date, enter again ");
            throw new DateTimeException("Error when entering the date, enter again ");
        }

    }

    public boolean setLocalDate(String date){
        LocalDate pars = LocalDate.parse(date);
        if (pars == null){
            localDate = LocalDate.now();
            return false;
        }else{
            localDate = pars;
            return true;
        }
    }

    @Override
    public String toString() {
        return localDate + "";
    }

    public int compareTo(Date date) {
return this.localDate.compareTo(date.localDate);
    }
}
