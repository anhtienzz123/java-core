package comjava.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Main {

    public static void main(String[] args) {

        // offset, timezone
        System.out.println("==== offset, timezone");
        ZoneOffset zoneOffset0 = ZoneOffset.of("+00:00");
        ZoneOffset zoneOffset7 = ZoneOffset.of("+07:00");
        ZoneId zoneId0 = ZoneId.of("Asia/Ho_Chi_Minh");
        ZoneId zoneId7 = ZoneId.of("Africa/Abidjan");
        System.out.println("zoneOffset: " + zoneOffset7);
        System.out.println("zoneId: " + zoneId0);

        // test converter object
        System.out.println("==== test converter");
        LocalDateTime ldt1 = LocalDateTime.now();
        Instant instantFromConvertOffset = ldt1.atOffset(zoneOffset7).toInstant();
        Instant instantFromConvertZone = ldt1.atZone(zoneId0).toInstant();
        System.out
                .println("instantFromConvertOffset: " + instantFromConvertOffset.getEpochSecond());
        System.out.println("instantFromConvertZoneId: " + instantFromConvertZone.getEpochSecond());
        System.out.println(instantFromConvertOffset.atOffset(zoneOffset0));
        System.out.println(instantFromConvertOffset.atOffset(zoneOffset0).toEpochSecond());
        System.out.println(instantFromConvertOffset.atOffset(zoneOffset7));
        System.out.println(instantFromConvertOffset.atOffset(zoneOffset7).toEpochSecond());

        // test converter timezone
        System.out.println("==== test converter timezone");
        System.out.println("== test with same instant, local");
        System.out.println("now: " + ldt1.atZone(zoneId0));
        System.out.println(
                "America/New_York same instant: " + ldt1.atZone(zoneId0).withZoneSameInstant(zoneId7));
        System.out.println("America/New_York same local: " + ldt1.atZone(zoneId0).withZoneSameLocal(zoneId7));
    }
}
