import java.util.Random;

public class Die {

	private int faceValue;
	public int NUMBER_OF_SIDES = 6;
	
	// constructor
	public Die() {
		faceValue = 1;
	}
	
	// getter method
	public int getFaceValue() {
		return faceValue;
	}
	
	// setter method
	public void setFaceValue(int newFaceValue) {
		if(newFaceValue >= 1 && newFaceValue <= NUMBER_OF_SIDES) {
			faceValue = newFaceValue;
		} 
	}
	

	public String toString() {
		String s = "The die shows " + faceValue;
		
		return s;
	}
	
	
	public void roll() {
		Random generator = new Random();
		faceValue = generator.nextInt(NUMBER_OF_SIDES) + 1;
	}
	
	public void roll(int numTimes) {
		for(int i=1; i<=numTimes; i++) {
			roll();
		}
	}
	
	
	
	
	
	
	
	
	
	
}
