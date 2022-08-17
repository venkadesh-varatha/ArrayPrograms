package basic;

import java.util.Scanner;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================================================");
        System.out.println("We are checking the given array is sorted in ascending order or not..!");
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

            System.out.println("The given array is sorted: " + isArraySorted(arr));

            t--;
        }
    }

    public static boolean isArraySorted(int []arr){

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1])
                return false;
        }

        return true;
    }
}
