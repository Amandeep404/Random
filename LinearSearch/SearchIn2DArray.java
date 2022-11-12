package Arrays.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    
    public static void main(String[] args) {
        int[][] arr = {
            {12,3,1,5},
            {31,23,56,2},
            {1,3,},
            {12,3,45,66,7,17}
        };
    
    Scanner sc =  new Scanner(System.in);

    int target = sc.nextInt();
     
       int[] ans =  Search(arr, target);

       System.out.println(Arrays.toString(ans));

    }

    static int[] Search(int[][] arr , int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                
                if(arr[row][col] == target){
                   return new int[]{row, col};
                }
            }
            
        }

        System.out.println("target not found");
        return null;
        
    }

}
