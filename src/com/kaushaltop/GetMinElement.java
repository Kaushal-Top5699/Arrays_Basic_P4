package com.kaushaltop;

import java.security.PublicKey;
import java.util.Scanner;

public class GetMinElement {

    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {

        int[] values = new int[number];

        System.out.println("Enter "+number+" integer values: \r");

        for (int i=0; i<values.length; i++) {

            System.out.println("Enter "+i+" position value: \r");

            values[i] = scanner.nextInt();

        }

        return values;
    }

    public static int findMin(int[] array) {

        int min = array[0];

        for (int i=0; i<array.length; i++) {

            if (array[i] < min) {

                min = array[i];

            }
        }
        return min;
    }

}
