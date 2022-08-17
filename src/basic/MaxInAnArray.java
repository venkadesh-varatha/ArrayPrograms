package basic;

import java.util.Scanner;

public class MaxInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================================================");
        System.out.println("We are find max element in the given array..!");
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

            System.out.println("The max element of the given array is: " + maxInArray(arr));

            t--;
        }
    }

    public static int maxInArray(int arr[]){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
}
