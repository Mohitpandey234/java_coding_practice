package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        int Array[] = new int[size];
        System.out.println("Enter elements of array");
        for (int i = 0; i < size; i++) {
            Array[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < size; i++) {
            if (max < Array[i]) {
                max = Array[i];
            }
        }
        System.out.println(max);

        int min = 100;
        for (int i = 0; i < size; i++) {
            if (Array[i] < min) {
                min = Array[i];
            }
        }
        System.out.println(min);
    }
}


