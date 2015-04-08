
public class FullNameTester {

	public static void main(String[] args) {
	    FullName f = new FullName();
	    FullName v = new FullName();
	    
	    
	    f.setFirst("Hellen");
	    f.setLast("Keller");
	    f.setMiddle('A');
	    
	    System.out.println(f.toString());
	    System.out.println(f.monogram());
	    
	}

}
