package com.unsuccessful.lp;

public class ByteShortIntLong {

    public static void main(String[] args) {


        // Min and Max value
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Int min value: " + myMinIntValue);
        System.out.println("Int max value: " + myMaxIntValue);

        // Overflow and Under flow of Int values in java. It is applicable for all the primitive types below
        System.out.println("Busted int Max value: " + (myMaxIntValue + 1));
        System.out.println("Busted int Min value: " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value: " + myMinByteValue);
        System.out.println("Byte max value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value: " + myMinShortValue);
        System.out.println("Short max value: " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value: " + myMinLongValue);
        System.out.println("Long max value: " + myMaxLongValue);

        long value = 100; // implicitly the java read the 100 as int and convert it to long. But if you want to it to be
        // treated as long - then it is recommended to suffix the value with L. i.e., long value = 100L;

        long moreThanIntMaxValue = 3434223533L; // If we remove the L - It gives compilation error is the int is too large

        short shortValue = 3434; // Here also we can't put int for the value of short

        // Casting
    }
}
