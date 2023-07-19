package com.codetalksdna.dataTypes;

public class TypeCasting {
    public static void main(String[] args) {
        int number = 10;

        System.out.println((long) number);

        System.out.println((double) number);

        System.out.println((float) number);

        double db = 20;
        float f2 = (float) db;
        System.out.println(f2);

        char ch = 'A';
        System.out.println((int) ch);

        byte b = 20;
        System.out.println((short) b);

        short sh = 20000;
        byte bt = (byte) sh;
        System.out.println(bt);

        long lg = 77391279377777L;
        int num = (int) lg;
        System.out.println(num);
    }
}
