/**
 * Created by Ramzes on 15.04.2015.
 *
 * have question can't use char ^ char = ret int
 * line 84
 */

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;


import java.awt.Point;
import java.awt.GraphicsEnvironment;


public class cryptString {


	public static void main(String[] args) {

		//get string
		String message = JOptionPane.showInputDialog("Please message: ");
		//get coding
		String keyPhrase = JOptionPane.showInputDialog("Please input key phrase: ");

		// title
		JFrame frame = new JFrame("Coded string");

		// get center
		Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		// frame width and height
		int windowWidth = 550;
		int windowHeight = 300;

		// set position and size
		frame.setBounds(center.x - windowWidth / 2, center.y - windowHeight / 2, windowWidth, windowHeight);
		// default close operation
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JPanel upperPanel = new JPanel();
		frame.getContentPane().add(upperPanel, "North");

		JTextArea textArea = new JTextArea(2, 20);

		// create border
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		//set border
		textArea.setBorder(border);

		textArea.setEditable(false);
		// add text
		textArea.append("string =" + message);
		textArea.append("\n");
		textArea.append("key phrase =" + keyPhrase);

		// crypt message
		String cryptedMessage = myCrypt(message, keyPhrase);

		textArea.append("\n");
		textArea.append("Crypted Message=" + cryptedMessage);

		upperPanel.add(textArea);
		// prepare fit to textarea
		//frame.pack();
		// and show
		frame.setVisible(true);


	}

	// method to cryp or decrypt text
	public static String myCrypt(String message, String key) {

		char[] messageChar = message.toCharArray();
		char[] keyChar = key.toCharArray();
		// new array with coded string
		byte[] coded = new byte[messageChar.length];

		// XOR every char
		for (int i = 0; messageChar.length > i; i++) {
			//(i % keyChar.length)  index what can't  more than keyChar.length
			try {
				coded[i] = (byte) (messageChar[i] ^ keyChar[i % keyChar.length]);
			} catch(ArithmeticException ex) {
				return "Can't code or decode, key phrase is null";
			}

		}
		// out some terrible things
		//System.out.println(coded.toString());
		// out byte[] to String
		//System.out.println(new String(coded));

		//convert bytes to String
		String crypted = new String(coded);
		return crypted;
	}


}
