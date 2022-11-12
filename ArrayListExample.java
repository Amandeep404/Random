package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Syntax
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
            
        }

        // one way to print

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)  + " "); // pass index here,... list[index] syntax will not work here
            
        }
        
        //other way to print

        System.out.println(list);
    }
    
}
 