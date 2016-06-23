
public class Die {

	private int faceValue;
	public int NUMBER_OF_SIDES = 8;
	
	// constructor
	// this is a default constructor because it takes no parameters
	// job of the constructor is to set up objects by initializing instance data variables
	public Die() {
		faceValue = 1;
	}
	
	// also a constructor
	// this is NOT a default constructor because it has a parameter
	// if I include this non-default constructor, my class has NO default constructor
	//public Die(int initialFaceValue) {
		
	//}
	
	// getter method- sends the value of my instance data variable to an outside class
	public int getFaceValue() {
		return faceValue;
	}
	
	// setter method- updates the value of my instance data variable using the input parameter
	public void setFaceValue(int newFaceValue) {
		faceValue = newFaceValue;
	}
	
	// the toString method ALWAYS has this exact header
	// and it returns a text representation of my object
	// usually, this contains some of the instance data
	public String toString() {
		
		// s is a local variable because it's declared INSIDE of a method
		// it's visible and usable ONLY in this method- no where else
		// s is only stored as long as the method is running
		String s = "The die shows " + faceValue;
		
		return s;
	}
	
	
	public void roll() {
		faceValue++; // the same as saying faceValue = faceValue + 1;
		
		if(faceValue > NUMBER_OF_SIDES) {
			faceValue = faceValue % NUMBER_OF_SIDES;
		}
	}
	
	
	
	
	
	
	
	
	
	
}
