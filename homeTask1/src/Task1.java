/**
 * Created by Ramzes on 07.04.2015.
 * <p/>
 * psvm
 * sout
 * doInBackground(String... params)
 */
public class Task1 {


	public static void main(String[] args) {

		// default Values;
		//  square
		double square = 18;
		//perimetr
		double perimirt = 18;
		// Discriminant
		double discr;

		// get args  from command line first is P second is S
		// get P
		if (args[0].length() != 0) {
			perimirt = Double.parseDouble(args[0]);

		}
		// get S
		if (args[0].length() != 0) {
			square = Double.parseDouble(args[1]);
		}


		// sides of the rectangle
		// P  = 2(a+b); a+b = P/2; b = P/2-a
		// S  = a*b;  -a^2 + (a*p)/2 - S =0
		// D=b^2-4ac

		// Discriminant
		discr = Math.pow((perimirt / 2), 2) - 4 * square;

		if (discr < 0) {
			System.out.println("Discriminant is less than 0, no solution");
			return;
		}

		double a = ((perimirt / 2) + Math.sqrt(discr)) / 2;
		double b = perimirt / 2 - a;

		System.out.println("Side a= " + a + " Side b=" + b);

	}


}

