/**
 * Created by Ramzes on 04.05.2015.
 */
public class InsertSorter extends MainSorter {


	public void sort(double[] arrayToSort) {
	int j;

		for (int i = 1; i < arrayToSort.length; i++) {
			// get second  value of array
			double value = arrayToSort[i];
			//cycle and compare with prevision element
			// if hey bigger, shift it
			for ( j = i - 1; j >= 0 && arrayToSort[j] > value; j--) {
				arrayToSort[j + 1] = arrayToSort[j];
			}
			//set min val
			arrayToSort[j + 1] = value;
		}
	}


}
