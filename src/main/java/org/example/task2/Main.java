package org.example.task2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers in the sequence: ");
        int N = input.nextInt();

        int[] sequence = new int[N];
        System.out.print("Enter the sequence of " + N + " integers: ");
        for (int i = 0; i < N; i++) {
            sequence[i] = input.nextInt();
        }

        boolean isIncreasing = true;
        for (int i = 1; i < N; i++) {
            if (sequence[i] <= sequence[i-1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("The sequence is increasing.");
        } else {
            System.out.println("The sequence is not increasing.");
        }
    }
}
