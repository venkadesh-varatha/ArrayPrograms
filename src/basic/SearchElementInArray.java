package basic;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================================================");
        System.out.println("We are searching an element in the given array..!");
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
            System.out.println("Please enter the element to be searched: ");
            int x = sc.nextInt();
            int elementIndex = search(arr, x);
            if(elementIndex != -1)
                System.out.println("The element is present in index: " + elementIndex);
            else
                System.out.println("The element is not present in the given array.");

            t--;
        }
    }

    public static int search(int arr[], int x){
        for(int i=0; i<arr.length; i++)
            if(arr[i] == x)
                return i;
        return -1;
    }
}
