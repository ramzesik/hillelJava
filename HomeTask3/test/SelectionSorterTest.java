import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Ramzes on 04.05.2015.
 */
public class SelectionSorterTest {
	@Test
	public  void sortTest() {
		double[] arrayRandom = {0.1, 1, 3.5, 5.1};
		Arrays.sort(arrayRandom);

		SelectionSorter selectionSorter = new SelectionSorter();
		selectionSorter.setArrayToSort(arrayRandom);
		selectionSorter.sort();
		System.out.println(selectionSorter.toString());

		assertEquals(Arrays.toString(arrayRandom), selectionSorter.toString());

	}
}
