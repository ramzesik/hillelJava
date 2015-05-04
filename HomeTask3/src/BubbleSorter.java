/**
 * Created by Ramzes on 03.05.2015.
 */
public class BubbleSorter extends MainSorter {


	public BubbleSorter() {
		super();
	}


	public void sort(double[] randomArray) {
		arrayToSort = randomArray;
		for (int x = 0; x < arrayToSort.length - 1; x++) {

			for (int z = 0; z < arrayToSort.length - x - 1; z++) {
				if (arrayToSort[z] > arrayToSort[z + 1]) {
					swapArrayidx(z, z + 1);
				}
			}
		}
	}
}
