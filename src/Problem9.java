
/*
 * Emmet Stanevich
 * Problem 9
 * 10/3/17
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Problem9 {

	public static void main(String[] args) {
		DecimalFormat percent00dot00 = new DecimalFormat("00.00%");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("How many exercises to input?");
		int numExercises = input.nextInt();
		double score = 0;
		double totalScore = 0;
		double potentialScore = 0;
		double percentage;
		for (int i = 0; i < numExercises; i++) {
			System.out.println("Score received for exercise " + (i + 1) + ":");
			score = input.nextDouble();
			totalScore = totalScore + score;
			System.out.println("Total points possible for exercise " + (i + 1) + ":");
			potentialScore = potentialScore + input.nextDouble();
		}
		percentage = (totalScore / potentialScore);
		System.out.println("Your score is " + totalScore + " out of " + potentialScore + ", or "
				+ percent00dot00.format(percentage) + ".");
	}

}
