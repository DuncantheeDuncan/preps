package stringsArraysListsDatesLambas;

import java.time.LocalDate;
import java.time.Period;

public class Immutability {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2017,
                2,
                28);

        Period period = Period.ofYears(1);


        System.out.println(localDate.plus(period));
        System.out.println(period);
        System.out.println(localDate);
        System.out.println();

        LocalDate localDate1 = localDate.plus(period);

        System.out.println(localDate1);
        System.out.println("---------------------/-----/-");

        LocalDate start = LocalDate.of(2018,3,8);
        LocalDate end = LocalDate.of(2019,8,20);

        Period period1 = Period.between(start,end);


        System.out.println(start);

        System.out.println("Period, Years, Months, Days\n"+period1);

        System.out.println("---------------------/-----/-");
    }
}
