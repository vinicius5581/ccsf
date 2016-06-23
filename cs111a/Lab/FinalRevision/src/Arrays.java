public class Arrays {
    //{{array type}} {{array name}}[] = new {{array type}}[{{array length}}]

    public static void main(String[] args){
        int x = 0;
        int y = 0;
        System.out.println("y: " + y + " x: " + x);
        x = 2;
        System.out.println("y: " + y + " x: " + x);
        y = x;
        System.out.println("y: " + y + " x: " + x);
        x = 3;
        System.out.println("y: " + y + " x: " + x);

        int myArrayX[] = new int[2];

        int myArrayY[] = {1, 2, 3, 4, 5};
        System.out.println("myArrayY[0]: " + myArrayY[0]);

        int myArrayW[] = myArrayY;
        System.out.println("myArrayY[0]: " + myArrayY[0]);
        System.out.println("myArrayW[0]: " + myArrayW[0]);

        myArrayY[0] = 5;  //{5, 2, 3, 4, 5};
        System.out.println("myArrayY[0]: " + myArrayY[0]);
        System.out.println("myArrayW[0]: " + myArrayW[0]);

        myArrayW[4] = 0;  //{5, 2, 3, 4, 0};
        System.out.println("myArrayY[4]: " + myArrayY[4]);
        System.out.println("myArrayW[4]: " + myArrayW[4]);

        for(int i = 0; i < myArrayW.length; i++){
            System.out.println(myArrayW[i] + 2);
            myArrayW[i] = myArrayW[i] + 2;
        }

        System.out.println("myArrayY[0]: " + myArrayY[0]);
        System.out.println("myArrayW[0]: " + myArrayW[0]);


    }
}
