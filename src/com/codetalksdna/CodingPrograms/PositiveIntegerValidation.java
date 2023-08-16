package com.codetalksdna.CodingPrograms;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PositiveIntegerValidation {
    public static boolean isValidPositiveInteger(String input) {
        String regex = "^[1-9][0-9]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testCases = {"123", "00123", "-123", "0", "123,456", "abc"};
        for (String testCase : testCases) {
            boolean isValid = isValidPositiveInteger(testCase);
            System.out.println(testCase + ": " + (isValid ? "Valid" : "Invalid"));
        }
    }
}
