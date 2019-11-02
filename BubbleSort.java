package returning;

import java.util.*;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 5, 2, 42, 4, 1};
		for (int x = 0; x < 5; x++) {
			System.out.println(array[x]);
		}
		System.out.println("this is the array before sorting");

		for (int i = (array.length - 1); i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int x = 0; x < 5; x++) {
			System.out.println(array[x]);
		}
		System.out.println("this is the array after sorting");

	}
}

