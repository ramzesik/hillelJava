/**
 * Created by Ramzes on 27.04.2015.
 */
public class MyCrypt {


	/**
	 * Message to code or decode
	 */
	private String message;
	/**
	 * Key Code
	 */
	private String key;


	/**
	 * Result of coded
	 */
	private String coded;

	/**
	 * Error message
	 */
	private String errorMessage=null;

	/**
	 * Constructor
	 * @param message
	 * @param key
	 */

	public    MyCrypt(String message, String key) {
		codeString(message, key);

	}


	// method to cryp or decrypt text
	public  void codeString(String message, String key) {

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
				errorMessage =  "Can't code or decode, key phrase is null";
			}

		}
		this.coded = new String(coded);
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public String getCoded() {
		return coded;
	}

}
