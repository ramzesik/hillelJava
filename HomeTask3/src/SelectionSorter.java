/**
 * Created by Ramzes on 03.05.2015.
 */
public class SelectionSorter extends MainSorter {


	public SelectionSorter() {
		super();
	}

	public SelectionSorter(double[] arrayToSort) {
		setArrayToSort(arrayToSort);
	}

	public double[] sort() {
		//walk through array
		for (int z = 0; z < arrayToSort.length - 1; z++) {
			// find first min element
			int minIdx = getIndexOfMinElement(z);
			if (minIdx != z) {
				swapArrayidx(z, minIdx);
			}
		}
		return arrayToSort;
	}

	/**
	 * getMin index elemnt
	 *
	 * @param start
	 * @return
	 */
	private int getIndexOfMinElement(int start) {

		int minIndex = start;
		double minVal = arrayToSort[start];
		for (int z = start; z < arrayToSort.length; z++) {
			if (arrayToSort[z] < minVal) {
				minIndex = z;
				minVal = arrayToSort[z];
			}
		}
		return minIndex;

	}

	// sort
	/**
	 * 	public void mySort() {

	 for (int z = 0; z < arrayToSort.length -1; z++) {
	 int minValIndex = z;
	 for (int y = z + 1; y < arrayToSort.length; y++) {
	 if (arrayToSort[y] < arrayToSort[minValIndex]) {
	 minValIndex = y;
	 }
	 }
	 // if index of min element change swap it
	 if (minValIndex != z) {
	 swapArrayidx(z,minValIndex);
	 }
	 }
	 }
	 */

}
