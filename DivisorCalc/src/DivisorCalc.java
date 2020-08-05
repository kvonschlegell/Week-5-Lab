
public class DivisorCalc {

	public static void main(String[] args) {
		int num1 = 18, num2 = 18, g;
		g = gcd(num1, num2);
		System.out.print(g);
	}

	public static int gcd(int num1, int num2) {

		// Modified provided algorithm to obtain answer
		if (num2 <= num1 && (num1 % num2) == 0) {
			return num2;
		}
		if (num1 < num2) {
			return gcd(num2, num1);
		}
		return gcd(num2, num1 % num2);

	}

}
