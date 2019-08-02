package by.yakovtsev.introduction.basics_oop_5.task3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashSet;
import java.util.Set;

public class Calendar {
    private final Set<MonthDay> holidays = new HashSet<>();
    CustomHolidays customHolidays;

    public Calendar() {
        this.customHolidays = new CustomHolidays();
    }

    public void addHoliday(final MonthDay monthDay) {
        holidays.add(monthDay);
    }

    public void showWeekendAndHolidayBetween(final LocalDate startInclusive, final LocalDate endInclusive){
        System.out.println("Total weekends and holidays: " + customHolidays.numberOfWeekendAndHolidayBetween(startInclusive, endInclusive));
        for (LocalDate i = startInclusive; !i.isAfter(endInclusive); i = i.plusDays(1)) {
            if (customHolidays.isHoliday(i)) {
                System.out.println(i + "  " + i.getDayOfWeek());
            }
        }
    }

    private class CustomHolidays {

        public boolean isHoliday(final LocalDate localDate) {
            return isWeekend(localDate) || holidays.contains(toMonthDay(localDate));
        }

        public int numberOfWeekendAndHolidayBetween(final LocalDate startInclusive, final LocalDate endInclusive) {
            int c = 0;
            for (LocalDate i = startInclusive; !i.isAfter(endInclusive); i = i.plusDays(1)) {
                if (isHoliday(i)) {
                    c++;
                }
            }
            return c;
        }

        public boolean isWeekend(final LocalDate localDate) {
            final DayOfWeek dow = localDate.getDayOfWeek();
            return dow == DayOfWeek.SATURDAY || dow == DayOfWeek.SUNDAY;
        }

        public  MonthDay toMonthDay(final LocalDate localDate) {
            return MonthDay.of(localDate.getMonth(), localDate.getDayOfMonth());
        }

    }
}
