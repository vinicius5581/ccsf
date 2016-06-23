/**
  * Demonstrates several Java array examples, including a
  * Java int array, and a Java String array.
  * Created by Alvin Alexander, <a href="http://alvinalexander.com" title="http://alvinalexander.com">http://alvinalexander.com</a>.
  */
public class JavaArrayExample {
    public static void main(String[] args){
        JavaArrayExample();
    }

    public static void JavaArrayExample(){
        intArrayExample();
        stringArrayExample();
        intArrayExample2();
    }

    /**
    * Create an int array, then populate the array,
    * and finally print each element in the int array.
    */
    private void intArrayExample(){
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        System.out.println("intArray output");
        for (int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    /**
    * Create a String array, then populate the array,
    * and finally print each element in the int array.
    */
    private void stringArrayExample(){
        String[] stringArray = new String[3];
        stringArray[0] = "a";
        stringArray[1] = "b";
        stringArray[2] = "c";
        System.out.println("stringArray output");
        for (int i=0; i<stringArray.length; i++){
            System.out.println(stringArray[i]);
        }
    }

    /**
    * Create a Java int array and populate it in one step.
    * Then get the array length and print each element in the array.
    */

    private void intArrayExample2(){
    int[] intArray = new int[] {4,5,6,7,8};
    System.out.println("intArray output (version 2)");
    for (int i=0; i<intArray.length; i++) {
       System.out.println(intArray[i]);
       }
    }
}
