/*
 * Emmet Stanevich
 * Problem 100
 * 10/3/17
 */
public class Problem100 {

	public static void main(String[] args) {
		String s1 = "Hello, I go to EmU in yPSi and both of my parents went to eMu and EMu has a beautiful campus, not to mention that eMU is ClosE to My Home in YPSi.";
		String s2 = s1.toLowerCase();
		s2.indexOf("emu");
		while (s2.indexOf("emu") != (-1)) {
			s1 = s1.replaceAll((s1.substring(s2.indexOf("emu"), s2.indexOf("emu") + 3)), "Eastern Michigan University");
			s2 = s1.toLowerCase();
		}
		while (s2.indexOf("ypsi ") != (-1)) {
			s1 = s1.replaceAll((s1.substring(s2.indexOf("ypsi "), s2.indexOf("ypsi ") + 4)), "Ypsilanti");
			s2 = s1.toLowerCase();
			if (s2.indexOf("ypsi.") != (-1)) {
				s1 = s1.replaceAll((s1.substring(s2.indexOf("ypsi."), s2.indexOf("ypsi.") + 5)), "Ypsilanti.");
			}
		}
		System.out.println(s1);
	}

}
