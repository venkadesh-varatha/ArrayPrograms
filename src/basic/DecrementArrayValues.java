package basic;

import java.util.Scanner;

public class DecrementArrayValues {
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

            decrementArrayValues(arr);

            t--;
        }
    }

    public static void decrementArrayValues(int arr[]){
        for(int i=0; i<arr.length; i++)
            arr[i] -= 1;
        traversal(arr);

    }

    public static void traversal(int arr[]){
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
