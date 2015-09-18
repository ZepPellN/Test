
public class Sudoku_test {
	public static void main(String[] args) {
		Sudoku sudoku = new Sudoku();
//		sudoku.inputSudokuGame();
		sudoku.newSudokuGame(Sudoku.DifficultyLevel.HARD);
		
		if(sudoku.solveSudoku() == 0) {
			System.out.println("No solutions found!");
		}
		else {
			sudoku.printSudokuSolutions();			
		}
	}// end main
}
