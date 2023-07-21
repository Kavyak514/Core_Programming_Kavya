package com.codetalksdna.CodingPrograms;

import java.time.Instant;

public class DifferenceBetweenTwoTimePeriod {
    public static void main(String[] args) {
        Instant instant1 = Instant.now().minusSeconds(20000);
        Instant instant2 = Instant.now();
        System.out.println(instant2.toEpochMilli());
        System.out.println(instant1.toEpochMilli());
        System.out.println(instant2.toEpochMilli() - instant1.toEpochMilli());
    }
}
