package com.company;

import java.util.Arrays;
import java.util.Scanner;

class Bublsort {
    public void sortBubl(int[] arr) {


        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                }
            }
        }
    }


    int s,f;
    public void binarySearch(int[] arr) {

        f = arr.length;
        System.out.println("Enter x");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        while (arr[(s + f) / 2] != x) {
            if (arr[(s + f) / 2] > x) {
                f = (f + s) / 2;
            } else {
                s = (s + f) / 2;
            }
        }System.out.println("Position of number "+x+" is "+(f+s)/2);
    }
}
public class Main {

    public static void main(String[] args) {
        int[]arr= {77,47,34,82,12,4,32,543,21};
        Bublsort bublsort = new Bublsort();
        bublsort.sortBubl(arr);
        System.out.println("Sorted array "+Arrays.toString(arr));
        bublsort.binarySearch(arr);
      }
}