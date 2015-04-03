/**
 * Created by Ramzes on 07.04.2015.
 * <p/>
 * psvm
 * sout
 */
public class Task1 {


	public static void main(String[] args) {
		// args from arguments from command line


		// default Values;
		//  square
		double S = 18;
		//perimetr
		double P = 18;
		// Discriminant
		double D;

		// get P
		if (args[0].length() != 0) {
				P = Integer.parseInt(args[0]);
		}
		// get S
		if (args[0].length() != 0) {
			S = Integer.parseInt(args[1]);
		}


		// sides of the rectangle
		// P  = 2(a+b); a+b = P/2; b = P/2-a
		// S  = a*b;  -a^2 + (a*p)/2 - S =0
		// D=b^2-4ac

		// Discriminant
		D = Math.pow((P / 2), 2) - 4 * S;

		if (D < 0) {
			System.out.println("Discriminant is less than 0, no solution");
			return;
		}

		double a = ((P / 2) + Math.sqrt(D)) / 2;
		double b = P / 2 - a;

		System.out.println("Side a= " + a + " Side b=" + b);

	}


}

