import java.util.ArrayList;
/**
 * Created by vinicius on 6/29/16.
 *
 * add(Object obj) // adds to the end of the list
 * add(int index, Object obj) // adds at index
 * remove(int index) // removes the item at index
 * size() // returns the number of items in the list
 * get(int index) // returns the item at that position
 * contains(Object obj) // returns true/false
 */
public class arrayListFun {


    public void alfun(){
        ArrayList all = new ArrayList();
        ArrayList<String> names=  new ArrayList<String>();
        ArrayList<Integer> things = new ArrayList<>();
    }

    public static void arrayListInt(){
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(0);
        scores.add(1);
        scores.add(2);
        System.out.println(scores.size());
        scores.add((scores.size() - 1), 3);
        System.out.println(scores.size());
        System.out.println(scores);
        System.out.println(scores.get(3));
        System.out.println(scores.contains(3));

        for (int i = 1; i < 20; i++){
            scores.add(i);
        }

        System.out.println(scores);

        for (int i = 1; i < 20; i++){
            if(i % 2 == 0) {
                scores.add(i * 10);
            }
        }

        System.out.println(scores);

    }
}
