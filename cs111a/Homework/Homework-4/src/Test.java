/**
 * Created by vinicius on 4/23/16.
 */
public class Test {

    public static void main(String[] args){
        // sumOfSquares(2);
        loops(2);
    }


//    public static int sumOfSquares(int n){
//        int sum = 0;
//        for (int i = 1; i <= n; i++){
//            int n = i * i;
//            sum = sum + n;
//        }
//        return sum;
//    }

    public static int loops(int n){
        for (int i = 1; i <= n; i++){
            for (i = 1; i <= n; i++){
                System.out.print("Uha");
            }
        }
        return 5;
    }

}
