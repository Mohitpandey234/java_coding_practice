package com.company;

import java.util.Scanner;

public class swapalternate {

    static void PrintArray(int P[]) {
        for (int i = 0; i < P.length; i++) {
            System.out.println(P[i]);
        }
    }

    static void SwapAlternate(int A[]) {
        for (int i = 0; i < A.length; i += 2) {
            int temp = A[i];
            A[i] = A[i + 1];
            A[i + 1] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size;
        System.out.println("Enter size");
        size = scan.nextInt();

        int Array[] = new int[size];

        System.out.println("Enter elements");
        for (int i = 0; i < size; i++) {
            Array[i] = scan.nextInt();
        }
        SwapAlternate(Array);
        PrintArray(Array);
    }
}
