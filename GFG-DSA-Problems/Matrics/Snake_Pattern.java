import java.util.Scanner;
public class Snake_Pattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();// number of row
		int c = scn.nextInt();// number of colon
		// Initialize an 2d array
		int arr[][] = new int[r][c];
		// take input of matrices in integer
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			// print even number of rows
			if (i % 2 == 0) {
				for (int j = 0; j < c; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();// for new line
			}
			// print odd number of rows in reverse order
			else {
				for (int j = c - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println(); // for new line
			}
		}
	}
}
