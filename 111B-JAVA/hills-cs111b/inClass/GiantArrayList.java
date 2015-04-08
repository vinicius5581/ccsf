import java.util.ArrayList;


public class GiantArrayList {

	public static void main(String[] args){
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<String> s = new ArrayList<String>();
		
		x.add(22);
		x.add(33);
		x.add(999);
		
		s.add("hellow....");
		s.add("Race car!");
		s.add("Sandy Beach.");
		
		String temp = s.get(0);
		s.set(0, s.get(2));
		s.set(2,  temp);
		
		for (int i =0; i < s.size(); i++){
			System.out.println(s.get(i));
		}
	}
	
}
