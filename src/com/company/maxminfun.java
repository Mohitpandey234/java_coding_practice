package com.company;

import java.util.Scanner;

public class maxminfun {
    static void Max ( int Array[]){
        int m = 0;
        for (int i = 0; i < Array.length; i++) {
            if (m < Array[i]) {
                m = Array[i];
            }
        }
        System.out.println(m);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter size");
        size = sc.nextInt();

        int Array1[] = new int[size];
        System.out.println("Enter elements of array1");
        for (int i = 0; i < size; i++) {
            Array1[i] = sc.nextInt();
        }

        int Array2[] = new int[size / 2];
        System.out.println("Enter elements of array2");
        for (int i = 0; i < (size / 2); i++) {
            Array2[i] = sc.nextInt();
        }
        Max(Array1);
    }

}
