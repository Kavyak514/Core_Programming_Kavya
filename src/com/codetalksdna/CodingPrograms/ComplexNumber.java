package com.codetalksdna.CodingPrograms;

public class ComplexNumber {
    float realNumber;
    float imaginaryNumber;

    public ComplexNumber(float realNumber, float imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(3.4f, 5.4f);
        ComplexNumber complexNumber2 = new ComplexNumber(2.3f, 2.8f);

        float sumOfRealNumbers = complexNumber1.realNumber + complexNumber2.realNumber;
        System.out.println(sumOfRealNumbers);
        System.out.println(complexNumber1.getClass());

        float sumOfImaginaryNumbers = complexNumber1.imaginaryNumber + complexNumber2.imaginaryNumber;
        System.out.println(sumOfImaginaryNumbers);

        System.out.println(complexNumber2.getClass());
        System.out.println(sumOfRealNumbers + " " + "+" + " " + (sumOfImaginaryNumbers + "i"));
    }
}
