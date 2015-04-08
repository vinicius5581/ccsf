
public class IntList extends SimpleIntList{
	

	private void doubleArrayCapacity(){
		int[] newData = new int[data.length * 2];
		for (int i = 0; i <elementCount; i++){
			newData[i] = data[i];
		}
		data = newData;
		System.out.println("(data increased to" + data.length + ")");
	}
	
	
}
