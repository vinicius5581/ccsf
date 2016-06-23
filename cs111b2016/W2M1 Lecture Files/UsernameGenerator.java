import java.util.*;

public class UsernameGenerator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstName = scan.nextLine();
		
		System.out.println("Enter your last name:");
		String lastName = scan.nextLine();
		
		String userName;
		
		userName = firstName.substring(0,1);
		
		int lastNameLength = lastName.length();
		if(lastNameLength >= 6) {
			userName = userName + lastName.substring(0,6);
		} else {
			userName = userName + lastName;
		}
		
		// 10 and 99 inclusive- that is 90 options to chose from
		Random generator = new Random();
		int randomNumber = generator.nextInt(90) + 10;
		
		userName = userName + randomNumber;
		
		userName = userName.toLowerCase();
		
		System.out.println("Your userName is " + userName);
	}

}
