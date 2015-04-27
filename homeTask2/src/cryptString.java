/**
 * Created by Ramzes on 15.04.2015.
 * <p/>
 * have question can't use char ^ char = ret int
 * print not visible char bytes
 * line 84
 */



public class cryptString {


	public static void main(String[] args) {

		ProcessingParams inputData = new ProcessingParams();

		// coding
		MyCrypt mycrypt = new MyCrypt(inputData.getMessage(),inputData.getKeyPhrase());


		System.out.println("Some coded"  + mycrypt.getCoded());




		inputData.showResult();
		inputData.writeToFile();
	}




}
