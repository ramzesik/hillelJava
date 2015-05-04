/**
 * Created by Ramzes on 03.05.2015.
 */
public abstract class MainSorter {

	/**
	 * array to sort
	 */
	protected double[] arrayToSort;


	/**
	 * Swap values in array by idx
	 *
	 * @param idxFrom first idx
	 * @param idxTo   second idx
	 */

	public void swapArrayidx(int idxFrom, int idxTo) {
		double tmp = arrayToSort[idxFrom];
		arrayToSort[idxFrom] = arrayToSort[idxTo];
		arrayToSort[idxTo] = tmp;
	}

	@Override
	public String toString() {
		String result = "[";
		for (int i = 0; i < size(); i++) {
			result += arrayToSort[i];
			if (i + 1 < size()) {
				result += ", ";
			}
		}
		result += "]";
		return result;

	}

	/**
	 * method to print array
	 *
	 * @param array
	 * @return String result
	 */
	public static String toString(double[] array) {
		String result = "[";
		for (int i = 0; i < array.length; i++) {
			result += array[i];
			if (i + 1 < array.length) {
				result += ", ";
			}
		}
		result += "]";
		return result;
	}


	public abstract void sort(double[] randomArray);

	private int size() {
		return arrayToSort.length;
	}

}
