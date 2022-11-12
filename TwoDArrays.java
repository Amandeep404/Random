package Arrays;

import java.util.*;
public class TwoDArrays {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        //  // way 1

          int arr[][] = new int[3][2];

        //  for (int row = 0; row < arr.length; row++) {
        //     // for each column in each row
        //     //ctrl + f2
        //     for (int cols = 0; cols < arr[row].length; cols++) {
        //             arr[row][cols] = sc.nextInt();
        //     }
        //  }

        //  // TO PRINT THE INPUT

        //  for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {

        //         System.out.print(arr[row][col] +" ");
                
        //     }
        //     System.out.println(" ");
            
        //  }

        //Way 2

        int num[][] = new int[3][2];
        
    for (int row = 0; row < num.length; row++) {

        for (int col = 0; col < num[row].length; col++) {
            num[row][col] = sc.nextInt();
            
        }
    }    

    // OUTPUT

    for (int row = 0; row < num.length; row++) {

        System.out.println(Arrays.toString(num[row]));


        
    }

    }
    
}
