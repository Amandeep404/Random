package Arrays;

import java.util.Scanner;

public class MaxItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];
        System.out.println("input the digits in the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("input the first Index");
        int firstIndex= sc.nextInt();
        System.out.println("input the last Index");
        int lastIndex = sc.nextInt(); 
        Max(arr, firstIndex, lastIndex );

        
    }

    static void Max(int[] arr, int firstIndex, int secondIndex){
        int max = arr[firstIndex];

        for (int i = firstIndex; i < secondIndex; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max is " + max);
    }
    
}
