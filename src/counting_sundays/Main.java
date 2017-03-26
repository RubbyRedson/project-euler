package counting_sundays;

/**
 * Created by Nick on 3/26/2017.
 */
public class Main {
    public static void main(String[] args) {
        State state = new State();
        state.day = 1;
        state.month = 1;
        state.year = 1900;
        state.dayOfTheWeek = 0;

        state.setDaysInYear();
        state.setDaysInMonth();

        while (!(state.year == 2000 && state.month == 12 && state.day == 2)) {
            state.advance();
        }
        System.out.println(state.counter);
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;
        if (year % 4 == 0) {
            if (year % 400 == 0) result = true;
            else if (year % 100 == 0) result = false;
            else result = true;
        }
        //System.out.println(year + " is leap " + result);
        return result;
    }

    static class State {
        int counter = 0;

        int year;
        int month;
        int day;

        int daysInMonth;
        int daysInYear;

        int dayOfTheWeek;

        public void setDaysInMonth() {
            if (month == 2) {
                if (daysInYear == 365) daysInMonth = 28;
                else daysInMonth = 29;
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) daysInMonth = 30;
            else daysInMonth = 31;
        }

        public void setDaysInYear() {
            if (isLeapYear(year)) daysInYear = 366;
            else daysInYear = 365;
        }

        public void advance() {
            if (day == daysInMonth) {
                day = 1;
                month++;
                if (month == 13) {
                    month = 1;
                    year++;
                    setDaysInYear();
                }
                setDaysInMonth();
            } else {
                day++;
            }
            dayOfTheWeek = (dayOfTheWeek + 1) % 7;
            if (year > 1900 && day == 1 && dayOfTheWeek == 6) {
                //System.out.println(day+"."+month+"."+year+" is a Sunday");
                counter++;
            }
            //System.out.println(day+"."+month+"."+year+" is a " + dayOfTheWeek);
        }
    }
}
