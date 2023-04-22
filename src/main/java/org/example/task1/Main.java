package org.example.task1;

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

        int sumOfPrimes = 0;
        for (int i = 0; i < N; i++) {
            if (isPrime(sequence[i])) {
                sumOfPrimes += sequence[i];
            }
        }

        System.out.println("Sum of prime numbers in the sequence: " + sumOfPrimes);
    }

    // helper method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
