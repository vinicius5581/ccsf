import java.util.Arrays;

/**
 * Created by vinicius on 6/29/16.
 */
public class arraysFun {
    int[] scores;
    String[] names;
    Course[] catalog;

    arraysFun(){
        System.out.println("arraysFun object has been created");
    }




    public void lab() {
        names = new String[5];
        scores = new int[10];
        catalog = new Course[100];

        System.out.println("Array last item: " + catalog[catalog.length - 1]);
        System.out.println("Array length: " + catalog.length);
    }

    public static void lab2() {
        String[] names = new String[5];
        int[] scores = new int[10];
        Course[] catalog = new Course[100];

        System.out.println("aaa" + catalog[catalog.length - 1]);
    }

    public void storePrimeNumbers(){
        int[] primes = new int[4];
        primes[0] = 2;
        primes[1] = 3;
        primes[2] = 5;
        primes[3] = 7;
        System.out.println(Arrays.toString(primes));
        System.out.println(primes[0]);
        System.out.println(primes[primes.length - 1]);
    }

    public void storeNames(){
        String[] names = new String[3];
        names[0] = "Vinicius";
        names[1] = "Fernanda";
        names[2] = "Zette";
        System.out.println("names.length: " + names.length);
        System.out.println("names largest index: " + (names.length - 1));
        System.out.println(Arrays.toString(names));
        System.out.println(names[0]);
        System.out.println(names[names.length - 1]);
    }

    public void storeGradesLetters(){
        char[] gradesLetters = new char[5];
        gradesLetters[0] = 'A';
        gradesLetters[1] = 'B';
        gradesLetters[2] = 'C';
        gradesLetters[3] = 'D';
        gradesLetters[4] = 'E';
        System.out.println("gradesLetters.length: " + gradesLetters.length);
        System.out.println("gradesLetters largest index: " + (gradesLetters.length - 1));
        System.out.println(Arrays.toString(gradesLetters));
        System.out.println(gradesLetters[0]);
        System.out.println(gradesLetters[gradesLetters.length - 1]);
    }

    public void initializeCountArray(){
        int[] counts = {4, 6, 7};
        System.out.println(Arrays.toString(counts));
        System.out.println(counts.length);
        System.out.println(counts.length - 1);
    }

    public static void arrayStuff(){
        int[] nums = new int[10];
        for(int i=0; i<nums.length; i++)
            nums[i] = i*5;

        System.out.println("****************");

        for(int i=0; i<nums.length; i++)
            System.out.println(nums[i]);

        System.out.println("****************");

        for(int i=0; i<nums.length; i++)
            if(i%2==0) {
                nums[i] *=2;
            }

        System.out.println("****************");

        for(int i=0; i<nums.length; i++)
            System.out.println(nums[i]);

        System.out.println("****************");

        for(int num : nums)  {
            System.out.println(num);
        }

        System.out.println("****************");

        int count = 0;
        for(int num : nums)  {
            nums[count] = 0;
            count++;
        }

        System.out.println("****************");

        for(int num : nums)  {
            System.out.println(num);
        }


    }

    public static String test(){
        return "car";
    }
}
