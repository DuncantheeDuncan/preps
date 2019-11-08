package stringsArraysListsDatesLambas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DatesObjects {
    static void localDateTim() {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("getting a birth-date..");

        System.out.print("today's date: "+localDateTime);
        System.out.print(":"+localDateTime.getMonth());
        System.out.print(":"+ localDateTime.getDayOfMonth());
        System.out.println();
        System.out.println();

        int years =1998;

        System.out.print(localDateTime.minusYears(years));




    }

static void localDatesTimes(){
    LocalDate localDate = LocalDate.now();



    System.out.println("today's date " +localDate);
    System.out.println("Day : " +
            localDate.getDayOfMonth());
    System.out.println( "day of the year : "+localDate.getDayOfYear());

    System.out.println("last year by this time it was : "+
            localDate.minusDays(localDate.getDayOfYear()).getDayOfWeek());


}
    public static void main(String[] args) {
//    localDatesTimes();
        System.out.println();
        localDateTim();

    }
}
