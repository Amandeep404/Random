package Arrays.LinearSearch;

import java.util.*;

public class EvenDigitsQuestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array : ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter the digits in the Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Array : " + Arrays.toString(arr));

        int count = 0 ;

        for (int i = 0; i < arr.length; i++) {

            if(ifEven(arr[i])){
                count++;

            }
        }
        System.out.println("Number of even digits: " + count);
    }

    static boolean ifEven(int num){
        int count = 0; 
        boolean even = false ; 

        if(num < 0){
           num =  num * -1;
        }

        if(num == 0){
            num =1 ;
        }

    while(num > 0){
        count++;
        num = num/10;
        
    }
    if (count%2 == 0){
        even = true ;
    }

    return even ; 

    }
    
}
