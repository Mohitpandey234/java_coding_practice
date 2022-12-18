package com.company;

import java.util.Scanner;

public class unique {
// using XOR as multiplying same number gives zero as per zor
    static void Unique(int A[]){
        int ans=0;
        for(int i = 0; i< A.length;i++){
            ans=ans^A[i];
        }
        System.out.println(ans);
    }

    // Create a Array of odd size and every element repeats twice except one , find the unique element.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size;
        System.out.println("Enter size");
        size= scan.nextInt();

        int Array[]=new int[size];
        System.out.println("Enter elements");
        for(int i = 0 ; i <size; i ++){
            Array[i]=scan.nextInt();
        }

        Unique(Array);
    }
}
