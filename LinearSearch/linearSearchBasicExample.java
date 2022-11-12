package Arrays.LinearSearch;

public class linearSearchBasicExample {
    public static void main(String[] args) {
        String name = "Amandeep"; 
        char target = 'e';
        way2(name, target) ; 
        
    }

    static int linearSearch(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                System.out.println(target +" founnd at index "+i);
            }
        }
       return -1;
    }

    //WAY 1 :-
     
    static Boolean linearSearchofName(String str , char Target){
        if(str.length() == 0){
            return false  ; 
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Target){
                System.out.println("Found " + Target + " at index "+ i);
            }
        }

        return false ; 
    }

    static Boolean way2(String  name, char target){
        if(name.length() == 0 ){
            return false;
        }

        for(char ch : name.toCharArray()){
            if (ch == target){
                System.out.println("Found " + target + " at index "+ ch);
            }            
        }

        return false ; 
    }
}
