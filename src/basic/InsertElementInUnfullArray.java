package basic;

import java.util.Scanner;

public class InsertElementInUnfullArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================================================");
        System.out.println("We are traversing all elements in the given array..!");
        System.out.println("==========================================================================");

        System.out.println("Please Enter the no. of test cases to be executed: ");
        int t = sc.nextInt();

        while(t>0){

            System.out.println("Please enter the total size of the array: ");
            int totalSize = sc.nextInt();
            int []arr = new int[totalSize];
            System.out.println("Please enter the currentSize of the array: ");
            int currSize = sc.nextInt();
            System.out.println("Please enter the elements of the array: ");
            for(int i=0; i<currSize; i++)
                arr[i] = sc.nextInt();
            System.out.println("Please enter the element to be inserted: ");
            int x = sc.nextInt();
            System.out.println("Please enter the position in which the element to be inserted: ");
            int pos = sc.nextInt();
            boolean isInserted = insert(arr, currSize, x, totalSize, pos);

            if(isInserted){
                System.out.println("The element is inserted.");
                arrayTraversal(arr);
            }

            else{
                System.out.println("The element is not inserted because of current size and total size are same.");
                arrayTraversal(arr);
            }


            t--;
        }
    }

    public static boolean insert(int arr[], int currSize, int x, int totalSize, int pos){
        if(currSize == totalSize)
            return false;
        int index = pos - 1;
        for(int i = currSize-1; i>=index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = x;
        return true;
    }

    public static void arrayTraversal(int arr[]){
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
