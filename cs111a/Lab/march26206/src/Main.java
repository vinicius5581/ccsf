import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);

	String String_1 = "Vinicius";
    String String_2 = "Fernanda";

    System.out.println(String_1.compareTo(String_2)  == 0);
    System.out.println(String_1.equals(String_2));

        String test = myKeyboard.hasNextInt();
        System.out.println(test);

    }
}
