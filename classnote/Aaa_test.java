
import java.util.Scanner;
public class Aaa_test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Aaa_test tr = new Aaa_test();

		System.out.println("Matrix:");
		int[][] m1 = readMatrix(s);

		int[][] transpose = tr.aa_test(m1);

		if (transpose == null) {
			System.out.println("Transpose of matrix is not possible");
		} else {
			System.out.println("Transpose of given matrices is:");
			for (int i = 0; i < transpose.length; i++) {
				int c = transpose[i].length;
				for (int j = 0; j < c; j++) {
					String spacer = j == c - 1 ? "\n" : " ";
					System.out.print(transpose[i][j] + spacer);
				}
			}
		}
	}
	
	public static int[][] readMatrix(Scanner s) {
		System.out.print("Enter number of rows: ");
		int r = s.nextInt();
		System.out.print("Enter number of columns: ");
		int c = s.nextInt();
		int[][] m = new int[r][c];
		System.out.println("Enter " + c + " numbers separated by space");
		for (int i = 0; i < r; i++) {
			System.out.print("Enter row " + (i + 1) + ": ");
			for (int j = 0; j < c; j++) {
				m[i][j] = s.nextInt();
			}
		}
		return m;
	}

    public int[][] aa_test(int[][] matrix1) {
		// Write the code
		int row = matrix1.length;
		int col = matrix1[0].length;
		
		int [][] trans = new int[col][row];
		
		for(int i=0;i<row;i++){ 
			for(int j=0;j<col;j++){
				trans[j][i] = matrix1[i][j];
			}
		}
		return trans;
	}
}
