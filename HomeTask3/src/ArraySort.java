import java.util.Random;

/**
 * Created by Ramzes on 28.04.2015.
 */
public class ArraySort {

	public static void main(String[] args) {

		double[] arrayRandom = createRandomArray(10);



		BubbleSorter bubbleSorter = new BubbleSorter(arrayRandom);
		System.out.println(MainSorter.toString(arrayRandom));


		double[] sortedArray  = bubbleSorter.sort();
		System.out.println(bubbleSorter.toString());

		SelectionSorter selectionSorter = new SelectionSorter(arrayRandom);
		selectionSorter.sort();

		System.out.println(selectionSorter.toString());
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
