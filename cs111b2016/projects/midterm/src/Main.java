import java.util.*;


/**
 *
 Write a complete method called findMin. The method:

 takes an int array as a parameter
 returns the smallest value in the array
 (You can assume that the array is filled to capacity and has at least one element in it.)
 */

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 20;
        nums[3] = 10;

        char[] grades = new char[];




//        findMin(nums);
//        System.out.println(findMin(nums));



    }



    public static String concatWords(String[] s){
        String stg = "";
        for(int i = 0; i < s.length; i++){
            stg += s[i];
        }
        return  stg;
    }

    public static boolean isNegative(int Numb1){
        return (Numb1 < 0) ? true : false ;
    }

    public static boolean isNegative(int Numb1, int Numb2){
        return (Numb1 < 0 && Numb2 < 0) ? true : false;
    }

    public static double calculate(int Numb1, int Numb2, int Numb3){
        return Math.sqrt(Math.pow(Numb2, 2) - (4 * (Numb1 * Numb3)));
    }
}
