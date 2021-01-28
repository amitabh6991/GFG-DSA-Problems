import java.util.Scanner;

public class Boundary_Traversal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
		int r = scn.nextInt() ;// number of row
		int c = scn.nextInt() ;// number of colon
		//Initialize an 2d array
		int arr[][]  = new int[r][c] ;
		// take input of matrices in integer 
		for(int i = 0 ;i < r ;i++) {
			for(int  j = 0; j < c ; j++ ) {
				arr[i][j] = scn.nextInt() ;  
				}
			 }
		traversal(arr) ;

	}
	public static void traversal(int  mat[][]) {
		int  R =mat.length   ;
		int  C = mat[0].length  ;
		if(R == 1)
		{
			for(int i = 0; i < C; i++)
				System.out.print(mat[0][i] + " ");
		}
		else if(C == 1)
		{
			for(int i = 0; i < R; i++)
				System.out.print(mat[i][0] + " ");
		}
		else
		{
			for(int i = 0; i < C; i++)
				System.out.print(mat[0][i] + " ");
			for(int i = 1; i < R; i++)
				System.out.print(mat[i][C - 1] + " ");
			for(int i = C - 2; i >= 0; i--)
				System.out.print(mat[R - 1][i] + " ");
			for(int i = R - 2; i >= 1; i--)
				System.out.print(mat[i][0] + " ");
		}

		 
	}

}
