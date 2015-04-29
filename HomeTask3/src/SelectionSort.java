import java.util.Objects;

/**
 * Created by Ramzes on 29.04.2015.
 */
public class SelectionSort {


	private double[] arrayToSort;


	public void setArrayToSort(double[] arrayToSort) {
		this.arrayToSort = arrayToSort;
	}


	public int getIndexOfMinElement(int start) {

		int minIndex = 2;
		double minVal = arrayToSort[0];
		for (int z = start; z < arrayToSort.length; z++) {
			if (arrayToSort[z] < minVal) {
				minIndex = z;
				minVal = arrayToSort[z];
			}
		}
		return minIndex;

	}


	public void mySort() {

		double tmp;
		for (int z = 0; z < arrayToSort.length +1; z++) {
			int minValIndex = z;
			for (int y = z + 1; y < arrayToSort.length; y++) {
				if (arrayToSort[y] < arrayToSort[minValIndex]) {
					minValIndex = y;
				}

			}
			// if index of min element change swap it
			if (minValIndex != z) {
				tmp = arrayToSort[z];
				arrayToSort[z] = arrayToSort[minValIndex];
				arrayToSort[minValIndex] = tmp;
			}
		}
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
