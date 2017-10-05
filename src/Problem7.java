
/*
 * Emmet Stanevich
 * Problem 7
 * 10/3/17
 */
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		boolean repeat = false;
		Scanner keyboard = new Scanner(System.in);
		double x1;
		double x2 = 1;
		double n = 50;
		double n1 = 15;
		double n2;
		double n3 = 1;
		double n4 = 1;
		double n5 = 1;

		char again;
		String input;
		calculate: do {
			x1 = keyboard.nextDouble();

			x2 = 1;
			for (n1 = 1; n1 <= n; n1 = n1 + 1) {
				n3 = 1;
				for (n2 = 1; n2 <= n1; n2 = n2 + 1) {
					n3 = n3 * n2;
				}
				n5 = 1;
				for (n4 = 1; n4 <= n1; n4 = n4 + 1) {
					n5 = n5 * x1;
				}
				x2 = x2 + (n5 / n3);
			}
			System.out.println(x2);
			System.out.println("Again? Y/N");
			input = (keyboard.next()).toLowerCase();
			again = input.charAt(0);
			switch (again) {
			case 'y':
				repeat = true;
				break;
			case 'n':
				repeat = false;
				break calculate;
			default:
				repeat = false;
				System.out.println("Invalid input, please reset.");
				break calculate;
			}
		} while (repeat);
	}

}
