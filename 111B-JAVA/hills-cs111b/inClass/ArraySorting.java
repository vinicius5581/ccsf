
public class ArraySorting {
	public static void main(String[] args){
		int[] arrayTest = {12,5,6,9,8,7,3,654,1000,-2,18};
		//selectionSort(arrayTest);
		bubbleSort(arrayTest);
		
	}
	/**
	 * Selection Sort
	 * For each index (call it i)
	 * 		look trough (i+1) to the end (call it j)
	 * 			a[j]
	 * 		swipe i & indexOfSmallest
	 * @param arrayTest
	 */
	public static void selectionSort(int[] arrayTest){			
		for (int i = 0; i <  arrayTest.length - 1; i++ ){			
			int indexOfSmallest = i;			
			for(int j = i+1; j < arrayTest.length ; j++){
				if(arrayTest[j] < arrayTest[indexOfSmallest]){
					indexOfSmallest = j;
				}
			}	
			int swapTemp = arrayTest[i];
			arrayTest[i] = arrayTest[indexOfSmallest];
			arrayTest[indexOfSmallest] = swapTemp;
		}	
		
		for (int m = 0; m < arrayTest.length; m++){
			if (arrayTest[m]!=0){
				System.out.print(arrayTest[m]+" ");
			}
		}
	}
	
	
	/**
	 * Bubble Sort
	 * 
	 * swap neighbors through the array, over and over, 
	 * until a pass has no swaps
	 */
	public static void bubbleSort(int[] arrayTest){	
		boolean didSwap;
		do{
			didSwap = false;
			for(int i=0; i < arrayTest.length - 1; i++){
				if (arrayTest[i] > arrayTest[i+1]){
					int swapTemp = arrayTest[i];
					arrayTest[i] = arrayTest[i+1];
					arrayTest[i+1] = swapTemp;
					didSwap = true;
				}
			}
		}while (didSwap);
		
		for (int m = 0; m < arrayTest.length; m++){
			if (arrayTest[m]!=0){
				System.out.print(arrayTest[m]+" ");
			}
		}
	}
}
