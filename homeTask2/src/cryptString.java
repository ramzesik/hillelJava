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
		inputData.readData();
		// crypt message
		inputData.cryptedMessage = myCrypt(inputData.message, inputData.keyPhrase);
		inputData.showResult();
		inputData.writeToFile();

	}

	// method to cryp or decrypt text
	public static String myCrypt(String message, String key) {

		//string =12345
		//key phrase =1234567890
		//Crypted Message=

		char[] messageChar = message.toCharArray();
		char[] keyChar = key.toCharArray();
		// new array with coded string
		char[] coded = new char[messageChar.length];

		// XOR every char
		for (int i = 0; messageChar.length > i; i++) {
			//(i % keyChar.length)  index what can't  more than keyChar.length
			try {
				coded[i] = (char) (messageChar[i] ^ keyChar[i % keyChar.length]);
				//messageChar[i] ^= keyChar[i % keyChar.length];
			} catch (ArithmeticException ex) {
				return "Can't code or decode, key phrase is null";
			}

		}


		return new String(coded);
	}


}
