package com.unsuccessful.lp.primitivedatatypes;

public class CharBoolean {

    public static void main(String[] args) {

        // char - if someone enters the single character, to receive those single chars we need this storage
        char myChar = 'a'; // Only single character
        char myUnicodeChar = '\u0041';
        char myUnicodeCopyRightChar = '\u00A9';

        System.out.println("myChar: " + myChar);
        System.out.println("myUnicodeChar: " + myUnicodeChar);
        System.out.println("myUnicodeCopyRightChar: " + myUnicodeCopyRightChar);

        // boolean, based on some condition this will assign the value as 'true/false'
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        System.out.println("myTrueBooleanValue: " + myTrueBooleanValue);
        System.out.println("myFalseBooleanValue: " + myFalseBooleanValue);

    }
}
