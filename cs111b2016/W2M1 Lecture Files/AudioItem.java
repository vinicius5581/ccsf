
public class AudioItem {

	// instance data variables
	private String title;
	private double price;
	private int numSeconds;
	
	// constructor
	public AudioItem(String theTitle, double thePrice, int theNumSeconds) {
		title = theTitle;
		price = thePrice;
		numSeconds = theNumSeconds;
	}
	
	// getters and setters
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	public int getNumSeconds() {
		return numSeconds;
	}
	
	public void setTitle(String theNewTitle) {
		title = theNewTitle;
	}
	public void setPrice(double theNewPrice) {
		price = theNewPrice;
	}
	public void setNumSeconds(int theNewNumSeconds) {
		if(theNewNumSeconds >= 0) {
			numSeconds = theNewNumSeconds;
		}
	}
	
	// text representation of an object
	public String toString() {
		String s = "Title: " + title;
		s += "\n\tPrice: $" + price;
		s += "\n\tDuration: " + numSeconds + " seconds";
		return s;
	}
	
	
	
	
	
	
}
