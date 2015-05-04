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

	public void sort() {
		//walk through array

		for (int z = 0; z < arrayToSort.length - 1; z++) {
			// find first min element
			int minIdx = getIndexOfMinElement(z);
			if (minIdx != z) {
				swapArrayidx(z, minIdx);
			}
		}
	}
}
