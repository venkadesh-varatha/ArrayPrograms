package basic;

import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================================================");
        System.out.println("We are find average of all elements in the given array..!");
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

            System.out.println("Average of all elements of an array: " + averageOfArray(arr));

            t--;
        }
    }

    public static double averageOfArray(int arr[]){
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
            sum += arr[i];

        double average = sum / arr.length;
        return average;
    }
}
