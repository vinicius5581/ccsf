
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntList x = new IntList();
		
		
		for (int i=0; i<100; i++){
			x.add(i);
		}
		
		if(x.contains(55)){
			System.out.println("x contains 55.");
		}
		
		
//		System.out.println(x.get(0));
//		System.out.println(x.get(1));
//		System.out.println(x.size());
		
//		for (int i=0; i < 1000000; i++){
//			x.add(i);
//		}
		
		for (int i=0; i< x.size();i++){
			System.out.println(x.get(i));
		}
		
		public static int sumOfElements(SimpleIntList list){
			int total = 0;
			for (int i = 0; i < list.size(); i++){
				total += list.get(i);
			}
			return total;
		}

	}

}
