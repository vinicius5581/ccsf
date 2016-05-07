/**
 * Created by vinicius on 3/4/16.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("rounding vs casting:");
        double aNumber = 5.7;
        System.out.println("aNumber: " + aNumber);

        int rounded = (int) Math.round(aNumber);
        System.out.println("Rounded aNumber: " + rounded);

        int castedNumber = (int) aNumber;
        System.out.println("Casted aNumber: " + castedNumber);

        System.out.println("==============");

        int n = 1729;
        System.out.println("Being n an integer: " + n);
        System.out.println("n % 10 is always the last digit of n: " + n % 10);

        System.out.println("This is always n without the last digit. " + n / 10);
        System.out.println("The last two digits of n. "+ n % 100);
        System.out.println("Because 10.0 is a  oating-point number, the fractional part is not discarded. " + n / 10.0);
        System.out.println("Because the  first argument is negative, the remainder is also negative. " + ( -(n) % 10));
        System.out.println("n % 2 is 0 if n is even, 1 or –1 if n is odd. " + n % 2);

        System.out.println("==============");
        System.out.println(" mathematical methods");

        int x = 9, y = 3;
        System.out.println("x: " + x + "\ny: " + y);

        System.out.println("Square root of x (≥ 0): " + Math.sqrt(x));
        System.out.println("xy (x > 0, or x = 0 and y > 0, or x < 0 and y is an integer): " + Math.pow(x, y));
        System.out.println(" Sine of x (x in radians): " + Math.sin(x));
        System.out.println("Cosine of x: " + Math.cos(x));
        System.out.println("Tangent of x: " + Math.tan(x));
        System.out.println("Convert x degrees to radians (i.e., returns x · π/180): " + Math.toRadians(x));
        System.out.println("Convert x radians to degrees (i.e., returns x · 180/π): " + Math.toDegrees(x));
        System.out.println("e^x: " + Math.exp(x));
        System.out.println("Natural log (ln(x), x > 0): " + Math.log(x));
        System.out.println("Decimal log (log10 (x), x > 0): " + Math.log10(x));
        System.out.println("Closest integer to x (as a long): " + Math.round(x));
        System.out.println("Absolute value | x |: " + Math.abs(x));
        System.out.println("The larger of x and y: " + Math.max(x, y));
        System.out.println("The smaller of x and y: " + Math.min(x, y));

        double price = 2;
        System.out.printf("%.3f\n", price);
        System.out.printf("%20.2f\n", price);


        int aValue = 24;
        System.out.printf("%d\n", aValue);
        System.out.printf("%5d\n", aValue);
        System.out.printf("aValue:%5d\n", aValue);


        float aFloat = 23;
        System.out.printf("%f\n", aFloat);
        System.out.printf("\n", aValue);
        System.out.printf("\n", aValue);
        System.out.printf("\n", aValue);
        System.out.printf("\n", aValue);
        System.out.printf("\n", aValue);


//        Characters inside a format string but outside a format speci er appear in the output.
//        "%f"
//        1.21997
//        Use f with a  oating-point number.
//        "%.2f"
//        1.22
//        Prints two digits after the decimal point.
//        "%7.2f"
//        1.22
//        Spaces are added so that the  eld width is 7.
//        "%s"
//        Hello
//        Use s with a string.
//        "%d %.2f"
//        24 1.22
//        You can format multiple values at once.


    }
}
