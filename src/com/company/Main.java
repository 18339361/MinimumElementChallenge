package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the length of the array");
        int[] arr = readIntegers(scanner.nextInt());
        System.out.println("The minimum value is " + findMin(arr));
    }

    public static int[] readIntegers(int count){
        int[] arr = new int[count];
        System.out.println("Enter " + count + " integers");
        for(int i=0; i<arr.length; i++){
            arr[i]=scanner.nextInt();
        }
        return arr;
    }

    public static int findMin(int[] arr){
        int min= arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min= arr[i];
            }
        }
        return min;
    }
}
