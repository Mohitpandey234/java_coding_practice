package com.company;

import java.util.Scanner;

public class Revarray {
    static void Reverse(int A[]) {
        for (int i = A.length - 1; i >= 0; i--) {
            System.out.println(A[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter size");
        size = sc.nextInt();
        int Array[] = new int[size];
        System.out.println("Enter elements");
        for (int i = 0; i < size; i++) {
            Array[i] = sc.nextInt();
        }
Reverse(Array);
    }
}
