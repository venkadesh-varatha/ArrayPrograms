package basic;

import java.util.Scanner;

public class ArrayTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================================================");
        System.out.println("We are traversing all elements in the given array..!");
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

            traversal(arr);
            reverseTraversal(arr);
            t--;
        }
    }

    public static void traversal(int arr[]){
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void reverseTraversal(int arr[]){
        for(int i=arr.length-1; i>=0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
