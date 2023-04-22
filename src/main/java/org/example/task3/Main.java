package org.example.task3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers in the array: ");
        int N = input.nextInt();

        int[] array = new int[N];
        System.out.print("Enter the array of " + N + " integers: ");
        for (int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }

        int sumOfTwoDigitIndices = 0;
        for (int i = 0; i < N; i++) {
            if (array[i] >= 10 && array[i] <= 99) {
                sumOfTwoDigitIndices += i;
            }
        }

        for (int i = 0; i < N; i++) {
            if (array[i] < 0) {
                array[i] = sumOfTwoDigitIndices;
            }
        }

        System.out.print("Array after replacement: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
