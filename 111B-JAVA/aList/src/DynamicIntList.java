
public class DynamicIntList extends SimpleIntList{
	
	public DynamicIntList(){
		super();
	}
	
	
	public void add(int value){
		if(elementCount >= data.length){
			doubleArrayCapacity();
		}
	}

	private void doubleArrayCapacity(){
		int[] newData = new int[data.length * 2];
		for (int i = 0; i <elementCount; i++){
			newData[i] = data[i];
		}
		data = newData;
		System.out.println("(data increased to" + data.length + ")");
	}
	
	
}
