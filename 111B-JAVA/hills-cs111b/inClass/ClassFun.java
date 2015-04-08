import java.util.*;

public class ClassFun {

	public static void main(String[] args){
		int[] a;
	    a = generate(3,7);
	    for(int i=0; i<a.length;i++){
	    	System.out.println(a[i]);
	    }
	    
	    char[] c = toCharArray("hello");
	    for(int i=0; i<c.length;i++){
	    	System.out.println(c[i]);
	    }
	   
	    int[] d = {2,22,-3,11};
	    int value = -3;
	    
	    if (contains(d,value)){
	    	System.out.println("d contains " + value);
	    }else{
	    	System.out.println("bummer");
	    }
	    
	    //int[] e = {22,22,3,4,5};
	    int[] e = {1,2,3,5,4};
	    
	    if(containsEqualNeighbors(e)){
	    	System.out.println("Yey");
	    }else{
	    	System.out.println("Nah");
	    }
	
	    int[] f = {1,2,3,4,5};
	    
	    Arrays.sort(f);
	    
	    if(hasEqualElements(f)){
	    	System.out.println("It has equal elements");
	    }else{
	    	System.out.println("It doesn't");
	    }
	}
	public static int[] generate(int arrayLength, int arrayValue){
		int[] a = new int[arrayLength];
		for(int i=0; i<a.length;i++){
			a[i] = arrayValue;
		}
		return a;
	}
    public static char[] toCharArray(String stringTest){
    	int stringSize = stringTest.length();
    	char[] a = new char[stringSize];
    	//char[]a = new char[s.length()];
    	
    	for(int i=0; i<a.length;i++){
    		a[i] = stringTest.charAt(i);
    	}
    	return a;
    }
    
    public static boolean contains(int[] a, int value){
    	for (int i=0; i < a.length; i++){
    		if (value == a[i]){
    			return true;    			
    		}
    	}
    	return false;
    }
    
    public static boolean containsEqualNeighbors(int[] a){
    	for (int i=0; i < (a.length - 1); i++){
    		if (a[i] == a[i+1]){
    			return true;
    		}
    	}
    	return false;
    }
    
    public static boolean hasEqualElements(int[] a){
    	//For each index
    	for (int i = 0; i< (a.length -1); i++){
    		//For each index j, from i... end of array
    		for (int j = i+1; j < a.length; j++){
    			//if they match, return true
    			if (a[i] == a[j]){
    				return true;
    			}
    		}
    	}
    	return false;
    }

}
