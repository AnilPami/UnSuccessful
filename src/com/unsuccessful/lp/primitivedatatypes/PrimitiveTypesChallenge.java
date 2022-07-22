package com.unsuccessful.lp.primitivedatatypes;

public class PrimitiveTypesChallenge {

    public static void main(String[] args) {

        byte byteVariable = 13;

        short shortVariable = 384;

        int intVariable = 384405;

        long longSum = 50000L + 10L * (byteVariable + shortVariable + intVariable);

        System.out.println("byteVariable: " + byteVariable);
        System.out.println("shortVariable: " + shortVariable);
        System.out.println("intVariable: " + intVariable);
        System.out.println("longSum: " + longSum);

    }
}
