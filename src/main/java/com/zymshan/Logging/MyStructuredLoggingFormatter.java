package com.zymshan.Logging;

import ch.qos.logback.classic.spi.ILoggingEvent;
import org.springframework.boot.logging.structured.StructuredLogFormatter;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class MyStructuredLoggingFormatter implements StructuredLogFormatter<ILoggingEvent> {

    private static final DateTimeFormatter TS_FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS")
                    .withZone(ZoneId.of("Asia/Kolkata"));
    @Override
    public String format(ILoggingEvent event) {

        String formattedTime = TS_FORMAT.format(Instant.ofEpochMilli(event.getTimeStamp()));
        return "time=" + formattedTime + " level=" + event.getLevel()+ " logger=" + event.getLoggerName() + " message=" + event.getMessage() + "\n";
    }
}
