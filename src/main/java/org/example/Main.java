package org.example;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate todaysDate = LocalDate.now();
        Instant todaysDate2 = Instant.now();
        LocalTime todaysTime = LocalTime.now();
        System.out.println(todaysDate);
        System.out.println(todaysDate2);
        System.out.println(todaysTime);

        LocalDate twoWeeksDate = LocalDate.now().plusWeeks(2);
        System.out.println(twoWeeksDate);

        LocalDate tomorrowsDate = LocalDate.now().plusDays(2);
        if(todaysDate.isBefore(tomorrowsDate)) {
            System.out.println(todaysDate + " liegt vor " + tomorrowsDate);
        } else {
            System.out.println(todaysDate + " liegt nach " + tomorrowsDate);
        }

        Period daysDifference = Period.between(todaysDate, LocalDate.now().plusDays(3));
        System.out.println(daysDifference);
        LocalDate date1 = LocalDate.parse("2023-09-11");
        LocalDate date2 = LocalDate.parse("2023-12-04");
        Period dateDifference = Period.between(date1, date2);
        System.out.println(dateDifference);

        Animal dog = new Animal(LocalDate.parse("2023-09-29"), "Dog");
        Period daysUntilBirthday = Period.between(LocalDate.now(), dog.getBirthday());
        System.out.println(daysUntilBirthday);
        long daysUntilBirthday2 = ChronoUnit.DAYS.between(LocalDate.now(), dog.getBirthday());
        System.out.println(daysUntilBirthday2);
    }
}