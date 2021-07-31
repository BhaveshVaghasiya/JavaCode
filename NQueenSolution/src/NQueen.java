
public class NQueen {

	public static void main(String[] args) {
		int[][] chessBoard= {{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}};
		if(findNQueen(chessBoard, 0));
		printChessBoard(chessBoard);
	}

	private static void printChessBoard(int[][] chessBoard) {
		for(int i=0; i< chessBoard.length; i++) {
			for(int j=0; j< chessBoard[i].length; j++) {
				if(chessBoard[i][j] == 0) {
					System.out.print("0");
				} else {
					System.out.print("Q");
				}
			}
			System.out.println("");
		}
	}

	private static boolean findNQueen(int[][] chessBoard, int row) {
		if(row == chessBoard.length) {
			return true;
		}
		for(int col = 0; col< chessBoard.length; col++) {
			if(queenSafe(chessBoard, row, col)) {
				chessBoard[row][col] = 1;
				if(findNQueen(chessBoard, row+1))
					return true; 
				chessBoard[row][col] = 0;
			}
		}
		return false;
	}

	private static boolean queenSafe(int[][] chessBoard, int row, int col) {
		for(int i = row, j =col;i >= 0 ;i--) {
			if(chessBoard[i][j] == 1) 
				return false;
		}
		for(int i = row, j = col;i >= 0 && j>=0 ;i--, j--) {
			if(chessBoard[i][j] == 1) 
				return false;
		}
		for(int i = row, j =col;i >= 0 && j < chessBoard.length;i--, j++) {
			if(chessBoard[i][j] == 1) 
				return false;
		}
		return true;
	}

}
