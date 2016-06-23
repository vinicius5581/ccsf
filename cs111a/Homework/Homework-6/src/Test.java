/**
 * Created by vinicius on 5/21/16.
 */
public class Test {

//    public static void countDown(int number, char symbol){
//
//        while(number >= 0){
//
//            System.out.print(number + "" + symbol);
//            number --;
//        }
//        System.out.print("\n");
//
//
//
//    }

    public static void countDown(int i, char c){
        do{
            System.out.print(i+""+c);
            i = i - 1;
        }while(i >= 0);
        System.out.print("\n");
    }
    public static void main(String[] args)
    {
        int[] a = new int[20];
        for(int i = 0; i <= 20; i++)
            a[i] = 0;
    }




}



