import java.util.Random;

/**
 * Created by Ramzes on 28.04.2015.
 */
public class ArraySort {

	public static void main(String[] args) {

		double[] firstArray = createRandomArray(10);


		MyArraySort myArraySort = new MyArraySort();
		myArraySort.setArrayToSort(firstArray);
		System.out.println(myArraySort.toString());
		//first sort


		myArraySort.mySort();
		System.out.println(myArraySort.toString());


		// revert array
		myArraySort.reverArray();


		myArraySort.mySortSelection();
		System.out.println(myArraySort.toString());

		// revert array
		myArraySort.reverArray();

		myArraySort.mySortBubble();
		System.out.println(myArraySort.toString());




	}


	/**
	 * Create random array
	 *
	 * @param arraySize
	 * @return
	 */
	public static double[] createRandomArray(int arraySize) {
		double[] randomArray = new double[arraySize];
		Random rand = new Random();

		for (int i = 0; i < arraySize; i++) {
			double tmp = rand.nextDouble() * 1000;
			// stange cast
			double rounded =  (double) (int)((tmp - (int) tmp) >= 0.5 ? tmp + 1 : tmp) / 1000;
			randomArray[i] = rounded;
		}



		return randomArray;
	}

}
