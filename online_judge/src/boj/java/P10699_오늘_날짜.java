import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class P10699_오늘_날짜 {
    public static String getToday() {
        ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        return utc.format(formatter);
    }
}
