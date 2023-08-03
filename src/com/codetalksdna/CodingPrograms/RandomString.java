package com.codetalksdna.CodingPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        List<String> strings = getRandomStrings();
        System.out.println(strings);
    }

    public static List<String> getRandomStrings() {
        List<String> strings = new ArrayList<>();
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] charArray = characters.toCharArray();
        int numRandomStrings = random.nextInt(1, 9);

        for (int j = 0; j < numRandomStrings; j++) {
            StringBuilder stringBuilder = new StringBuilder();
            while (stringBuilder.length() < 5) {
                stringBuilder.append(charArray[random.nextInt(26)]);
            }
            strings.add(stringBuilder.toString());
        }
        strings.add("exit");
        return strings;
    }
}