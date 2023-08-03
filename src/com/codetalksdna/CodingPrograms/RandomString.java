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
        for (int j = 0; j < random.nextInt(10); j++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < random.nextInt(10); i++) {
                stringBuilder.append(charArray[random.nextInt(25)]);
            }
            if (stringBuilder.length() >= 3) {
                strings.add(String.valueOf(stringBuilder));
            }
        }
        strings.add("Exit");
        return strings;
    }
}
