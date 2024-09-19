/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise08_MethodToOutputContentsOfIntArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = new int[] { 3, 5, 7, 9, 12 };

		printIntArrayToConsole(myArray);

	}

	/**
	 * This method outputs an integer array to the console
	 * @param array - inputed array from user
	 */
	public static void printIntArrayToConsole(int[] array) {
		System.out.println("Index\tValue");
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + "\t" + array[i]);
		}
	}
}