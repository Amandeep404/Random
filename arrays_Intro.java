package Arrays;
import java.util.*;

class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of primitives  
        // int[] arr = new int[5];
        // for (int i = 0; i < arr.length; i++) {   
        //     arr[i]= sc.nextInt();
        // }
        // // for (int i = 0; i < arr.length; i++) {  // way 1
        // //     System.out.println(arr[i]);
        // // }

        // // for(int i : arr){               // way 2
        // //     System.out.println(i);
        // // }

        // System.out.println(Arrays.toString(arr));// way 3

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        str[0] ="Aman";

        System.out.println(Arrays.toString(str));
        
    }

}