package returning;

import java.util.*;

public class RootSolver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the congruence class");
		int classNumber = input.nextInt();
		System.out.println("Enter the highest degree.");
		int highestDegree = input.nextInt();
		int[] array = new int[highestDegree + 1];
		for (int x = highestDegree; x > 0; x--) {
			if (x == 3) {
				System.out.println("Enter the coefficient of the " + x + "rd " + "factor.");
				int firstCoefficient = input.nextInt();
				array[x] = firstCoefficient;
			} else if (x == 1) {
				System.out.println("Enter the coefficient of the " + x + "st " + "factor.");
				int firstCoefficient = input.nextInt();
				array[x] = firstCoefficient;
			} else {
				System.out.println("Enter the coefficient of the " + x + "th " + "factor.");
				int firstCoefficient = input.nextInt();
				array[x] = firstCoefficient;
			}

		}
		
		for (int x = highestDegree; x > 0; x--) {
			System.out.print(array[x] + "x + ");
			
		}
	}

}
