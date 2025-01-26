/*
Issues with older data and calendar classes
data or time object was mutable,limited support for timezones

New Date-Time API
Immutability: All classes are immutable and thread-safe.
Fluent API: Method chaining and intuitive naming improve readability.
Time Zones: Comprehensive support for time zones.
Parsing and Formatting: Easy formatting and parsing with DateTimeFormatter.
Durations and Periods: Simplified date and time calculations.
*/


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Date_Time_7 {
    public static void main(String[] args) {
        //LOCAL  DATE
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate customDate=LocalDate.of(1990,2,7);
        System.out.println(customDate);
        LocalDate localDate = now.minusMonths(45);
        System.out.println(localDate);
        if(localDate.isLeapYear()) System.out.println("it's a leap year");
        else System.out.println("not a leap year");

        //LOCAL TIME
        LocalTime current=LocalTime.now();
       //System.out.println(current);
        System.out.println(current.getHour());
        System.out.println(current.getNano());

        //LOCAL DATETIME
        LocalDateTime l1=LocalDateTime.now();
        System.out.println(l1);

        //ZONED DATETIME
        //UTC-Cooordinated Universal Time
        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println(now1);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        //availableZoneIds.forEach(System.out::println);

        //INSTANT
        long l= System.currentTimeMillis();
        //this will give the current millisecond from Jan 1,1970 midnight
        Instant now2 = Instant.now();
        System.out.println(now2);

        //DURATION used for short time (seconds)
        Instant start=Instant.now();
        int sum=0;
        for(int i=0;i<10000;i++){
            sum+=i;
        }
        Instant end=Instant.now();
        Duration between=Duration.between(start,end);
        System.out.println(between);

        //PERIOD used for larger duration of time (years)
        LocalDate curr=LocalDate.now();
        LocalDate then=LocalDate.of(1990,2,2);
        Period between1=Period.between(curr,then);
        System.out.println(between1);

        //DATE TIME FORMATTER

        DateTimeFormatter myFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format=localDate.format(myFormatter);
        System.out.println(format);
    }
}
