
public class Dice {
	
	private Die die1, die2;
	
	public Dice() {
		die1 = new Die();
		die2 = new Die();
	}
	
	public Die getDie1() {
		return die1;
	}
	public Die getDie2() {
		return die2;
	}
	
	public String toString() {
		String s = "Die 1 shows: " + die1.getFaceValue();
		s += "\nDie 2 shows: " + die2.getFaceValue();
		return s;
	}
	
	public void roll() {
		die1.roll();
		die2.roll();
	}

}
