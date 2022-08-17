package basic;

import java.util.Scanner;

public class CountDistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================================================");
        System.out.println("We are counting the distinct elements from the given array..!");
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

            System.out.println("No. of distinct elements in the given array is : " +  countDistinctElements(arr) );
            System.out.println("No. of distinct elements in the given array is : " +  countDistinctElementsMethod2(arr) );

            t--;
        }
    }

    public static int countDistinctElements(int []arr){
      int count = 0;
      for(int i=0; i<arr.length; i++){
          boolean isDistinct = true;
          for(int j=i+1; j<arr.length; j++){
              if(arr[i] == arr[j]){
                  isDistinct = false;
                  break;
              }
          }
          if(isDistinct)
              count++;
      }
      return count;
    }

    public static int countDistinctElementsMethod2(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            boolean isDistinct = true;
            for(int j=i-1; j>=0; j--){
                if(arr[i] == arr[j]){
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct){
                count++;
            }
        }
        return count;
    }
}
