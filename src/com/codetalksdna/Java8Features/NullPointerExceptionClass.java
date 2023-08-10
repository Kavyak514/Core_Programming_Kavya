package com.codetalksdna.Java8Features;

import java.util.Optional;

public class NullPointerExceptionClass {
    public static void main(String[] args) {
        String value = "Nitesh";
        Optional<String> s = Optional.ofNullable(value);
        System.out.println(s.isEmpty());
        System.out.println(s.orElse("Nitesh1"));

        s.ifPresentOrElse(xyz -> System.out.println("Value is::" + " " + xyz),
                () -> System.out.println("The Data is not Present"));

        if (s.isPresent()) {
            System.out.println(value.length());
        } else {
            System.out.println("I am Good with the Exception");
        }
    }
}
