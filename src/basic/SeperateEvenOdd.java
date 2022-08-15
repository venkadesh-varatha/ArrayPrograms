package basic;

import java.util.Scanner;

public class SeperateEvenOdd {
    public static void main(String[] args) {
        /*
            You are given an array numbers that contains integers.
            You need to return one array of same length, first filled with even numbers and then by odd numbers.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================================================");
        System.out.println("We are separate even and odd elements in the given array..!");
        System.out.println("==========================================================================");

        System.out.println("Please Enter the no. of test cases to be executed: ");
        int t = sc.nextInt();

        while(t>0){

            System.out.println("Please enter the size of the array: ");
            int n = sc.nextInt();
            int []arr = new int[n];
            System.out.println("Please enter the elements of the array: ");
            for(int i=0; i<n; i++)
                arr[i] = sc.nextInt();

            //separateEvenOdd(arr);
            separateEvenOdd2(arr);

            t--;
        }
    }

    public static void separateEvenOdd(int arr[]){
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void separateEvenOdd2(int arr[]){
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                for(int j=i; j>index; j--){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                index++;

            }
        }

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
