/*
 * Emmet Stanevich
 * Problem 8
 * 10/3/17
 */
public class Problem8 {

	public static void main(String[] args) {
		double too = 0;
		double good = 1;
		int t;
		int o;
		int g;
		int d;
		cracker: for (t = 0; t <= 9; t++) {
			for (o = 0; o <= 9; o++) {
				if (o != t) {
					for (g = 0; g <= 9; g++) {
						if (g != t && g != o) {
							for (d = 0; d <= 9; d++) {
								if (d != t && d != o && d != g) {
									too = t * 100 + o * 10 + o;
									good = g * 1000 + o * 100 + o * 10 + d;
									if (too * 4 == good)
										break cracker;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(too + "+" + too + "+" + too + "+" + too + "=" + good);
	}

}
