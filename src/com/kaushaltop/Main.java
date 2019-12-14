package com.kaushaltop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        System.out.println(Arrays.toString(array));

        reverse(array);

        System.out.println(Arrays.toString(array));

    }

    public static void reverse(int[] array) {

        int lastIndex = array.length - 1;
        int midIndex = array.length/2;

        for (int i=0; i<midIndex; i++) {

            int temp = array[i];

            array[i] = array[lastIndex - i];

            array[lastIndex - i] = temp;

        }
    }
}
