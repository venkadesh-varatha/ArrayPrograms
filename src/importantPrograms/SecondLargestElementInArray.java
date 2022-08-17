package importantPrograms;

import java.util.Scanner;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================================================");
        System.out.println("We are second largest element in the given array..!");
        System.out.println("==========================================================================");

        System.out.println("Please Enter the no. of test cases to be executed: ");
        int t = sc.nextInt();

        while(t>0){

            System.out.println("Please enter the size of the array: ");
            int size = sc.nextInt();
            int []arr = new int[size];

            System.out.println("Please enter the elements of the array: ");
            for(int i=0; i<size; i++)
                arr[i] = sc.nextInt();

            int secondLargestElementIndex = secondLargestElementInArray(arr);
            if(secondLargestElementIndex != -1)
                System.out.println("The second largest element is: " + arr[secondLargestElementIndex]);
            else
                System.out.println("There is no second largest element.");



            t--;
        }
    }

    public static int secondLargestElementInArray(int arr[]){
        int secondLargestElementIndex = -1;
        int largestElementIndex = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr[largestElementIndex]){
                secondLargestElementIndex = largestElementIndex;
                largestElementIndex = i;
            }else if(arr[i] != arr[largestElementIndex]){
                if(secondLargestElementIndex == -1 || arr[i] > arr[secondLargestElementIndex])
                    secondLargestElementIndex = i;
            }
        }
        return secondLargestElementIndex;
    }

}
