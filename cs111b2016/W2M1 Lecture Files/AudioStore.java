
public class AudioStore {


	public static void main(String[] args) {
		AudioItem song1;
		song1 = new AudioItem("Happy", 0.99, 180);
		
		AudioItem book1 = new AudioItem("Intro to Java", 59.99, 24000);
		
		song1.setPrice(1.20);
		System.out.println(song1.toString());
		
		System.out.println(book1); // equivalent of saying System.out.println(book1.toString());
	}

}
