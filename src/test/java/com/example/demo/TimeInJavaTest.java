package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import org.junit.jupiter.api.Test;

class TimeInJavaTest {

      @Test
      void stringToInstant() {
          TimeInJava timeInJava = new TimeInJava();
          timeInJava.stringToInstant("2024-11-08T09:34:00");
      }

      @Test
      void instantToString() {
          TimeInJava timeInJava = new TimeInJava();
          System.out.println(timeInJava.instantToString(Instant.now())); // 2024-11-08T01:47:34.524724Z
      }

      @Test
      void instantToLocalDateTime() {
          TimeInJava timeInJava = new TimeInJava();
          System.out.println(timeInJava.instantToLocalDateTime(Instant.now())); // 2024-11-08T09:48:43.637561
      }

      @Test
      void getCurrentTimeInUTC() {
          TimeInJava timeInJava = new TimeInJava();
          System.out.println(timeInJava.getCurrentTimeInUTC()); // 2024-11-08T01:44:55.512150Z
      }

      @Test
      void getCurrentTimeInLocalDateTIme() {
          TimeInJava timeInJava = new TimeInJava();
          System.out.println(timeInJava.getCurrentTimeInLocalDateTIme()); // 2024-11-08T09:46:03.969785
      }
}
