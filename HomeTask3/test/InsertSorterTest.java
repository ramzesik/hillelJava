import org.junit.Test;

import java.util.*;


import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by Ramzes on 04.05.2015.
 */


public class InsertSorterTest {

	@Test
	public void sortTest() {

		InsertSorter insertSortert = new InsertSorter();

		//double[] arrayRandom = {0.1, 1, 0.5, 5.1, 1, 2, 3, 4, 5, 6, 22, 3.4, 234, 2, 1.1, 0.2, 0.1, 111111};
		//double[] arrayExpected = {0.1, 0.1, 0.2, 0.5, 1.0, 1.0, 1.1, 2.0, 2.0, 3.0, 3.4, 4.0, 5.0, 5.1, 6.0, 22.0, 234.0, 111111.0};

		double[] arrayRandom = {7,2,4,3,8,1,2};
		double[] arrayExpected = {1,2,2,3,4,7,8};


		System.out.println(MainSorter.toString(arrayRandom));

		insertSortert.sort(arrayRandom);

		System.out.println(MainSorter.toString(arrayExpected));

		assertTrue(Arrays.equals(arrayExpected, arrayRandom)

		);
	}

}
