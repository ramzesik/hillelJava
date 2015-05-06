/**
 * Created by Ramzes on 03.05.2015.
 */
public class BubbleSorter implements Sorter {


	private Swaper swaper = new Swaper();


	public void sort(double[] arrayToSort) {

		for (int x = 0; x < arrayToSort.length - 1; x++) {

			for (int z = 0; z < arrayToSort.length - x - 1; z++) {
				if (arrayToSort[z] > arrayToSort[z + 1]) {
					swaper.swapArrayidx(arrayToSort, z, z + 1);
				}
			}
		}
	}
}
