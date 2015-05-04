import java.util.Objects;

/**
 * Created by Ramzes on 29.04.2015.
 */
public class MyArraySort {


	private double[] arrayToSort;
	private double[] copyArrayToSort;



	public void setArrayToSort(double[] arrayToSort) {
		this.arrayToSort = arrayToSort;
		//make copy
		this.copyArrayToSort = arrayToSort;
	}

	public int getIndexOfMinElement(int start) {

		int minIndex=start;
		double minVal = arrayToSort[start];
		for (int z = start; z < arrayToSort.length-1; z++) {
			if (arrayToSort[z] < minVal) {
				minIndex = z;
				minVal = arrayToSort[z];
			}
		}
		return minIndex;

	}


	public void mySort() {

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



	public void mySortSelection() {
		//walk through array
		for (int z = 0; z < arrayToSort.length - 1; z++) {
			// find first min element
			int minIdx = getIndexOfMinElement(z);
			if (minIdx!=z) {
				swapArrayidx(z,minIdx);
			}
		}
	}

	/**
	 * Swap values in array by idx
	 * @param idxFrom first idx
	 * @param idxTo  second idx
	 */

	public void swapArrayidx (int idxFrom,int idxTo) {
		double tmp = arrayToSort[idxFrom];
		arrayToSort[idxFrom] = arrayToSort[idxTo];
		arrayToSort[idxTo] = tmp;
	}


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


	public int size() {
		return arrayToSort.length;
	}

}
