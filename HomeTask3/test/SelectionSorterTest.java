import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Ramzes on 04.05.2015.
 */
public class SelectionSorterTest {
	@Test
	public void sortTest() {
		double[] arrayRandom = {0.1, 1, 0.5, 5.1, 1, 2, 3, 4, 5, 6, 22, 3.4,234,2,1.1,0.2,0.1,111111};
		double[] arrayExpected ={0.1, 0.1, 0.2, 0.5, 1.0, 1.0, 1.1, 2.0, 2.0, 3.0, 3.4, 4.0, 5.0, 5.1, 6.0, 22.0, 234.0, 111111.0};

		SelectionSorter selectionSorter = new SelectionSorter();
		selectionSorter.setArrayToSort(arrayRandom);
		selectionSorter.sort();

		System.out.println(selectionSorter.toString());
		System.out.println(Arrays.toString(arrayExpected));

		assertEquals(Arrays.toString(arrayExpected), selectionSorter.toString());

	}
}
