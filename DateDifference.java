import java.time.LocalDate;
import java.time.Period;

public class DateDifference {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(2020,1,1);
        LocalDate date2=LocalDate.now();

        Period diff=Period.between(date1,date2);

        System.out.println("difference between"+date1+" and "+date2);
        System.out.println("years = "+diff.getYears()+" months = "+diff.getMonths()+" days = "+diff.getDays());
    }
}
