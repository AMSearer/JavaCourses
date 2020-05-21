/**
 * 
 */

/**
 * @author amsea
 *
 */
public class SudokuChecker {

	/**
	 * @param args
	 */
	
	static boolean[] rowResult = new boolean[9];
	static boolean[] colResult = new boolean[9];
	static boolean[] cubeResult = new boolean[9];
	
	static int[][] sudokuGrid = 
		   {{1,8,4, 9,6,3, 7,2,5},
			{5,6,2, 7,4,8, 3,1,9},
			{3,9,7, 5,1,2 ,8,6,4},
			
			{2,3,9, 6,5,7, 1,4,8},
			{7,5,6, 1,8,4 ,2,9,3},
			{4,1,8, 2,3,9, 6,5,7},
			
			{9,4,1, 3,7,6, 5,8,2},
			{6,2,3, 8,9,5, 4,7,1},
			{8,7,5, 4,2,1, 9,3,6}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean testResult = allCheck();
		System.out.println(printBool(testResult));
		
	}
	
	private static boolean allCheck() {
		boolean result;

		
		// check all rows
		for (int row = 0; row <= 8; row++)
			rowResult[row] = rowCheck(row);

	
		// check all cols
		for (int col = 0; col <= 8; col++)
			colResult[col] = colCheck(col);
		
		
		// check all cubes
		
		int cubeCount = 0;  // counter to keep track of which cube we're checking
		// iterates through the top left indices of each 3x3 cube
		for (int row = 0; row <= 6; row += 3)
		{
			for ( int col = 0; col <= 6; col += 3)
			{
				cubeResult[cubeCount] = cubeCheck(row, col);
				cubeCount++;
			}				
		}
		
		result = (allTrue(rowResult) && allTrue(colResult) && allTrue(cubeResult));
		
		
		
		return result;
	}
	
	private static boolean rowCheck(int row) {
		boolean result = true;
		boolean[] rowTemp = new boolean[9]; // used to verify each each number is present in each row
		
		
		for (int i = 0; i <= 8; i ++)
		{
			int number = sudokuGrid[row][i]; // individual entry in the sudoku solution at row row
			
			// checks if the number has already been encountered
			if (rowTemp[number-1] == true)
				return false; // returns false if the number has been repeated, failing the test for this row
			else
				rowTemp[number-1] = true;  // updated rowTemp to show that a specific number has been encountered 
		}

		return result;
	}
	
	private static boolean colCheck(int col) {
		boolean result = true;
		boolean[] colTemp = new boolean[9]; // used to verify each number is present in each col

		for (int i = 0; i <= 8; i ++)
		{
			int number = sudokuGrid[i][col]; // individual entry in the sudoku solution at column col
			
			// checks if the number has already been encountered
			if (colTemp[number-1] == true)
				return false; // returns false if the number has been repeated, failing the test for this column
			else
				colTemp[number-1] = true; // updated colTemp to show that a specific number has been encountered 
							
		}
		
		return result;
	}
	
	private static boolean cubeCheck(int rowSt, int colSt) {
		boolean result = true;
		boolean[] cubeTemp = new boolean[9]; // used to verify each number is present in each cube

		// iterates through all the entries in a 3x3 cube whose top left index is rowSt, colSt
		for (int row = rowSt; row < (rowSt + 3); row ++)
		{
			for (int col = colSt; col < (colSt + 3); col++)
			{
				int number = sudokuGrid[row][col]; // individual entry in the sudoku solution at row, col in cube cubeCount
				
				if (cubeTemp[number-1] == true) // number has already been encountered
					return false;
				else
					cubeTemp[number-1] = true;  // updated cubeTemp to show that a specific number has been encountered
				
			}
		}
		
		return result;
	}
	
	
	private static String printBool(boolean bool) {
		String out;
		if (bool == true)
			out = "TRUE";
		else 
			out = "FALSE";
		return out;
	}
	
	private static boolean allTrue(boolean[] mult) {
		boolean result = true;
		
		for (int i= 0; i < mult.length; i++)
			result = (result && mult[i]);
		
		return result;
	}

}
