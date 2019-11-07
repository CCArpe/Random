
import java.util.*;
public class RootSolver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the congruence class");
		int classNumber = input.nextInt();
		System.out.println("Enter the highest degree.");
		int highestDegree = input.nextInt();
		int side = -1;
		int[] array = new int[highestDegree + 1];
		for (int x = highestDegree; x > 0; x--) {
			if (x == 3) {
				System.out.println("Enter the coefficient of the " + x + "rd " + "factor.");
				int firstCoefficient = input.nextInt();
				array[x] = firstCoefficient;
			} else if (x == 2) {
				System.out.println("Enter the coefficient of the " + x + "nd " + "factor.");
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
		System.out.println("Enter the constant");
		int constant = input.nextInt();
		array[0] = constant;
		System.out.println("Here is your polynomial");
		for (int x = highestDegree; x > 0; x--) {
			System.out.print(array[x] + "x" + "^" + x + " + ");
		}
		System.out.println(constant);
		System.out.println("These are the roots of the polynomial you entered:");

		System.out.println("x | f(x)");
		System.out.println("_______");

		for (int x = 0; x < classNumber; x++) {
			System.out.println(x + "   |   " + checkRoot(highestDegree, array, x, constant, classNumber));
		}
	}

	static int checkRoot(int x, int y[], int z, int cons, int mods) {
		int total = 0;
		for (int i = x; i >= 0; i--) {

			total += (y[i] * Math.pow(z, (i)));
		}
		total = total + cons;
		total = total - 1;
		int result = total % mods;
		return result;
	}
}

