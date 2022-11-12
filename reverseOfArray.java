package Arrays;

import java.util.*;

public class reverseOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the Array : ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter the digits in the Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Current Array: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Array after reversing: " + Arrays.toString(arr));
    }

    static void reverseArray(int[] arr){
        int startIndex = 0;
        int endIndex = arr.length -1 ;

        while (startIndex < endIndex){

            swap(arr, startIndex, endIndex);
            startIndex ++ ;
            endIndex -- ;
        }
    }

    static void swap(int[] arr, int startIndex, int endIndex){
        int temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;
    }
    
}
