package Arrays;

import java.util.*;

public class MultipleArratList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialising ArrayList otherwise "list" will be null
        for (int i = 0; i <3; i++) {
            list.add(new ArrayList<>());
        }
        
        // add elements to arrayList
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

    }
    
}
