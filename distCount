import java.util.ArrayList;
import java.util.HashMap;

public class ExerciseOne {

/**
 * These methods count the distinct numbers in a given array. 
 * distinctsCount() method uses HashMap and stores the number of times a number consists in the
 * given array
 */

	public static void main(String[] args) {
		int[] array = { 4, 3, 2, 4 };
		// testing
		System.out.println(distCount(array));
		System.out.println(distinctsCount(array));

	}

	// this method is using ArrayList to count the distinct numbers in a given array
	
	static int distCount(int[] array) {

		// creating an ArrayList which will contain distinctNumbers
		ArrayList<Integer> arrDistincts = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			// if it doesn't contain it means the number is distinct
			if (!arrDistincts.contains(array[i])) {

				// we add it in the ArrayList
				arrDistincts.add(array[i]);
			}
		}

		// since we need only the count of the distinct numbers not more

		return arrDistincts.size();
	}
	// this method is using HashMap to count the distinct numbers the number of times a given element consists in the array
	
	static int distinctsCount(int[] array) {

		HashMap<Integer, Integer> distMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {
			// checking if the map contains the given number as a key
			if (distMap.containsKey(array[i])) {
				// if it contains the key we increment the value
				distMap.put(array[i], distMap.get(array[i]) + 1);
			} else {
				// if it doesn't contain the key we just add it with value 1
				distMap.put(array[i], 1);
			}

		}
		// checking the number of times a given element consists in the array
		System.out.println("how many times number 4 is in the array " + distMap.get(4));
		return distMap.size();
	}
}
