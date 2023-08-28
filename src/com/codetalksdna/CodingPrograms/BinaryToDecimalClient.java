package com.codetalksdna.CodingPrograms;

import java.rmi.Naming;

public class BinaryToDecimalClient {
    public static void main(String[] args) {
        try {
            BinaryToDecimalInterface binaryToDecimal = (BinaryToDecimalInterface) Naming.lookup("rmi://localhost/BinaryToDecimalService");

            String binary = "1101";
            int decimal = binaryToDecimal.binaryToDecimal(binary);
            System.out.println("Binary: " + binary);
            System.out.println("Decimal: " + decimal);
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
