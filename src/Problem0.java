/*
 * Emmet Stanevich
 * Problem 0
 * 10/03/17
 */
public class Problem0 {

	public static void main(String[] args) {
		int x = 8;
		int i = 2;
		boolean canDivide = false;
		while (i < x && x >= 2 && !canDivide) {
			if (x % i == 0) {
				canDivide = true;
				System.out.println(x + " is not a prime number");
			} else
				i++;
		}
		if (!canDivide) {
			System.out.println(x + " is a prime number");
		}
	}

}
