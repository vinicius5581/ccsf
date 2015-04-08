import java.util.ArrayList;


public class IntList2 {
	
	
	private int elementCount;
	private ArrayList<Integer> data;
	
	public IntList2(){
		elementCount = 0;
		data = new ArrayList<Integer>();
	}
	
	public void add(int value){
		data.add(value);
	}
	
	public int get(int index){
		return data.get(index);
	}
	
	public int size(){
		return data.size();
	}

}
