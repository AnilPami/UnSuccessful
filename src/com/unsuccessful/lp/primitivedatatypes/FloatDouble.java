package com.unsuccessful.lp.primitivedatatypes;

public class FloatDouble {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimum value: " + myMinFloatValue);
        System.out.println("Float maximum value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double minimum value: " + myMinDoubleValue);
        System.out.println("Double maximum value: " + myMaxDoubleValue);

        int myIntValue = 5; //32 bits
        float myFloatValue = 5;// 32 bits
        double myDoubleValue = 5;//64 bits

        float castedFloatValue = (float) 5.3;

        System.out.println("Int Float and Double values, casted float value: " + myIntValue +  " " +
                myFloatValue + " " + myDoubleValue + " " + castedFloatValue);

        int myIntDivValue = 5 / 2;
        float myFloatDivValue = 5f / 2f;
        double myDoubleDivValue = 5d / 2d;

        System.out.println("[Div] Int Float and Double values, casted float value: " + myIntDivValue +  " " +
                myFloatDivValue + " " + myDoubleDivValue);
    }
}
