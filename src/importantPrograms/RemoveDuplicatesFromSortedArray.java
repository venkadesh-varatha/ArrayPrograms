package importantPrograms;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================================================");
        System.out.println("We are removing duplicates from the given sorted array ..!");
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
            int uniqueElementsArraySize = removeDuplicates(arr);

            for(int i=0; i<uniqueElementsArraySize; i++)
                System.out.print(arr[i] + " ");
            System.out.println();

            t--;
        }
    }

    public static int removeDuplicates(int arr[]){
        int uniqueElementIndex = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[uniqueElementIndex] != arr[i]){
                arr[uniqueElementIndex+1] = arr[i];
                uniqueElementIndex++;
            }
        }
        return uniqueElementIndex+1;
    }

}
