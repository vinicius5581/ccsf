public class Main {

    public static void main(String[] args) {
        //System.out.println(evenlyDivisible(0, 7)); // will return true
        System.out.println(isIsoceles(5, 5, 10)); //will return true
        System.out.println(isIsoceles(5, 10, 5)); // will return true
        System.out.println(isIsoceles(10, 5, 5)); // will return true
        System.out.println(isIsoceles(5, 5, 5)); // will return false
        System.out.println(isIsoceles(3, 4, 5)); // will return false

    }

    public static boolean isIsoceles(int x, int y, int z){

        boolean result;

        if ( ( x == y && y != z ) || ( x == z && y != z ) || ( y == z && y != x ) ){

            result = true;

        } else {

            result = false;

        }

        return result;

    }
}
