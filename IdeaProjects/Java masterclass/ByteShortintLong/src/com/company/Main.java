package com.company;

public class Main {

    public static void main(String[] args) {

            int myValue = 10000;

            int myMinIntValue = Integer.MIN_VALUE;
            int myMaxIntValue = Integer.MAX_VALUE;
            System.out.println("Integer Minimum Value = " + myMinIntValue);
            System.out.println("Integer Maximum Value = " + myMaxIntValue);
            System.out.println("Busted Max value = " + (myMaxIntValue + 1));
            System.out.println("Busted Min value = " + (myMinIntValue - 1));

            int myMaxIntTest = 2_147_483_647;

            byte myMinByteValue = Byte.MIN_VALUE;
            byte myMaxByteValue = Byte.MAX_VALUE;
            System.out.println("Byte Minimum value = " + myMinByteValue);
            System.out.println("Byte Maximum value = " + myMaxByteValue);

            short myMinShortValue = Short.MIN_VALUE;
            short myMaxShortValue = Short.MAX_VALUE;
            System.out.println("Short Minimum Value = " + myMinShortValue);
            System.out.println("Short Maximum Value = " + myMaxShortValue);

            long myLongValue = 100;
            long myMinLongValue = Long.MIN_VALUE;
            long myMaxLongValue = Long.MAX_VALUE;
            System.out.println("Long Minimum Value = " + myMinLongValue);
            System.out.println("Long Maximum Value = " + myMaxLongValue);
            long bigLongLiteraValue = 2_147_483_647_234L;
            System.out.println(bigLongLiteraValue);

            short bigShortLiteralValue = 32767;
            System.out.println(bigShortLiteralValue);

            int myTotal = (myMinIntValue / 2);

            byte myNewByteValue =(byte) (myMinByteValue / 2);

            short myNewShortValue =(short) (myMinShortValue / 2);



    }
}
