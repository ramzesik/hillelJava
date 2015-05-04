/**
 * Created by Ramzes on 03.05.2015.
 */
public abstract class MainSorter {

	/**
	 * Swap values in array by idx
	 *
	 * @param idxFrom first idx
	 * @param idxTo   second idx
	 */

	protected void swapArrayidx(double[] arrayToSort,int idxFrom, int idxTo) {
		double tmp = arrayToSort[idxFrom];
		arrayToSort[idxFrom] = arrayToSort[idxTo];
		arrayToSort[idxTo] = tmp;
	}


	/**
	 * keep it for print array sets
	 * @param arrayPrint
	 * @return
	 */
	public static String toString(double[] arrayPrint) {
		String result = "[";
		for (int i = 0; i < arrayPrint.length; i++) {
			result += arrayPrint[i];
			if (i + 1 < arrayPrint.length) {
				result += ", ";
			}
		}
		result += "]";
		return result;

	}


	public abstract void sort(double[] randomArray);



}
