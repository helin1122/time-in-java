package com.example.demo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeInJava {
  public void stringToInstant(String date) {
    System.out.println("LocalDateTime.parse(date): " + LocalDateTime.parse(date));
    System.out.println("localDateTime.atZone(ZoneId.of(timezone)): " + LocalDateTime.parse(date).atZone(
        ZoneId.of("Asia/Taipei")));
    System.out.println("zonedDateTime.toInstant(): " + LocalDateTime.parse(date).atZone(
        ZoneId.of("Asia/Taipei")).toInstant());
  }

  public String instantToString(Instant instant) {
    return instant.toString();
  }

  public String instantToLocalDateTime(Instant instant) {
    return instant.atZone(ZoneId.of("Asia/Taipei")).toLocalDateTime().toString();
  }

  public Instant getCurrentTimeInUTC() {
    return Instant.now();
  }

  public LocalDateTime getCurrentTimeInLocalDateTIme() {
    return LocalDateTime.now();
  }
}
