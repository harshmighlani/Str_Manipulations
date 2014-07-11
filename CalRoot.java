
public class CalRoot {

	public static void main(String[] args) {

		cubeRoot(27);
//		squareRoot(100);

	}

	public static float squareRoot(float x) {

		float x0 = 10,xn = 0;

		for(int i = 0; i < 5; i++) {
			// x0 - f(x)/f'(x)
			xn = x0 - ((x0 * x0) - x)/(2*x0);
			System.out.println(xn);
			x0 = xn;
		}

		return xn;

	}
	
	public static float cubeRoot(float x) {

		float x0 = 10,xn = 0;

		for(int i = 0; i < 5; i++) {
			xn = x0 - ((x0 * x0*x0) -x)/(3*(x0*x0));
			System.out.println(xn);
			x0 = xn;
		}

		return xn;

	}
}
