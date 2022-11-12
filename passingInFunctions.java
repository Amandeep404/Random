package Arrays;

import java.util.*;

public class passingInFunctions {

    public static void main(String[] args) {
        int[] num = {1,42,23,12};

        System.out.println(Arrays.toString(num));

        change(num);

        System.out.println(Arrays.toString(num));
        
    }
    
    static void change(int[] arr){
        arr[0] = 999; 
    }
}
