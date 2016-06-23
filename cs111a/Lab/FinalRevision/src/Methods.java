public class Methods {

    // public static {{return type}} {{method name}}({{parameters}}){
    //     function body
    //     return {{value of return type}};
    // }

    public static void main(String[] args) {
        // calling method
        methodVoid("Fernanda", 2);

        methodVoid("Vinicius", methodInt(3, 2));

        int goals = 10;
        int goals2 = methodInt(3, 2);

        System.out.println("goals "+ goals);
        System.out.println("goals2 "+ goals2);

    }

    // declaring method void - return no value
    public static void methodVoid(String x, int y){
        System.out.println("hello " + x + y);
    }

    // declaring method int - return an integer
    public static int methodInt(int n, int m){
        int a = n;
        int b = m;
        int x = a + b;
        return x;
    }

    // declaring method boolean - return a boolean
    public static boolean methodBoolean(){
        boolean x = true;
        return x;
    }

    // declaring method String - return a boolean
    public static String methodString(){
        return "Some String";
    }
}
