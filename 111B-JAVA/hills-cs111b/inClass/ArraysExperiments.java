import java.util.*;

public class ArraysExperiments {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		Random random = new Random();		
		//prompt the user
		System.out.println("How many values? ");		
		//Read in the response
		int count = input.nextInt();		
		//Create the array reference
		//int a[];		
		//Create the array instance
		///int a[] = new int[count];		
		//loop trough each element in the array
		/*
		for (int i = 0; i < a.length; i++){
			a[i] = 1 + random.nextInt(100);
		}
		*/		
		int[] a = generateRandomArrayWithLength(count);
		
		for (int i=0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	
	public static int[] generateRandomArrayWithLength(int arrayLength){
		//return new int[arrayLength];
		Random random = new Random();			
		int[] r = new int[arrayLength];
		for (int i = 0; i < r.length; i++){
			r[i] = 1 + random.nextInt(100);
		}		
		return r;
	}
}

