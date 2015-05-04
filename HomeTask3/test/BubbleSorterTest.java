import org.junit.Test;

import java.util.*;

import static java.util.Collections.*;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ramzes on 04.05.2015.
 */
public class BubbleSorterTest {


	@Test
	public  void sortTest() {
		double[] arrayRandom = {0.1, 0.4, 3.5, 5.1};


		Arrays.sort(arrayRandom);

		BubbleSorter bubbleSorter = new BubbleSorter();
		bubbleSorter.setArrayToSort(arrayRandom);
		bubbleSorter.sort();
		System.out.println(bubbleSorter.toString());

		assertEquals(Arrays.toString(arrayRandom), bubbleSorter.toString());

	}


}
