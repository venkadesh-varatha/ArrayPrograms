package basic;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================================================");
        System.out.println("Multi Dimensional Array: ");
        System.out.println("==========================================================================");

        int arr[][] = { {1, 2, 4}, {10, 11, 12}, {12, 23, 24}, {120, 121, 122, 23, 24, 25, 120}};
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

    }
}
