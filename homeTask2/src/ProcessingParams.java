import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Ramzes on 17.04.2015.
 */


public class ProcessingParams {


	public String getMessage() {
		return message;
	}

	public String getKeyPhrase() {
		return keyPhrase;
	}

	/**
	 * String to by crypted
	 */
	private String message;
	/**
	 * Code phrase
	 */
	private String keyPhrase;


	private String cryptedMessage;


	// constructor
	public ProcessingParams() {
		readData();
	}

	/**
	 * Method read input params
	 * message
	 */
	public void readData() {
		//get string
		message = JOptionPane.showInputDialog("Please enter message: ");
		//get coding
		while (keyPhrase == null || keyPhrase.isEmpty()) {
			keyPhrase = JOptionPane.showInputDialog("Please input key phrase: ", "Enter phrase");
			if (keyPhrase == null) {
				break;
			}
		}

		//check input data
		if (message == null || keyPhrase == null) {
			JOptionPane.showMessageDialog(
					new JFrame("Error message"),
					"Message or keyPhrase is null, exiting"
			);
			System.exit(0);
		}


	}


	public void showResult() {
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

		textArea.append("\n");
		textArea.append("Crypted Message=" + cryptedMessage);

		upperPanel.add(textArea);
		// prepare fit to textarea
		//frame.pack();
		// and show
		frame.setVisible(true);
	}

	/**
	 * Method to write coded data to file
	 */
	public void writeToFile() {
		try {

			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("crypt_data.txt", true)));
			writer.println(cryptedMessage);
			writer.println("------------");
			writer.close();
		} catch (IOException ex) {
			// report
			System.out.println("problem with file write" + ex);
			System.exit(0);
		}
	}


}
