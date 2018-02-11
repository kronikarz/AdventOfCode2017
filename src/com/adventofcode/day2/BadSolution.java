package com.adventofcode.day2;

public class BadSolution {

    /*    public static void partOne(String input) {

        int sum = 0, low = 0, high = 0, tmp;
        boolean tmpFlag = false;
        int length = input.length();

        for (int i = 0; i < length; i++) {

            String c = String.valueOf(input.charAt(i));

            if (!(c.equals("\t")) && !(c.equals("\n"))) {

                if (tmpFlag == false) {
                    low = Integer.valueOf(c);
                    high = Integer.valueOf(c);
                    tmpFlag = true;
                }

                tmp = Integer.valueOf(c);

                if (tmp < low) {
                    low = tmp;
                } else if (tmp > high) {
                    high = tmp;
                }

            } else {
                tmp = high - low;
                sum += tmp;
                tmpFlag = false;
            }
        }
        System.out.println("checksum = " + sum);
    }*/
}
