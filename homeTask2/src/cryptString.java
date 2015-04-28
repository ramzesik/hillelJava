/**
 * Created by Ramzes on 15.04.2015.
 * <p/>
 * have question can't use char ^ char = ret int
 * print not visible char bytes
 * line 84
 */



public class CryptString {

	public static void main(String[] args) {

		ProcessingParams processingParams = new ProcessingParams();
		// coding
		MyCrypt mycrypt = new MyCrypt(processingParams.getMessage(),processingParams.getKeyPhrase());


		if (mycrypt.getErrorMessage()!=null) {
			processingParams.showDialog("Error",mycrypt.getErrorMessage());
			System.exit(0);
		}

		processingParams.setCryptedMessage(mycrypt.getCoded());
		processingParams.showResult();
		System.out.println("Some coded"  + mycrypt.getCoded());

		processingParams.writeToFile();
	}




}
